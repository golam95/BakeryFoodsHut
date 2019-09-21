package com.bakeryfoodshut.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import com.bakeryfoodshut.model.Bakerymade;
import com.bakeryfoodshut.model.Cart;
import com.bakeryfoodshut.model.Contact;
import com.bakeryfoodshut.model.Feedback;
import com.bakeryfoodshut.model.Homemade;
import com.bakeryfoodshut.model.OfflineOrder;
import com.bakeryfoodshut.model.Paidpackage;
import com.bakeryfoodshut.model.Post;
import com.bakeryfoodshut.model.ProfileInfo;
import com.bakeryfoodshut.model.Registration;
import com.bakeryfoodshut.model.Review;
import com.bakeryfoodshut.model.ShopkeeperMessage;
import com.bakeryfoodshut.service.ShopkeeperMessageService;
import com.bakeryfoodshut.serviceImpl.BakerymadeServiceImpl;
import com.bakeryfoodshut.serviceImpl.CartServiceImpl;
import com.bakeryfoodshut.serviceImpl.ContactServiceImpl;
import com.bakeryfoodshut.serviceImpl.FeedbackServiceImpl;
import com.bakeryfoodshut.serviceImpl.HomemadeServiceImpl;
import com.bakeryfoodshut.serviceImpl.OfflineorderServiceImpl;
import com.bakeryfoodshut.serviceImpl.PaidpackageServiceImpl;
import com.bakeryfoodshut.serviceImpl.PostServiceImpl;
import com.bakeryfoodshut.serviceImpl.ProfileInfoServiceImpl;
import com.bakeryfoodshut.serviceImpl.RegistrationServiceImpl;
import com.bakeryfoodshut.serviceImpl.ReviewServiceImpl;
import com.bakeryfoodshut.serviceImpl.ShopkeeperMessageServiceImpl;
import com.bakeryfoodshut.utils.Formate;
import com.bakeryfoodshut.utils.SendEmail;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
		maxFileSize = 1024 * 1024 * 50, // 50 MB
		maxRequestSize = 1024 * 1024 * 100) // 100 MB
