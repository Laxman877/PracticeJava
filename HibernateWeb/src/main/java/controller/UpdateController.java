package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User01;

@WebServlet("/update")
public class UpdateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action=req.getParameter("action");
		int uid=Integer.parseInt(req.getParameter("uid"));
		UserDao dao=new UserDao();
		if(action.equals("delete")) {
			dao.deleteEmp(uid);
			req.getRequestDispatcher("display").forward(req, resp);
		}else if(action.equals("update")) {
			User01 u=dao.getById(uid);
			req.setAttribute("data", u);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
