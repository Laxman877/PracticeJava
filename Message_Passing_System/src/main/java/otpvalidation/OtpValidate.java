package otpvalidation;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/otp")
public class OtpValidate extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String otp=req.getParameter("otp");
		
		ServletContext cx=req.getServletContext();
		String myotp=(String) cx.getAttribute("myotp");
		if(otp.equals(myotp)) {
			req.getRequestDispatcher("display").forward(req, resp);
		}else {
			req.setAttribute("err", "Invalid Otp");
			req.getRequestDispatcher("otp.jsp").forward(req, resp);
		}
	}
}
