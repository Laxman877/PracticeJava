package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

@WebServlet("/login")
public class UserLoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		
		
		User u=new User();
		u.setEmail(email);
		u.setMobile(mobile);
		
		UserDao dao=new UserDao();
		boolean b =dao.loginCheck(u);
		if(b) {
			Random rd=new Random();
			int otp=rd.nextInt(9999);
			System.out.println("Your Otp: "+otp);
			ServletContext sx=req.getServletContext();
			sx.setAttribute("myotp", otp+"");
			
			HttpSession session=req.getSession();
			session.setAttribute("email", email);
			req.getRequestDispatcher("otp.jsp").forward(req, resp);
		}else {
			req.setAttribute("err", "Invalid Email Or Mobile");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
