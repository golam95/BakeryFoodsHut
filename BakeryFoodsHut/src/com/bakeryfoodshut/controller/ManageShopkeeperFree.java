package com.bakeryfoodshut.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import com.bakeryfoodshut.model.BFHMessage;
import com.bakeryfoodshut.model.Bakerymade;
import com.bakeryfoodshut.model.Homemade;
import com.bakeryfoodshut.model.ManageQuantity;
import com.bakeryfoodshut.model.ManageprofileInfo;
import com.bakeryfoodshut.model.Post;
import com.bakeryfoodshut.model.ShopkeeperMessage;
import com.bakeryfoodshut.serviceImpl.BFHMessageServiceImpl;
import com.bakeryfoodshut.serviceImpl.BakerymadeServiceImpl;
import com.bakeryfoodshut.serviceImpl.HomemadeServiceImpl;
import com.bakeryfoodshut.serviceImpl.ManageStaticesServiceImpl;
import com.bakeryfoodshut.serviceImpl.ManageprofileInfoServiceImpl;
import com.bakeryfoodshut.serviceImpl.PostServiceImpl;
import com.bakeryfoodshut.serviceImpl.ShopkeeperMessageServiceImpl;
import com.bakeryfoodshut.utils.Formate;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
		maxFileSize = 1024 * 1024 * 50, // 50 MB
		maxRequestSize = 1024 * 1024 * 100) // 100 MB
