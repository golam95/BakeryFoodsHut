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
import com.bakeryfoodshut.model.BakeryOwners;
import com.bakeryfoodshut.model.Bakerymade;
import com.bakeryfoodshut.model.EmployeeInfo;
import com.bakeryfoodshut.model.Homemade;
import com.bakeryfoodshut.model.LocalStore;
import com.bakeryfoodshut.model.ManageQuantity;
import com.bakeryfoodshut.model.ManageprofileInfo;
import com.bakeryfoodshut.model.OfflineOrder;
import com.bakeryfoodshut.model.Orderconfirm;
import com.bakeryfoodshut.model.Post;
import com.bakeryfoodshut.model.Registration;
import com.bakeryfoodshut.model.ShopkeeperMessage;
import com.bakeryfoodshut.model.VanDetails;
import com.bakeryfoodshut.model.Storehouse;
import com.bakeryfoodshut.serviceImpl.BFHMessageServiceImpl;
import com.bakeryfoodshut.serviceImpl.BakeryOwnersServiceImpl;
import com.bakeryfoodshut.serviceImpl.BakerymadeServiceImpl;
import com.bakeryfoodshut.serviceImpl.EmployeeServiceImpl;
import com.bakeryfoodshut.serviceImpl.HomemadeServiceImpl;
import com.bakeryfoodshut.serviceImpl.LocalStoreServiceImpl;
import com.bakeryfoodshut.serviceImpl.ManageStaticesServiceImpl;
import com.bakeryfoodshut.serviceImpl.ManageprofileInfoServiceImpl;
import com.bakeryfoodshut.serviceImpl.OfflineorderServiceImpl;
import com.bakeryfoodshut.serviceImpl.OrderconfirmServiceImpl;
import com.bakeryfoodshut.serviceImpl.PostServiceImpl;
import com.bakeryfoodshut.serviceImpl.ShopkeeperMessageServiceImpl;
import com.bakeryfoodshut.serviceImpl.VanServiceImpl;
import com.bakeryfoodshut.serviceImpl.WarehouseServiceImpl;
import com.bakeryfoodshut.utils.Formate;
import com.bakeryfoodshut.utils.SendEmail;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
		maxFileSize = 1024 * 1024 * 50, // 50 MB
		maxRequestSize = 1024 * 1024 * 100) // 100 MB
