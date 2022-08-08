package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.Message;

@WebServlet("/msgpass")
public class SentMsg extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg=req.getParameter("msg");
		String to=req.getParameter("to");
		String from=req.getParameter("from");
		
		Message ms=new Message();
		ms.setFrom(from);
		ms.setMsg(msg);
		ms.setTo(to);
		
		UserDao dao=new UserDao();
		int i=dao.msgAdd(ms);
		req.setAttribute("msg", "Message sent successfully!!");
		req.getRequestDispatcher("display").forward(req, resp);
	}
}
