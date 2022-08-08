package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String gender=req.getParameter("gender");
		String password=req.getParameter("password");
		
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>First Name : "+fname+"</h1>");
		System.out.println("first name: "+fname);
		pw.print("<h1>Last Name : "+lname+"</h1>");
		System.out.println("last name: "+lname);
		pw.print("<h1>Email : "+email+"</h1>");
		System.out.println("email id: "+email);
		pw.print("<h1>Mobile : "+mobile+"</h1>");
		System.out.println("Mobile number: "+mobile);
		pw.print("<h1>Gender : "+gender+"</h1>");
		System.out.println("Gender: "+gender);
		pw.print("<h1>Password : "+password+"</h1>");
		System.out.println("Password: "+password);
	}
}
