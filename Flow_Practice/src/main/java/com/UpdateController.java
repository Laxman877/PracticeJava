package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DbConnection;

@WebServlet("/update")
public class UpdateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action=req.getParameter("action");
		int uid=Integer.parseInt(req.getParameter("uid"));
		Connection cn=DbConnection.getConn();
		if(action.equals("delete")) {
			try {
				PreparedStatement ps=cn.prepareStatement("delete from studenttable where id=?");
				ps.setInt(1, uid);
				int i=ps.executeUpdate();
				if(i>0) {
					ArrayList<User> al=new ArrayList<User>();
					req.setAttribute("data", al);
					req.getRequestDispatcher("show").forward(req, resp);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(action.equals("update")) {
			User u=new User();
			try {
				PreparedStatement ps=cn.prepareStatement("select * from studenttable where id=?");
				ps.setInt(1, uid);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					u.setId(rs.getInt(1));
					u.setFname(rs.getString(2));
					u.setLname(rs.getString(3));
					u.setEmail(rs.getString(4));
					u.setMobile(rs.getString(5));
					u.setGender(rs.getString(6));
					u.setPass(rs.getString(7));
				}
				req.setAttribute("udata", u);
				req.getRequestDispatcher("edit.jsp").forward(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
