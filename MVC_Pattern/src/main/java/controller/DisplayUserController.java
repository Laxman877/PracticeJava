package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/displayuser")
public class DisplayUserController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDao ud=new UserDao();
		ArrayList<User> al=ud.getAllUser();
		req.setAttribute("user", ud.getDataById(0));
		req.setAttribute("data", al);
		req.getRequestDispatcher("displayuser.jsp").forward(req, resp);
		
	}
}
