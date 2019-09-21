package com.bakeryfoodshut.pagecontroller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bakeryfoodshut.model.EmployeeInfo;
import com.bakeryfoodshut.model.LocalStore;
import com.bakeryfoodshut.serviceImpl.EmployeeServiceImpl;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@WebServlet("/ManageShopkeeperpaidpage")
public class ManageShopkeeperpaidpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeServiceImpl employeeservice = new EmployeeServiceImpl();

	Document document = new Document();
	String datetime = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
	Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 23);
	Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
	Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);
	Font font5 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 11, Font.BOLD);
	Font font6 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL);

	public ManageShopkeeperpaidpage() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String action = request.getParameter("action");

			if (action == null) {
				action = "PAID_DASHBOARD";
			}
			switch (action) {

			case "PAID_DASHBOARD":
				response.sendRedirect("./shopkeeperpaid/paidpackageDashboard.jsp");
				break;
			case "PAID_VIEWPOST":
				response.sendRedirect("./shopkeeperpaid/paidpackageViewpost.jsp");
				break;
			case "PAID_ADDPOST":
				response.sendRedirect("./shopkeeperpaid/paidpackageAddpost.jsp");
				break;
			case "PAID_VIEWMESSAGE":
				response.sendRedirect("./shopkeeperpaid/paidpackageViewmessage.jsp");
				break;
			case "PAID_VIEWQUANTITY":
				response.sendRedirect("./shopkeeperpaid/paidpackageViewquantity.jsp");
				break;
			case "PAID_UPDATEPROFILEINFO":
				response.sendRedirect("./shopkeeperpaid/paidpackageupdateprofile.jsp");
				break;
			case "PAID_QUANTITYSETTING":
				response.sendRedirect("./shopkeeperpaid/paidpackageAddquantity.jsp");
				break;
			case "PAID_POFILE":
				response.sendRedirect("./shopkeeperpaid/paidpackageMyprofile.jsp");
				break;
			case "PAID_PROFILESETTING":
				response.sendRedirect("./shopkeeperpaid/paidpackageProfilesetting.jsp");
				break;
			case "PAID_HELP":
				response.sendRedirect("./shopkeeperpaid/paidpackageHelp.jsp");
				break;
			case "PAID_SENDMESSAGETOBFH":
				response.sendRedirect("./shopkeeperpaid/paidpackageSendmessage.jsp");
				break;

			case "PAID_VANDETAILS":
				response.sendRedirect("./shopkeeperpaid/paidpackageViewvandetails.jsp");
				break;
			case "PAID_ADDVAN":
				response.sendRedirect("./shopkeeperpaid/paidpackageaddVandetails.jsp");
				break;
			case "PAID_VIEWEMP":
				response.sendRedirect("./shopkeeperpaid/paidpackageViewemployee.jsp");
				break;
			case "PAID_VIREGINATION":
				response.sendRedirect("./shopkeeperpaid/paidpackageViewregination.jsp");
				break;
			case "PAID_VIEWAREHOUSE":
				response.sendRedirect("./shopkeeperpaid/paidpackageViewwarehouse.jsp");
				break;
			case "PAID_ADDEMPLOYEE":
				response.sendRedirect("./shopkeeperpaid/paidpackageaddEmp.jsp");
				break;
			case "PAID_ADDWAREHOUSE":
				response.sendRedirect("./shopkeeperpaid/paidpackageaddWarehouse.jsp");
				break;

			case "PAID_VIEWONLINE":
				response.sendRedirect("./shopkeeperpaid/paidpackageViewonlinorderlist.jsp");
				break;
			case "PAID_CONFIRMORDERLIST":
				response.sendRedirect("./shopkeeperpaid/paidpackageVieworderconfirm.jsp");
				break;

			case "PAID_VIEWLOCALSTORE":
				response.sendRedirect("./shopkeeperpaid/paidpackageViewLocalstore.jsp");
				break;
			case "PAID_EMAILSEND":
				response.sendRedirect("./shopkeeperpaid/paidpackagesendEmail.jsp");
				break;

			case "PAID_OTHERSOWNER":
				response.sendRedirect("./shopkeeperpaid/paidpackagebakeryOwner.jsp");
				break;
			case "PAID_ADDOWNERS":
				response.sendRedirect("./shopkeeperpaid/paidpackageaddOwner.jsp");
				break;
			case "PAID_DAILYREPORT":
				response.sendRedirect("./shopkeeperpaid/paidpackagedailyReport.jsp");
				break;

			case "PAID_MONTHLYREPORT":
				response.sendRedirect("./shopkeeperpaid/paidpackagemonthlyReport.jsp");
				break;

			case "PAID_YEARLYREPORT":
				response.sendRedirect("./shopkeeperpaid/paidpackageyearlyReport.jsp");
				break;
			case "PAID_ADDLOCALORDER":
				response.sendRedirect("./shopkeeperpaid/paidpackageaddLocalorder.jsp");
				break;

			case "PAID_BARCHART":
				response.sendRedirect("./shopkeeperpaid/paidpackagebarChart.jsp");
				break;

			case "PAID_PIECHART":
				response.sendRedirect("./shopkeeperpaid/paidpackagepieChart.jsp");
				break;

			case "PRINTEMPLOYEEINFO":
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

					Paragraph monthlyReport = new Paragraph("Employee Report", font1);
					monthlyReport.setAlignment(Element.ALIGN_LEFT);
					document.add(monthlyReport);

					Paragraph pargraphdate = new Paragraph("Date: " + datetime, font1);
					pargraphdate.setAlignment(Element.ALIGN_LEFT);
					document.add(pargraphdate);

					float[] pointColumnWidths = { 15F, 18F, 15F, 15f, 20f };
					PdfPTable table = new PdfPTable(pointColumnWidths);
					table.setSpacingBefore(20);
					table.setWidthPercentage(100f);

					PdfPCell c1 = new PdfPCell(new Phrase("Name", font5));
					c1.setHorizontalAlignment(Element.ALIGN_CENTER);

					table.addCell(c1);

					c1 = new PdfPCell(new Phrase("Designation", font5));

					c1.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(c1);

					c1 = new PdfPCell(new Phrase("Address", font5));
					c1.setPaddingBottom(7f);
					c1.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(c1);

					c1 = new PdfPCell(new Phrase("Gender", font5));
					c1.setPaddingBottom(7f);
					c1.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(c1);

					c1 = new PdfPCell(new Phrase("NID", font5));
					c1.setPaddingBottom(7f);

					c1.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(c1);
					table.setHeaderRows(1);
					c1.setPaddingBottom(10f);
					c1.setHorizontalAlignment(Element.ALIGN_CENTER);

					for (EmployeeInfo emp : employeeservice.getEmployeeListInfo("1")) {

						PdfPCell cell_1 = new PdfPCell(new Phrase(emp.getEmpName(), font6));
						cell_1.setPaddingBottom(6f);
						cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
						PdfPCell cell_2 = new PdfPCell(new Phrase(emp.getEmpDesignation(), font6));
						cell_2.setPaddingBottom(6f);
						cell_2.setHorizontalAlignment(Element.ALIGN_CENTER);
						PdfPCell cell_3 = new PdfPCell(new Phrase(emp.getEmpAddress(), font6));
						cell_3.setPaddingBottom(6f);
						cell_3.setHorizontalAlignment(Element.ALIGN_CENTER);
						PdfPCell cell_4 = new PdfPCell(new Phrase(emp.getEmpGender(), font6));
						cell_4.setPaddingBottom(6f);
						cell_4.setHorizontalAlignment(Element.ALIGN_CENTER);
						PdfPCell cell_5 = new PdfPCell(new Phrase(emp.getEmpNid(), font6));
						cell_5.setPaddingBottom(6f);
						cell_5.setHorizontalAlignment(Element.ALIGN_CENTER);
						table.addCell(cell_1);
						table.addCell(cell_2);
						table.addCell(cell_3);
						table.addCell(cell_4);
						table.addCell(cell_5);
					}
					document.add(table);
				} catch (Exception e) {
					e.printStackTrace();
				}
				document.close();

				break;

			case "PRINTREGINE":

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

					Paragraph monthlyReport = new Paragraph("Resignation Employee Report", font1);
					monthlyReport.setAlignment(Element.ALIGN_LEFT);
					document.add(monthlyReport);

					Paragraph pargraphdate = new Paragraph("Date: " + datetime, font1);
					pargraphdate.setAlignment(Element.ALIGN_LEFT);
					document.add(pargraphdate);

					float[] pointColumnWidths = { 15F, 18F, 15F, 15f, 20f };
					PdfPTable table = new PdfPTable(pointColumnWidths);
					table.setSpacingBefore(20);
					table.setWidthPercentage(100f);

					PdfPCell c1 = new PdfPCell(new Phrase("Name", font5));
					c1.setHorizontalAlignment(Element.ALIGN_CENTER);

					table.addCell(c1);

					c1 = new PdfPCell(new Phrase("Designation", font5));

					c1.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(c1);

					c1 = new PdfPCell(new Phrase("Address", font5));
					c1.setPaddingBottom(7f);
					c1.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(c1);

					c1 = new PdfPCell(new Phrase("Gender", font5));
					c1.setPaddingBottom(7f);
					c1.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(c1);

					c1 = new PdfPCell(new Phrase("NID", font5));
					c1.setPaddingBottom(7f);

					c1.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(c1);
					table.setHeaderRows(1);
					c1.setPaddingBottom(10f);
					c1.setHorizontalAlignment(Element.ALIGN_CENTER);

					for (EmployeeInfo emp : employeeservice.getEmployeeListInfo("0")) {

						PdfPCell cell_1 = new PdfPCell(new Phrase(emp.getEmpName(), font6));
						cell_1.setPaddingBottom(6f);
						cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
						PdfPCell cell_2 = new PdfPCell(new Phrase(emp.getEmpDesignation(), font6));
						cell_2.setPaddingBottom(6f);
						cell_2.setHorizontalAlignment(Element.ALIGN_CENTER);
						PdfPCell cell_3 = new PdfPCell(new Phrase(emp.getEmpAddress(), font6));
						cell_3.setPaddingBottom(6f);
						cell_3.setHorizontalAlignment(Element.ALIGN_CENTER);
						PdfPCell cell_4 = new PdfPCell(new Phrase(emp.getEmpGender(), font6));
						cell_4.setPaddingBottom(6f);
						cell_4.setHorizontalAlignment(Element.ALIGN_CENTER);
						PdfPCell cell_5 = new PdfPCell(new Phrase(emp.getEmpNid(), font6));
						cell_5.setPaddingBottom(6f);
						cell_5.setHorizontalAlignment(Element.ALIGN_CENTER);
						table.addCell(cell_1);
						table.addCell(cell_2);
						table.addCell(cell_3);
						table.addCell(cell_4);
						table.addCell(cell_5);
					}
					document.add(table);
				} catch (Exception e) {
					e.printStackTrace();
				}
				document.close();

				break;

			default:
				response.sendRedirect("./shopkeeperpaid/paidpackageDashboard.jsp");
				break;
			}
		} catch (Exception exc) {
			throw new ServletException(exc);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