@WebServlet("/ManageShopkeeperPaid")
public class ManageShopkeeperPaid extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Formate formate = new Formate();
	ManageprofileInfoServiceImpl manageprofileinfo = new ManageprofileInfoServiceImpl();
	ManageStaticesServiceImpl managestatices = new ManageStaticesServiceImpl();
	HomemadeServiceImpl homemadeservice = new HomemadeServiceImpl();
	BakerymadeServiceImpl bakerymadeservice = new BakerymadeServiceImpl();
	PostServiceImpl postservice = new PostServiceImpl();
	ShopkeeperMessageServiceImpl shopkeepermessage = new ShopkeeperMessageServiceImpl();
	BFHMessageServiceImpl messageservice = new BFHMessageServiceImpl();
	VanServiceImpl vanservice = new VanServiceImpl();
	EmployeeServiceImpl employeeservice = new EmployeeServiceImpl();
	WarehouseServiceImpl warehouseservice = new WarehouseServiceImpl();
	OfflineorderServiceImpl offlineorerservice = new OfflineorderServiceImpl();
	OrderconfirmServiceImpl orderconfirmservice = new OrderconfirmServiceImpl();
	BakeryOwnersServiceImpl bakeryownerserice = new BakeryOwnersServiceImpl();
	private String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
	private static final String UPLOAD_POST = "uploads/post";
	private static final String UPLOAD_PROFILEIMG = "uploads/profileimg";
	LocalStoreServiceImpl lcoalservice = new LocalStoreServiceImpl();

	public ManageShopkeeperPaid() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String getpostId = request.getParameter("deletePOST");
		String getMessageId = request.getParameter("deleteMessage");
		String updateStatus = request.getParameter("changemessagerole");
		String vanPost = request.getParameter("deleteVanPOST");
		String UpdateEmpPOST = request.getParameter("UpdateEmpPOST");
		String deleteWarehousePOST = request.getParameter("deleteWarehousePOST");

		String Updateorderconfirm = request.getParameter("Updateorderconfirm");

		String deleteorderconfirm = request.getParameter("deleteorderconfirm");
		String deletelocalPOST = request.getParameter("deletelocalPOST");

		String url = "";

		if (getpostId != null) {
			postservice.deletePost(Integer.parseInt(getpostId));
			url = "./shopkeeperpaid/paidpackageViewpost.jsp";
		} else if (getMessageId != null) {
			shopkeepermessage.deleteShopkeeperMessage(Integer.parseInt(getMessageId));
			url = "./shopkeeperpaid/paidpackageViewmessage.jsp";
		} else if (updateStatus != null) {
			shopkeepermessage.updateShopkeeperMessage(new ShopkeeperMessage("1", Integer.parseInt(updateStatus)));
			url = "./shopkeeperpaid/paidpackageViewmessage.jsp";
		} else if (vanPost != null) {
			vanservice.deleteVanDetails(Integer.parseInt(vanPost));
			url = "./shopkeeperpaid/paidpackageViewvandetails.jsp";
		} else if (UpdateEmpPOST != null) {
			employeeservice.updateEmployee(new EmployeeInfo("0", Integer.parseInt(UpdateEmpPOST)));
			url = "./shopkeeperpaid/paidpackageViewemployee.jsp";
		} else if (deleteWarehousePOST != null) {
			warehouseservice.deleteWarehouseDetails(Integer.parseInt(deleteWarehousePOST));
			url = "./shopkeeperpaid/paidpackageViewwarehouse.jsp";
		} else if (Updateorderconfirm != null) {
			orderconfirmservice.updateOrderconfirm(new Orderconfirm("available", Integer.parseInt(Updateorderconfirm)));
			url = "./shopkeeperpaid/paidpackageVieworderconfirm.jsp";

		} else if (deleteorderconfirm != null) {
			orderconfirmservice.deleteConfirmorder(Integer.parseInt(deleteorderconfirm));
			url = "./shopkeeperpaid/paidpackageVieworderconfirm.jsp";

		} else if (deletelocalPOST != null) {
			lcoalservice.deletelocalorder(Integer.parseInt(deletelocalPOST));
			url = "./shopkeeperpaid/paidpackageViewLocalstore.jsp";
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
					|| policy.equals("") || website.equals("") || branch.equals("")) {
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
				response.sendRedirect("./shopkeeperpaid/paidpackageupdateprofile.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageDashboard.jsp");
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
				response.sendRedirect("./shopkeeperpaid/paidpackageAddquantity.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageAddquantity.jsp?success=" + success);
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
				response.sendRedirect("./shopkeeperpaid/paidpackageUpdatequantity.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageUpdatequantity.jsp?success=" + success);
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
				response.sendRedirect("./shopkeeperpaid/paidpackageMyprofile.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageMyprofile.jsp?success=" + success);
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
				response.sendRedirect("./shopkeeperpaid/paidpackageMyprofile.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageMyprofile.jsp?success=" + success);
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
				response.sendRedirect("./shopkeeperpaid/paidpackageProfilesetting.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageProfilesetting.jsp?success=" + success);
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
				response.sendRedirect("./shopkeeperpaid/paidpackageAddpost.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageAddpost.jsp?success=" + success);
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

		} else if (action.equalsIgnoreCase("ADDVAN")) {

			String licence = request.getParameter("licence");
			String price = request.getParameter("price");
			String description = request.getParameter("description");
			String sessionname = request.getParameter("sessionname");
			String error = "";
			String success = "";
			if (formate.checkNumbervalidator(price)) {
				error += "Invalid price field";
			} else if (formate.checkSpecialcharacter(price)) {
				error += "Invalid price field";
			} else {
				vanservice.addVan(new VanDetails(0, licence, description, price, date, sessionname));
				success += "Add van details";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperpaid/paidpackageaddVandetails.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageaddVandetails.jsp?success=" + success);
			}

		} else if (action.equalsIgnoreCase("ADDEMP")) {

			String sessionname = request.getParameter("sessionname");
			String empname = request.getParameter("empname");
			String empdeg = request.getParameter("empdeg");
			String empaddress = request.getParameter("empaddress");
			String gender = request.getParameter("gender");
			String empnid = request.getParameter("empnid");
			String empcontact = request.getParameter("empcontact");
			String error = "";
			String success = "";
			if (empname.equals("") || empaddress.equals("") || gender.equals("") || empnid.equals("")
					|| empcontact.equals("")) {
				error += "Field must not be empty!!";
			} else if (formate.checkContactNo(empcontact) == false) {
				error += "Invalid contact number!!";
			} else if (formate.checkNID(empnid) == false) {
				error += "Invalid NID!!";
			} else if (formate.checkNumbervalidator(empnid)) {
				error += "Invalid NID!!";
			} else if (formate.checkSpecialcharacter(empnid)) {
				error += "Invalid NID!!";
			} else {
				employeeservice.addEmployee(new EmployeeInfo(0, empname, empdeg, empaddress, gender, empnid, empcontact,
						date, "1", sessionname));
				success += "Add employee info!!";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperpaid/paidpackageaddEmp.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageaddEmp.jsp?success=" + success);
			}

		} else if (action.equalsIgnoreCase("ADDWAREHOUSE")) {

			String sessionname = request.getParameter("sessionname");
			String description = request.getParameter("description");
			String month = request.getParameter("month");
			String year = request.getParameter("year");
			String price = request.getParameter("price");

			String error = "";
			String success = "";
			if (description.equals("") || month.equals("") || year.equals("") || price.equals("")) {
				error += "Field must not empty";

			} else if (formate.checkNumbervalidator(price)) {
				error += "Invalid price!!";
			} else if (formate.checkSpecialcharacter(price)) {
				error += "Invalid price!!";
			} else {
				warehouseservice.addWarehouse(new Storehouse(0, description, month, year, price, date, sessionname));
				success += "Add warehouse details!!";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperpaid/paidpackageaddWarehouse.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageaddWarehouse.jsp?success=" + success);
			}

		} else if (action.equalsIgnoreCase("ADDORDERCONFIRM")) {

			String postId = request.getParameter("postId");
			String sessionname = request.getParameter("sessionname");
			String empdeg = request.getParameter("empdeg");
			String error = "";
			String success = "";
			if (orderconfirmservice.checkOrdeconfirmId(Integer.parseInt(empdeg))) {
				error += "Service provider not available!!";
			} else {

				offlineorerservice.updateOfflineorderstatus(new OfflineOrder("0", Integer.parseInt(postId)));

				orderconfirmservice.addOrderconfirm(new Orderconfirm(0, sessionname, Integer.parseInt(postId), "active",
						date, Integer.parseInt(empdeg)));

				success += "Set your order!!";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperpaid/paidpackageVieworderconfirm.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageVieworderconfirm.jsp?success=" + success);
			}

		} else if (action.equalsIgnoreCase("ADDOWNER")) {
			String sessionname = request.getParameter("sessionname");
			String ownername = request.getParameter("ownername");
			String emailaddress = request.getParameter("emailaddress");
			String error = "";
			String success = "";
			if (ownername.equals("") || emailaddress.equals("")) {
				error += "Service provider not available!!";
			} else {
				bakeryownerserice.addBakeryowner(new BakeryOwners(0, ownername, emailaddress, sessionname, date));
				success += "Add new bakery owners!!";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperpaid/paidpackageaddOwner.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageaddOwner.jsp?success=" + success);
			}

		} else if (action.equalsIgnoreCase("SENDEMAILBAKERYOWNER")) {
			String description = request.getParameter("description");
			String email = request.getParameter("email");
			String sessionname = request.getParameter("sessionname");
			String error = "";
			String success = "";
			if (description.equals("") || email.equals("")) {
				error += "Field must not be empty!!";
			} else {
				String Info = "From, Bakery Foods Hut" + "\n\n";
				Info += "Hey, " + email + " " + "hopefully you are well." + description + "\n";
				Info += "Please contact us" + "\n\n\n\n\n";
				Info += "Gmail: " + sessionname;
				SendEmail.send(email, "Need Help", Info, "golamnobi280@gmail.com", "sager1.z");
				success += "Send your email!!";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperpaid/paidpackagebakeryOwner.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackagebakeryOwner.jsp?success=" + success);
			}

		} else if (action.equalsIgnoreCase("ADDOFFLINEORDER")) {
			String sessionname = request.getParameter("sessionname");
			String description = request.getParameter("description");
			String month = request.getParameter("month");
			String year = request.getParameter("year");
			String price = request.getParameter("price");
			String quantity = request.getParameter("quantity");
			String error = "";
			String success = "";
			if (description.equals("") || month.equals("") || year.equals("") || price.equals("")
					|| quantity.equals("")) {
				error += "Service provider not available!!";
			} else if (formate.checkNumbervalidator(price)) {
				error += "Invalid price!!";
			} else if (formate.checkSpecialcharacter(price)) {
				error += "Invalid price!!";
			} else if (formate.checkNumbervalidator(quantity)) {
				error += "Invalid Quantity!!";
			} else if (formate.checkSpecialcharacter(price)) {
				error += "Invalid Quantity!!";
			} else {
				lcoalservice.addLocalorder(new LocalStore(0, description, quantity, Integer.parseInt(price),
						sessionname, date, month, year));
				success += "Add local order";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperpaid/paidpackageaddLocalorder.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageaddLocalorder.jsp?success=" + success);
			}

		} else if (action.equalsIgnoreCase("UPDATEOFFLINEORDER")) {

			String sessionname = request.getParameter("sessionname");
			String description = request.getParameter("description");
			String month = request.getParameter("month");
			String year = request.getParameter("year");
			String price = request.getParameter("price");
			String quantity = request.getParameter("quantity");
			int id = Integer.parseInt(request.getParameter("id"));
			String error = "";
			String success = "";
			if (description.equals("") || month.equals("") || year.equals("") || price.equals("")
					|| quantity.equals("")) {
				error += "Service provider not available!!";
			} else if (formate.checkNumbervalidator(price)) {
				error += "Invalid price field!!";
			} else if (formate.checkSpecialcharacter(price)) {
				error += "Invalid price field!!";
			} else if (formate.checkNumbervalidator(quantity)) {
				error += "Invalid quantity field!!";
			} else if (formate.checkSpecialcharacter(quantity)) {
				error += "Invalid quantity field!!";
			} else {
				lcoalservice.updatalocalorder(new LocalStore(id, description, quantity, Integer.parseInt(price),
						sessionname, date, month, year));
				success += "Update local store order!!";
			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperpaid/paidpackageViewLocalstore.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackageViewLocalstore.jsp?success=" + success);
			}

		} else if (action.equalsIgnoreCase("SENDEMAILALLCUS")) {
			String sessionname = request.getParameter("sessionname");
			String description = request.getParameter("description");
			String error = "";
			String success = "";
			if (description.equals("")) {
				error += "Field must not be empty!!";
			} else {

				for (OfflineOrder offlineorder : offlineorerservice.getOrderListInfo(sessionname)) {
					String getEmail = offlineorder.getCustomeremail();
					String Info = "Bakery Foods Hut" + "\n\n";
					Info += "Hey, " + getEmail + " " + "hopefully you are well." + description + "\n";
					Info += "Please contact us" + "\n\n\n\n\n\n";
					Info += "Gmail: " + sessionname;
					SendEmail.send(getEmail, "Bakery Foods Offer", Info, "golamnobi280@gmail.com", "sager1.z");
					success += "Send your email";
				}

			}
			if (error.length() > 0) {
				response.sendRedirect("./shopkeeperpaid/paidpackagesendEmail.jsp?error=" + error);
			} else {
				response.sendRedirect("./shopkeeperpaid/paidpackagesendEmail.jsp?success=" + success);
			}

		} else if (action.equalsIgnoreCase("BFH_SENDMESSAGE")) {
			String useremail = request.getParameter("useremail");
			String comment = request.getParameter("comment");
			if (useremail != null || comment != null) {
				messageservice.sendMessage(new BFHMessage(0, useremail, comment, date));
			}

		} else if (action.equalsIgnoreCase("PAID_DAILYREPORT")) {

			String getdate = request.getParameter("selectdate");
			String sessionname = request.getParameter("sessionname");

			System.out.println(getdate + "  vlss " + sessionname);

			Document document = new Document();
			String datetime = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
			Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 23);
			Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
			Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);
			Font font5 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 11, Font.BOLD);
			Font font6 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL);

			try {
				response.setContentType("application/pdf");
				PdfWriter.getInstance(document, response.getOutputStream());
				document.open();

				Paragraph paragraph = new Paragraph("Bakery Foods Hut", font);
				paragraph.setAlignment(Element.ALIGN_CENTER);
				document.add(paragraph);

				Paragraph address = new Paragraph("Address:102, Shukrabad,Dhanmondi, Dhaka-1207", font1);
				address.setAlignment(Element.ALIGN_CENTER);
				document.add(address);

				Paragraph phone = new Paragraph("phone:098765432123", font1);
				phone.setAlignment(Element.ALIGN_CENTER);
				document.add(phone);

				Paragraph email = new Paragraph("Email:bakeryfoodshut@gmail.com", font1);
				email.setAlignment(Element.ALIGN_CENTER);
				document.add(email);

				Paragraph monthlyReport = new Paragraph("Daily Report", font1);
				monthlyReport.setAlignment(Element.ALIGN_LEFT);
				document.add(monthlyReport);

				Paragraph pargraphdate = new Paragraph("Date: " + datetime, font1);
				pargraphdate.setAlignment(Element.ALIGN_LEFT);
				document.add(pargraphdate);

				float[] pointColumnWidths = { 15F, 18F, 15F, 15f, 20f };
				PdfPTable table = new PdfPTable(pointColumnWidths);
				table.setSpacingBefore(20);
				table.setWidthPercentage(100f);

				PdfPCell c1 = new PdfPCell(new Phrase("CustomerEmail", font5));
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);

				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("TotalQuantity", font5));

				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("TotalPrice", font5));
				c1.setPaddingBottom(7f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("Date", font5));
				c1.setPaddingBottom(7f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("Status", font5));
				c1.setPaddingBottom(7f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);
				table.setHeaderRows(1);
				c1.setPaddingBottom(10f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				double totalamount = 0;
				for (OfflineOrder of : offlineorerservice.Offlineorderreport(sessionname, getdate)) {
					totalamount += Integer.parseInt(of.getTotalprice());
					PdfPCell cell_1 = new PdfPCell(new Phrase(of.getCustomeremail(), font6));
					cell_1.setPaddingBottom(6f);
					cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_2 = new PdfPCell(new Phrase(Integer.toString(of.getTotalquantity()), font6));
					cell_2.setPaddingBottom(6f);
					cell_2.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_3 = new PdfPCell(new Phrase(of.getTotalprice(), font6));
					cell_3.setPaddingBottom(6f);
					cell_3.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_4 = new PdfPCell(new Phrase(of.getDate(), font6));
					cell_4.setPaddingBottom(6f);
					cell_4.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_5 = new PdfPCell(new Phrase("Online Order", font6));
					cell_5.setPaddingBottom(6f);
					cell_5.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(cell_1);
					table.addCell(cell_2);
					table.addCell(cell_3);
					table.addCell(cell_4);
					table.addCell(cell_5);
				}

				for (LocalStore local : lcoalservice.localStorereport(sessionname, getdate)) {
					totalamount += local.getPrice();
					PdfPCell cell_1 = new PdfPCell(new Phrase("Local Store", font6));
					cell_1.setPaddingBottom(6f);
					cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_2 = new PdfPCell(new Phrase((local.getTotalquantity()), font6));
					cell_2.setPaddingBottom(6f);
					cell_2.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_3 = new PdfPCell(new Phrase(Integer.toString(local.getPrice()), font6));
					cell_3.setPaddingBottom(6f);
					cell_3.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_4 = new PdfPCell(new Phrase(local.getDate(), font6));
					cell_4.setPaddingBottom(6f);
					cell_4.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_5 = new PdfPCell(new Phrase("Offline Order", font6));
					cell_5.setPaddingBottom(6f);
					cell_5.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(cell_1);
					table.addCell(cell_2);
					table.addCell(cell_3);
					table.addCell(cell_4);
					table.addCell(cell_5);
				}
				document.add(table);
				Paragraph total = new Paragraph("Total= " + Double.toString(totalamount) + " Tk.", font1);
				total.setAlignment(Element.ALIGN_RIGHT);
				document.add(total);

			} catch (Exception e) {
				e.printStackTrace();
			}
			document.close();

		} else if (action.equalsIgnoreCase("GENERATEMONTHLYREPORT")) {

			String sessionname = request.getParameter("sessionname");
			String month = request.getParameter("month");
			String year = request.getParameter("year");

			Document document = new Document();
			String datetime = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
			Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 23);
			Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
			Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);
			Font font5 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 11, Font.BOLD);
			Font font6 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL);

			try {
				response.setContentType("application/pdf");
				PdfWriter.getInstance(document, response.getOutputStream());
				document.open();

				Paragraph paragraph = new Paragraph("Bakery Foods Hut", font);
				paragraph.setAlignment(Element.ALIGN_CENTER);
				document.add(paragraph);

				Paragraph address = new Paragraph("Address:102, Shukrabad,Dhanmondi, Dhaka-1207", font1);
				address.setAlignment(Element.ALIGN_CENTER);
				document.add(address);

				Paragraph phone = new Paragraph("phone:098765432123", font1);
				phone.setAlignment(Element.ALIGN_CENTER);
				document.add(phone);

				Paragraph email = new Paragraph("Email:bakeryfoodshut@gmail.com", font1);
				email.setAlignment(Element.ALIGN_CENTER);
				document.add(email);

				Paragraph monthlyReport = new Paragraph("Monthly Report", font1);
				monthlyReport.setAlignment(Element.ALIGN_LEFT);
				document.add(monthlyReport);

				Paragraph pargraphdate = new Paragraph("Date: " + datetime, font1);
				pargraphdate.setAlignment(Element.ALIGN_LEFT);
				document.add(pargraphdate);

				float[] pointColumnWidths = { 15F, 18F, 15F, 15f, 20f };
				PdfPTable table = new PdfPTable(pointColumnWidths);
				table.setSpacingBefore(20);
				table.setWidthPercentage(100f);

				PdfPCell c1 = new PdfPCell(new Phrase("CustomerEmail", font5));
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);

				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("TotalQuantity", font5));

				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("TotalPrice", font5));
				c1.setPaddingBottom(7f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("Date", font5));
				c1.setPaddingBottom(7f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("Status", font5));
				c1.setPaddingBottom(7f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);
				table.setHeaderRows(1);
				c1.setPaddingBottom(10f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				
				double totalamount = 0;
				
				for (LocalStore local :lcoalservice.monthlyreportlocalStore(sessionname, month, year)) {
					totalamount += local.getPrice();
					PdfPCell cell_1 = new PdfPCell(new Phrase("Local Store", font6));
					cell_1.setPaddingBottom(6f);
					cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_2 = new PdfPCell(new Phrase((local.getTotalquantity()), font6));
					cell_2.setPaddingBottom(6f);
					cell_2.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_3 = new PdfPCell(new Phrase(Integer.toString(local.getPrice()), font6));
					cell_3.setPaddingBottom(6f);
					cell_3.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_4 = new PdfPCell(new Phrase(local.getDate(), font6));
					cell_4.setPaddingBottom(6f);
					cell_4.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_5 = new PdfPCell(new Phrase("Offline Order", font6));
					cell_5.setPaddingBottom(6f);
					cell_5.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(cell_1);
					table.addCell(cell_2);
					table.addCell(cell_3);
					table.addCell(cell_4);
					table.addCell(cell_5);
				}
				document.add(table);
				Paragraph total = new Paragraph("Total= " + Double.toString(totalamount) + " Tk.", font1);
				total.setAlignment(Element.ALIGN_RIGHT);
				document.add(total);

			} catch (Exception e) {
				e.printStackTrace();
			}
			document.close();
			
			
		}else if(action.equalsIgnoreCase("YEARLYREPORT")){
			
			String sessionname = request.getParameter("sessionname");
			String year = request.getParameter("year");

			Document document = new Document();
			String datetime = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
			Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 23);
			Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
			Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);
			Font font5 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 11, Font.BOLD);
			Font font6 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL);

			try {
				response.setContentType("application/pdf");
				PdfWriter.getInstance(document, response.getOutputStream());
				document.open();

				Paragraph paragraph = new Paragraph("Bakery Foods Hut", font);
				paragraph.setAlignment(Element.ALIGN_CENTER);
				document.add(paragraph);

				Paragraph address = new Paragraph("Address:102, Shukrabad,Dhanmondi, Dhaka-1207", font1);
				address.setAlignment(Element.ALIGN_CENTER);
				document.add(address);

				Paragraph phone = new Paragraph("phone:098765432123", font1);
				phone.setAlignment(Element.ALIGN_CENTER);
				document.add(phone);

				Paragraph email = new Paragraph("Email:bakeryfoodshut@gmail.com", font1);
				email.setAlignment(Element.ALIGN_CENTER);
				document.add(email);

				Paragraph monthlyReport = new Paragraph("Yearly Report", font1);
				monthlyReport.setAlignment(Element.ALIGN_LEFT);
				document.add(monthlyReport);

				Paragraph pargraphdate = new Paragraph("Date: " + datetime, font1);
				pargraphdate.setAlignment(Element.ALIGN_LEFT);
				document.add(pargraphdate);

				float[] pointColumnWidths = { 15F, 18F, 15F, 15f, 20f };
				PdfPTable table = new PdfPTable(pointColumnWidths);
				table.setSpacingBefore(20);
				table.setWidthPercentage(100f);

				PdfPCell c1 = new PdfPCell(new Phrase("CustomerEmail", font5));
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);

				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("TotalQuantity", font5));

				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("TotalPrice", font5));
				c1.setPaddingBottom(7f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("Date", font5));
				c1.setPaddingBottom(7f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);

				c1 = new PdfPCell(new Phrase("Status", font5));
				c1.setPaddingBottom(7f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(c1);
				table.setHeaderRows(1);
				c1.setPaddingBottom(10f);
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);
				double totalamount = 0;
				for (LocalStore local :lcoalservice.yearlyreportlocalStore(sessionname, year)) {
					totalamount += local.getPrice();
					PdfPCell cell_1 = new PdfPCell(new Phrase("Local Store", font6));
					cell_1.setPaddingBottom(6f);
					cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_2 = new PdfPCell(new Phrase((local.getTotalquantity()), font6));
					cell_2.setPaddingBottom(6f);
					cell_2.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_3 = new PdfPCell(new Phrase(Integer.toString(local.getPrice()), font6));
					cell_3.setPaddingBottom(6f);
					cell_3.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_4 = new PdfPCell(new Phrase(local.getDate(), font6));
					cell_4.setPaddingBottom(6f);
					cell_4.setHorizontalAlignment(Element.ALIGN_CENTER);
					PdfPCell cell_5 = new PdfPCell(new Phrase("Offline Order", font6));
					cell_5.setPaddingBottom(6f);
					cell_5.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(cell_1);
					table.addCell(cell_2);
					table.addCell(cell_3);
					table.addCell(cell_4);
					table.addCell(cell_5);
				}
				document.add(table);
				Paragraph total = new Paragraph("Total= " + Double.toString(totalamount) + " Tk.", font1);
				total.setAlignment(Element.ALIGN_RIGHT);
				document.add(total);

			} catch (Exception e) {
				e.printStackTrace();
			}
			document.close();
			
			
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
