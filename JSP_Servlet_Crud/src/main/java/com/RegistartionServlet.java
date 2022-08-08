package com;

import java.io.IOException;
import java.io.PrintWriter;
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
public class RegistartionServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String gender=req.getParameter("gender");
		String pass=req.getParameter("pass");
		if(!id.equals("")) {
			int uid=Integer.parseInt(id);
		}
		Connection cn=Dbconnection.getConn();
		String qry="insert into studenttable values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setInt(1, 0);
			ps.setString(2, fname);
			ps.setString(3, lname);
			ps.setString(4, mobile);
			ps.setString(5, email);
			ps.setString(6, gender);
			ps.setString(7, pass);
			int i=ps.executeUpdate();
			if(i>0) {
				req.setAttribute("msg", "Registration Successfully!!!");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
