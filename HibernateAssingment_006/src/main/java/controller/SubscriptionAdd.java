package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReaderDao;
import model.Subscription;

@WebServlet("/addsubscritpion")
public class SubscriptionAdd extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String subscriptionName=req.getParameter("subscriptionName");
		
		Subscription sub=new Subscription();
		sub.setSubscriptionName(subscriptionName);
		
		ReaderDao dao=new ReaderDao();
		dao.addsubcriber(sub);
		req.setAttribute("msg", "Subscription added..");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