@WebServlet("/ManageCustomer")
public class ManageCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ContactServiceImpl contactservice = new ContactServiceImpl();
	FeedbackServiceImpl feedbackservice = new FeedbackServiceImpl();
	RegistrationServiceImpl regservice = new RegistrationServiceImpl();
	//
	CartServiceImpl cartService = new CartServiceImpl();
	BakerymadeServiceImpl bakerymade = new BakerymadeServiceImpl();
	HomemadeServiceImpl homemade = new HomemadeServiceImpl();
	PaidpackageServiceImpl paidpackage = new PaidpackageServiceImpl();
	ProfileInfoServiceImpl profileinfo = new ProfileInfoServiceImpl();
	ReviewServiceImpl reviewservice = new ReviewServiceImpl();
	PostServiceImpl postservice = new PostServiceImpl();
	OfflineorderServiceImpl offlineorder = new OfflineorderServiceImpl();
	ShopkeeperMessageServiceImpl shopkeepermessage = new ShopkeeperMessageServiceImpl();
	Formate formate = new Formate();

	private String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());

	private static final String UPLOAD = "uploads";
	private static final String UPLOAD_PAID = "uploads/paid";

	public ManageCustomer() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String getCart = request.getParameter("deleteCart");
		String getmyorderlist = request.getParameter("deletemyorderlist");
		String url = "";

		if (getCart != null) {
			cartService.deleteCart(Integer.parseInt(getCart));
			url = "cart.jsp";
		} else if (getmyorderlist != null) {
			offlineorder.deleteOfflineOrder(Integer.parseInt(getmyorderlist));
			url = "myorderList.jsp";
		}
		response.sendRedirect(url);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("CONTACT")) {

			String contactName = request.getParameter("contactName");
			String contactEmail = request.getParameter("contactEmail");
			String contactDescription = request.getParameter("contactDescription");
			if (contactName != null || contactEmail != null || contactDescription != null) {
				contactservice.addContact(new Contact(0, contactName, contactEmail, contactDescription, date));
			}

		} else if (action.equalsIgnoreCase("GET_FEEDBACK")) {

			String feedbackTopic = request.getParameter("feedbackTopic");
			String feedbackComment = request.getParameter("feedbackComment");
			String feedbackEmail = request.getParameter("feedbackEmail");
			if (feedbackTopic != null || feedbackComment != null || feedbackEmail != null) {
				feedbackservice.addFeedback(new Feedback(0, feedbackTopic, feedbackComment, feedbackEmail, date));
			}

		} else if (action.equalsIgnoreCase("GET_REGISTRATION")) {

			String regName = request.getParameter("rname");
			String regEmail = request.getParameter("remail");
			String regPassword = request.getParameter("rpassword");
			String regGender = request.getParameter("rgender");
			String address = request.getParameter("address");
			String district = request.getParameter("district");
			String error = "";
			String success = "";
			if (regName.equals("") || regEmail.equals("") || regPassword.equals("") || regGender.equals("")) {
				error += "Empty field found!!";
			} else if (regservice.checkCustomeremail(regEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (bakerymade.checkEmail(regEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (homemade.checkEmail(regEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (paidpackage.checkEmail(regEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (regPassword.length() < 8) {
				error += " Week passwoard!!";
			} else {
				regservice.addCustomerInfo(new Registration(0, regName, regEmail, regPassword, regGender, "unblock",
						date, district, address));
				success += "Successfully complete your registration";
			}

			if (error.length() > 0) {
				request.setAttribute("error", error);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/registration.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("success", success);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/registration.jsp");
				rd.forward(request, response);
			}

		} else if (action.equalsIgnoreCase("SEARCHBYCONSUMER")) {

			String getsearchValue = request.getParameter("selectValue");
			request.setAttribute("getsearchValue", getsearchValue);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/fooditempost.jsp");
			rd.forward(request, response);

		} else if (action.equalsIgnoreCase("USER_BAKERYMADE")) {

			String userName = request.getParameter("username");
			String userEmail = request.getParameter("useremail");
			String userPhone = request.getParameter("userphone");
			String userAddress = request.getParameter("useraddress");
			String userPassword = request.getParameter("userpassword");
			String userShopname = request.getParameter("usershopname");
			String userShoplocation = request.getParameter("usershoplocation");
			String userGender = request.getParameter("rgender");
			// another table
			String businessTime = request.getParameter("businesstime");
			String businessbranch = request.getParameter("branch");
			String businessWebsite = request.getParameter("website");
			String district = request.getParameter("district");

			String error = "";
			String success = "";
			//
			if (businessTime.equals("")) {

				error += "Date must not be empty!";

			} else if (userName.equals("") || userEmail.equals("") || userPhone.equals("") || userAddress.equals("")
					|| userPassword.equals("") || userShopname.equals("") || userShoplocation.equals("")
					|| businessbranch.equals("") || businessWebsite.equals("") || district.equals("")) {

				error += "Field must not be empty!";
			} else if (userPassword.length() < 8) {
				error += " Week passwoard!!";

			} else if (userPhone.length() < 11 || userPhone.length() > 11) {
				error += "Invalid phone number!";
			} else if (regservice.checkCustomeremail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (bakerymade.checkEmail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (homemade.checkEmail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (paidpackage.checkEmail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else {

				String applicationPath = request.getServletContext().getRealPath("");
				String uploadFilePath = applicationPath + File.separator + UPLOAD;

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
				bakerymade.addBakerymade(new Bakerymade(0, userName, userEmail, userPhone, userAddress, "b_unblock",
						userShopname, userShoplocation, fileName, date, userPassword, userGender, district));
				profileinfo.addProfileinfo(new ProfileInfo(0, userEmail, businessWebsite, businessbranch, "bakerymade",
						businessTime, date));
				success += "You have successfully completed your registration process!!Please logIn.";

			}
			if (error.length() > 0) {
				request.setAttribute("error", error);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/bakerymade.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("success", success);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/bakerymade.jsp");
				rd.forward(request, response);
			}

		} else if (action.equalsIgnoreCase("USER_HOMEMADE")) {

			String userName = request.getParameter("hname");
			String userEmail = request.getParameter("hemail");
			String userPhone = request.getParameter("hphone");
			String userAddress = request.getParameter("haddress");
			String userPassword = request.getParameter("hpassword");
			String userGender = request.getParameter("rgender");
			// Others information
			String businessTime = request.getParameter("businesstime");
			String businessbranch = request.getParameter("branch");
			String businessWebsite = request.getParameter("website");
			String district = request.getParameter("district");
			String error = "";
			String success = "";

			if (userName.equals("") || userEmail.equals("") || userPhone.equals("") || userAddress.equals("")
					|| userPassword.equals("") || businessTime.equals("") || businessbranch.equals("")
					|| businessWebsite.equals("") || district.equals("")) {

				error += "Field must not be empty!";

			} else if (regservice.checkCustomeremail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (bakerymade.checkEmail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (homemade.checkEmail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (paidpackage.checkEmail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (userPassword.length() < 8) {
				error += " Week passwoard!!";
			} else if (userPhone.length() < 11 || userPhone.length() > 11) {
				error += "Invalid phone number!";
			} else {
				homemade.addHomemade(new Homemade(0, userName, userEmail, userPhone, userAddress, "h_unblock",
						userPassword, date, userGender, district));
				profileinfo.addProfileinfo(
						new ProfileInfo(0, userEmail, businessWebsite, businessbranch, "homemade", businessTime, date));
				success += "You have successfully completed your registration process!!Please logIn.";

			}

			if (error.length() > 0) {
				request.setAttribute("error", error);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/homemade.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("success", success);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/homemade.jsp");
				rd.forward(request, response);
			}

		} else if (action.equalsIgnoreCase("USER_PAIDPACKAGE")) {

			String userName = request.getParameter("username");
			String userEmail = request.getParameter("useremail");
			String userPhone = request.getParameter("userphone");
			String userAddress = request.getParameter("useraddress");
			String userPassword = request.getParameter("userpassword");
			String userShopname = request.getParameter("usershopname");
			String userShoplocation = request.getParameter("usershoplocation");
			String userGender = request.getParameter("rgender");
			// Money transaction Information

			String bkashNo = request.getParameter("userbkashno");
			String bkashTransactionId = request.getParameter("transactionid");
			// Others information
			//
			String businessTime = request.getParameter("businesstime");
			String businessbranch = request.getParameter("branch");
			String businessWebsite = request.getParameter("website");
			String district = request.getParameter("district");
			String error = "";
			String success = "";
			if (userName.equals("") || userEmail.equals("") || userPhone.equals("") || userAddress.equals("")
					|| userPassword.equals("") || userShopname.equals("") || userShoplocation.equals("")
					|| userGender.equals("") || bkashNo.equals("") || bkashTransactionId.equals("")
					|| businessTime.equals("") || businessbranch.equals("") || businessWebsite.equals("")
					|| district.equals("")) {
				error += "Field must not be empty!";
			} else if (regservice.checkCustomeremail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (bakerymade.checkEmail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (homemade.checkEmail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (paidpackage.checkEmail(userEmail)) {
				error += "Email already Exist! Please use another email!!!";
			} else if (userPassword.length() < 8) {
				error += " Week passwoard!!";
			} else if (userPhone.length() < 11 || userPhone.length() > 11) {
				error += "Invalid phone number!";
			} else if (bkashNo.length() < 11 || userPhone.length() > 11) {
				error += "Invalid Bkash phone number!";
			} else {
				String applicationPath = request.getServletContext().getRealPath("");
				String uploadFilePath = applicationPath + File.separator + UPLOAD_PAID;
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
				paidpackage.addPaidpackage(new Paidpackage(0, userName, userPhone, userAddress, userEmail, userShopname,
						userShoplocation, fileName, bkashNo, bkashTransactionId, date, "p_unblock", userPassword,
						userGender, district));
				profileinfo.addProfileinfo(new ProfileInfo(0, userEmail, businessWebsite, businessbranch, "paidpackage",
						businessTime, date));
				success += "You have successfully completed your registration process!! Please logIn.";
			}
			if (error.length() > 0) {
				request.setAttribute("error", error);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/paidpackage.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("success", success);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/paidpackage.jsp");
				rd.forward(request, response);
			}

		} else if (action.equalsIgnoreCase("UPDATE_USERNAME")) {
			String sessionname = request.getParameter("sessionname");
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String address = request.getParameter("address");
			regservice.updateCustomer(new Registration(name, password, address, sessionname));
		} else if (action.equalsIgnoreCase("ADD_REVIEW")) {

			String sessionname = request.getParameter("sessionname");
			String productId = request.getParameter("productId");
			String star = request.getParameter("star");
			String title = request.getParameter("title");
			String comment = request.getParameter("comment");
			String shopkeeperemail = request.getParameter("shopkeeperemail");

			if (reviewservice.checkReview(sessionname, Integer.parseInt(productId)) == true) {
				out.println("Sorry,your review is exit!");
			} else {
				reviewservice.addReview(new Review(0, shopkeeperemail, Integer.parseInt(productId), comment,
						Integer.parseInt(star), date, title, sessionname));
				out.println("Thank you,for your review");
			}

		} else if (action.equalsIgnoreCase("ADD_CART_2")) {

			String shopkeeperemail = request.getParameter("shopkeeperemail");
			String customeremail = request.getParameter("customeremail");
			String cartQuantity = request.getParameter("cartQuantity");
			String existingquantity = request.getParameter("existingquantity");
			String cart_price = request.getParameter("cart_price");
			String cart_productname = request.getParameter("cart_productname");
			String cart_des = request.getParameter("cart_des");
			String cart_weight = request.getParameter("cart_weight");
			String cart_discount = request.getParameter("cart_discount");

			if (shopkeeperemail.equals("") || customeremail.equals("") || cartQuantity.equals("")
					|| cart_price.equals("") || cart_productname.equals("") || cart_des.equals("")
					|| cart_discount.equals("")) {
				out.println("Field must not be empty!!");
			} else if (formate.checkNumbervalidator(cartQuantity)) {
				out.println("Sorry Invalid quantity!!");
			} else if (formate.checkSpecialcharacter(cartQuantity)) {
				out.println("Sorry Invalid quantity!!");
			} else if (Integer.parseInt(cartQuantity) <= 0) {
				out.println("Sorry Invalid quantity!!");
			} else if (Integer.parseInt(cartQuantity) > Integer.parseInt(existingquantity)) {
				out.println("Sorry, Quantity is out of stock!!");
			} else {

				double checkdiscount = 0, finalprice = 0;

				if (cart_discount.equals("0 percent")) {
					checkdiscount = Integer.parseInt(cart_price) * (0.0);
				} else if (cart_discount.equals("10 percent")) {
					checkdiscount = Integer.parseInt(cart_price) * (0.1);
				} else if (cart_discount.equals("20 percent")) {
					checkdiscount = Integer.parseInt(cart_price) * (0.2);
				} else if (cart_discount.equals("30 percent")) {
					checkdiscount = Integer.parseInt(cart_price) * (0.3);
				} else if (cart_discount.equals("40 percent")) {
					checkdiscount = Integer.parseInt(cart_price) * (0.4);
				} else if (cart_discount.equals("50 percent")) {
					checkdiscount = Integer.parseInt(cart_price) * (0.5);
				}

				finalprice = Integer.parseInt(cart_price) - checkdiscount;

				if (cartService.checkCustomer(customeremail) == false) {
					cartService.addCart(new Cart(0, shopkeeperemail, customeremail, cart_productname, cart_des,
							Integer.parseInt(cartQuantity), Double.toString(finalprice), date, cart_weight,
							cart_discount));
					postservice.updatePostCart(new Post(Integer.parseInt(cartQuantity), shopkeeperemail));
					out.println("Add your cart!");
				} else {
					if (cartService.checkshopkeeper(shopkeeperemail, customeremail)) {
						cartService.addCart(new Cart(0, shopkeeperemail, customeremail, cart_productname, cart_des,
								Integer.parseInt(cartQuantity), Double.toString(finalprice), date, cart_weight,
								cart_discount));
						postservice.updatePostCart(new Post(Integer.parseInt(cartQuantity), shopkeeperemail));
						out.println("Add your cart!");
					} else {
						out.println("Your order process still pending!!");
					}
				}
			}
		} else if (action.equalsIgnoreCase("OfflineOrder")) {

			String shopkeeperemail = request.getParameter("shopkeeperemail");
			String emailaddress = request.getParameter("emailaddress");
			String orderType = request.getParameter("ordertype");
			String trackproduct = request.getParameter("trackproduct");
			String totalquantity = request.getParameter("totalquantity");
			String totalprice = request.getParameter("totalprice");
			String location = request.getParameter("location");
			String pickondate = request.getParameter("pickondate");
			String pickuptime = request.getParameter("pickuptime");
			String pickuptimetype = request.getParameter("timetype");
			String error = "";

			if (emailaddress.equals("") || orderType.equals("") || trackproduct.equals("") || totalquantity.equals("")
					|| totalprice.equals("") || location.equals("") || pickondate.equals("") || pickuptime.equals("")
					|| pickuptimetype.equals("")) {
				error += "Field must not be empty!!";
			} else {
				String addTime = pickuptime + pickuptimetype;
				offlineorder.addOfflineOrder(new OfflineOrder(0, shopkeeperemail, emailaddress, orderType, trackproduct,
						Integer.parseInt(totalquantity), totalprice, location, pickondate, addTime, date,"1"));
				cartService.deleteCartall(emailaddress);
			}
			if (error.length() > 0) {
				request.setAttribute("error", error);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/checkout.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/thankyou.jsp");
				rd.forward(request, response);
			}

		} else if (action.equalsIgnoreCase("SEND_MESSAGETOSHOPKEEPER")) {
			String shopkeeperemail = request.getParameter("shopkeeperemail");
			String customeremail = request.getParameter("customeremail");
			String comment = request.getParameter("comment");
			shopkeepermessage.addMessage(new ShopkeeperMessage(0, shopkeeperemail, customeremail, comment, date, "0"));

		} else if (action.equalsIgnoreCase("SEND_EMAIL")) {

			String email = request.getParameter("email");
			String error = "";
			String success = "";
			if (email.equals("")) {
				error += "Email field must not be empty!";
			} else if (regservice.checkCustomeremail(email) == false) {
				error += "Not match your email.please try again!!";
			} else {
				int rnd = (int) (Math.random() * 100);
				String rndstring = Integer.toString(rnd);
				String getstore = email.substring(0, 7);
				String passwordAssistance = getstore + rndstring;
				String Info = "Bakery Foods Hut" + "\n\n";
				Info += "Hey, " + email + " " + "hopefully you are doing well.Thank you so much for contacting us!!"
						+ "\n";
				Info += "Your new password: " + passwordAssistance + "\n\n\n";
				Info += "If you have any problem.Please contact us" + "\n";
				Info += "Phone: +88 01755719929" + "\n";
				Info += "Gmail: golamnobi280@gmail.com";

				regservice.updateforgetpassword(new Registration(passwordAssistance, email));

				SendEmail.send(email, "Forgot Password", Info, "golamnobi280@gmail.com", "sager1.z");
				success += "Send your message.Please check your email.";
			}

			if (error.length() > 0) {
				request.setAttribute("error", error);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/forgotpassword.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("success", success);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/forgotpassword.jsp");
				rd.forward(request, response);
			}

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
