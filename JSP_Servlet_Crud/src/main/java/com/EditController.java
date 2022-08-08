package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Dbconnection;

@WebServlet("/edit")
public class EditController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection cn=Dbconnection.getConn();
		String id=req.getParameter("id");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String gender=req.getParameter("gender");
		String pass=req.getParameter("pass");
		
		try {
			PreparedStatement ps=cn.prepareStatement("update studenttable set fname=?,lname=?,email=?,mobile=?,gender=?,pass=? where id=?");
			ps.setInt(7, Integer.parseInt(id));
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, mobile);
			ps.setString(5, gender);
			ps.setString(6, pass);
			int i=ps.executeUpdate();
			ArrayList<User> al=new ArrayList<User>();
			req.setAttribute("data", al);
			req.setAttribute("msg", "Data Updated!!");
			req.getRequestDispatcher("edit.jsp").forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
