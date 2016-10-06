package com.bitwise.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bitwise.models.*;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProfileServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		PrintWriter out = response.getWriter();

		if (session.getAttribute("personalDetail") != null && session.getAttribute("contactDetail") != null) {
			PersonalDetail personalDetail = (PersonalDetail) session.getAttribute("personalDetail");
			ContactDetail contactDetail = (ContactDetail) session.getAttribute("contactDetail");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>YOUR PROFILE</title>");
			out.println("<link rel='stylesheet' type='text/css' href='css/home.css' />");
			out.println("<link rel='stylesheet' type='text/css' href='css/mainmenu.css' />");
			out.println("</head>");
			out.println("<body bgcolor=\"pink\">");
			out.println("<div id='main'>");
			out.println("<b>"+"YOUR PROFILE"+"<b>"+"<br><br><br>");
			out.println("Name :" + personalDetail.getFullName() + "<br>");
			out.println("Father's name :" + personalDetail.getFatherName() + "<br>");
			out.println("Mother's name :" + personalDetail.getMotherName() + "<br>");
			out.println("Gender :" + personalDetail.getGender() + "<br>");
			out.println("Hobby :" + personalDetail.getHobby() + "<br>");
			out.println("Date of Birth :" + personalDetail.getDateOfBirth() + "<br>");
			out.println("Email :" + personalDetail.getEmailId() + "<br>");
			out.println("Occupation :" + personalDetail.getOccupation() + "<br>");
			out.println("Nationality :" + personalDetail.getNationality() + "<br>");
			out.println("Address :" + contactDetail.getAddress() + "<br>");
			out.println("Pincode :" + contactDetail.getPincode() + "<br>");
			out.println("City :" + contactDetail.getCity() + "<br>");
			out.println("State :" + contactDetail.getState() + "<br>");
			out.println("Country :" + contactDetail.getCountry() + "<br>");
			out.println("Mobile :" + contactDetail.getMobile() + "<br>");
			out.println("Landline :" + contactDetail.getLandline() + "<br>");
			out.println("<a href='ShowLogoutServlet'>LogOut</a>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