@WebServlet("/ManageShopkeeperFree")
public class ManageShopkeeperFree extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Formate formate = new Formate();
	ManageprofileInfoServiceImpl manageprofileinfo = new ManageprofileInfoServiceImpl();
	ManageStaticesServiceImpl managestatices = new ManageStaticesServiceImpl();
	HomemadeServiceImpl homemadeservice = new HomemadeServiceImpl();
	BakerymadeServiceImpl bakerymadeservice = new BakerymadeServiceImpl();
	PostServiceImpl postservice = new PostServiceImpl();
	ShopkeeperMessageServiceImpl shopkeepermessage = new ShopkeeperMessageServiceImpl();
	BFHMessageServiceImpl messageservice = new BFHMessageServiceImpl();
	private String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
	private static final String UPLOAD_POST = "uploads/post";
	private static final String UPLOAD_PROFILEIMG = "uploads/profileimg";

	public ManageShopkeeperFree() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String getpostId = request.getParameter("deletePOST");
		String getMessageId = request.getParameter("deleteMessage");
		String updateStatus = request.getParameter("changemessagerole");
		String url = "";

		if (getpostId != null) {
			postservice.deletePost(Integer.parseInt(getpostId));
			url = "./shopkeeperfree/freepackageViewpost.jsp";
		} else if (getMessageId != null) {
			shopkeepermessage.deleteShopkeeperMessage(Integer.parseInt(getMessageId));
			url = "./shopkeeperfree/freepackageViewmessage.jsp";
		} else if (updateStatus != null) {
			shopkeepermessage.updateShopkeeperMessage(new ShopkeeperMessage("1", Integer.parseInt(updateStatus)));
			url = "./shopkeeperfree/freepackageViewmessage.jsp";
		}
		response.sendRedirect(url);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		if (action.equals("ADD_PROFILEINFO")) {
			String useremail = request.getParameter("useremail");
			String website = request.getParameter("website");
			String openshop = request.getParameter("openshop");
			String closeshop = request.getParameter("closeshop");
			String products = request.getParameter("products");
			String branch = request.getParameter("branch");
			String policy = request.getParameter("policy");
			String vacation = request.getParameter("vacation");

			String error = "";
			if (useremail.equals("") || openshop.equals("") || closeshop.equals("") || products.equals("")
					|| policy.equals("")||website.equals("")||branch.equals("")) {
				error += "Field must not be empty!";

			} else {

				

				String applicationPath = request.getServletContext().getRealPath("");
				String uploadFilePath = applicationPath + File.separator + UPLOAD_PROFILEIMG;
				File fileSaveDir = new File(uploadFilePath);
				if (!fileSaveDir.exists()) {
					fileSaveDir.mkdirs();
				}
				String fileName = null;
				for (Part part : request.getParts()) {
					fileName = getFileName(part);
					fileName = new File(fileName).getName();
					String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
					fileName = timeStamp + ".jpg";
					part.write(uploadFilePath + File.separator + fileName);
				}
				manageprofileinfo.addManageprofileInfo(new ManageprofileInfo(0, useremail, website, openshop, closeshop,
						branch, policy, products, date, vacation, fileName));
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperfree/updateprofileInfo.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperfree/freepackagedashboard.jsp");
			}

		} else if (action.equals("ADD_QUANTITY")) {
			String useremail = request.getParameter("useremail");
			String quantity = request.getParameter("quantityname");
			String error = "";
			String success = "";
			if (useremail.equals("") || quantity.equals("")) {
				error += "Field must not be empty!";
			} else if (formate.checkNumbervalidator(quantity)) {
				error += "Invalid quantity number!!";
			} else {
				if (managestatices.checkQuantity(useremail)) {
					error += "Quantity already exit!!";
				} else {
					managestatices.addQuantityInfo(new ManageQuantity(0, useremail, Integer.parseInt(quantity), date));
					success += "Quantity added!!";
				}
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperfree/freepackageaddQuantity.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperfree/freepackageaddQuantity.jsp?success=" + success);
			}

		} else if (action.equals("UPDATE_QUANTITY")) {

			String quantity = request.getParameter("quantityname");
			String useremail = request.getParameter("useremail");
			String error = "";
			String success = "";
			if (quantity.equals("")) {
				error += "Field must not be empty!";
			} else if (formate.checkNumbervalidator(quantity)) {
				error += "Invalid quantity number!";
			} else {
				managestatices.updateQuantity(new ManageQuantity(Integer.parseInt(quantity), date, useremail));
				success += "Succesfully quantity is updaded!!";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperfree/freepackageUpdatequantity.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperfree/freepackageUpdatequantity.jsp?success=" + success);
			}

		} else if (action.equals("UPDATE_PROFILEFREE")) {
			String useremail = request.getParameter("useremail");
			String username = request.getParameter("username");
			String userpassword = request.getParameter("userpassword");
			String error = "";
			String success = "";
			if (username.equals("") || userpassword.equals("")) {
				error += "Field must not be empty!";
			} else {
				homemadeservice.updateHomemade(new Homemade(username, userpassword, useremail));
				success += "Successfully update your information!!";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperfree/profileupdate.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperfree/profileupdate.jsp?success=" + success);
			}

		} else if (action.equals("UPDATE_PROFILEFREE_2")) {
			String useremail = request.getParameter("useremail");
			String username = request.getParameter("username");
			String userpassword = request.getParameter("userpassword");
			String error = "";
			String success = "";
			if (username.equals("") || userpassword.equals("")) {
				error += "Field must not be empty!";
			} else {
				bakerymadeservice.updateBakerymade(new Bakerymade(username, userpassword, useremail));
				success += "Successfully update your information!!";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperfree/profileupdate.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperfree/profileupdate.jsp?success=" + success);
			}
		} else if (action.equals("UPDATE_PROFILEINFO")) {

			String useremail = request.getParameter("useremail");
			String website = request.getParameter("website");
			String openshop = request.getParameter("openshop");
			String closeshop = request.getParameter("closeshop");
			String products = request.getParameter("products");
			String branch = request.getParameter("branch");
			String policy = request.getParameter("policy");
			String error = "";
			String success = "";
			if (useremail.equals("") || website.equals("") || openshop.equals("") || closeshop.equals("")
					|| products.equals("") || branch.equals("") || policy.equals("")) {
				error += "Field must not be empty!";
			} else {
				manageprofileinfo.updateManageprofileInfo(
						new ManageprofileInfo(website, openshop, closeshop, branch, policy, products, date, useremail));
				success += "Successfully update your information!!";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperfree/freepackageProfilesettings.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperfree/freepackageProfilesettings.jsp?success=" + success);
			}

		} else if (action.equals("ADD_POST")) {
			String useremail = request.getParameter("useremail");
			String district = request.getParameter("district");
			String selectarea = request.getParameter("selectarea");
			String consumer = request.getParameter("consumer");
			String productname = request.getParameter("productname");
			String productquantity = request.getParameter("productquantity");
			String weighttype = request.getParameter("weighttype");
			String discount = request.getParameter("discount");
			String description = request.getParameter("description");
			String productPrice = request.getParameter("productprice");
			String categoryproduct = request.getParameter("category");

			String error = "";
			String success = "";
			if (useremail.equals("") || district.equals("") || selectarea.equals("") || consumer.equals("")
					|| productname.equals("") || productquantity.equals("") || weighttype.equals("")
					|| discount.equals("") || description.equals("") || productPrice.equals("")
					|| categoryproduct.equals("")) {
				error += "Field must not be empty!!";

			} else {
				String applicationPath = request.getServletContext().getRealPath("");
				String uploadFilePath = applicationPath + File.separator + UPLOAD_POST;
				File fileSaveDir = new File(uploadFilePath);
				if (!fileSaveDir.exists()) {
					fileSaveDir.mkdirs();
				}
				String fileName = null;
				for (Part part : request.getParts()) {
					fileName = getFileName(part);
					fileName = new File(fileName).getName();
					String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
					fileName = timeStamp + ".jpg";
					part.write(uploadFilePath + File.separator + fileName);
				}

				String pricetype = "";
				if (Integer.parseInt(productPrice) >= 7 && Integer.parseInt(productPrice) <= 500) {
					pricetype = "Low price";
				} else {
					pricetype = "High price";
				}
				postservice.addPost(new Post(0, useremail, productname, Integer.parseInt(productquantity), weighttype,
						discount, description, consumer, date, fileName, district, selectarea, productPrice,
						categoryproduct, pricetype));
				success += "Successfully added your post!!!";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperfree/freepackageAddpost.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperfree/freepackageAddpost.jsp?success=" + success);
			}

		} else if (action.equals("UPDATE_POST")) {
			String useremail = request.getParameter("useremail");
			String productname = request.getParameter("productname");
			String productquantity = request.getParameter("productquantity");
			String weighttype = request.getParameter("weighttype");
			String discount = request.getParameter("discount");
			String description = request.getParameter("description");
			String consumer = request.getParameter("consumer");
			String district = request.getParameter("district");
			String selectarea = request.getParameter("selectarea");
			String productprice = request.getParameter("productprice");
			postservice.updatePostInfo(new Post(productname, Integer.parseInt(productquantity), weighttype, discount,
					description, consumer, date, district, selectarea, productprice, Integer.parseInt(useremail)));

		} else if (action.equalsIgnoreCase("BFH_SENDMESSAGE")) {
			String useremail = request.getParameter("useremail");
			String comment = request.getParameter("comment");
			if (useremail != null || comment != null) {
				messageservice.sendMessage(new BFHMessage(0, useremail, comment, date));
			}

		} else {
			System.out.println("Not working");
		}
	}

	private String getFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] tokens = contentDisp.split(";");
		for (String token : tokens) {
			if (token.trim().startsWith("fileName")) {
				return token.substring(token.indexOf("=") + 2, token.length() - 1);
			}
		}
		return "";
	}

}
