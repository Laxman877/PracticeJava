package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class ValidateServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String mobile=req.getParameter("mobile");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		pw.print("<h1>Fname : "+fname+"</h1>");
		pw.print("<h1>Lname : "+lname+"</h1>");
		pw.print("<h1>Mobile : "+mobile+"</h1>");
		pw.print("<h1>Email : "+email+"</h1>");
		pw.print("<h1>Pass : "+pass+"</h1>");
	}
}
