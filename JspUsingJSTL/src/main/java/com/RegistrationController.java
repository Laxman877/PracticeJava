package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Dbconnection;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String gender=req.getParameter("gender");
		String password=req.getParameter("password");
		Connection cn=Dbconnection.getConn();
		String qry="insert into studenttable values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setInt(1, 0);
			ps.setString(2, fname);
			ps.setString(3, lname);
			ps.setString(4, email);
			ps.setString(5, mobile);
			ps.setString(6, gender);
			ps.setString(7, password);
			int i=ps.executeUpdate();
			if(i>0) {
				req.setAttribute("msg", "Registration Successfully!!!");
				req.getRequestDispatcher("registration.jsp").forward(req, resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher("registration.jsp").forward(req, resp);
	}
}
