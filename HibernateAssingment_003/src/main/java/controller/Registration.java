package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.StudentDao;
import model.Student;
@MultipartConfig
@WebServlet("/reg")
public class Registration extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int uid = 0;
		String id = req.getParameter("id");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String pass = req.getParameter("pass");
		String gender = req.getParameter("gender");
		
		String img="img";
		String path=req.getServletContext().getRealPath("");
		String uploadPath=path+File.separator+img;
		System.out.println(uploadPath);
		
		File myfile=new File(uploadPath);
		if(!myfile.exists()) {
			myfile.mkdir();
			System.out.println("File Created...");
			System.out.println(myfile.getAbsolutePath());
		}
		Part file=req.getPart("file");
		String filename=Paths.get(file.getSubmittedFileName()).getFileName().toString();
		System.out.println(filename);
		file.write(uploadPath+File.separator+filename);
		
		
		if (!id.equals("")) {
			uid = Integer.parseInt(id);
		}
		Student std = new Student();
		std.setId(uid);
		std.setFname(fname);
		std.setLname(lname);
		std.setEmail(email);
		std.setMobile(mobile);
		std.setPass(pass);
		std.setGender(gender);
		std.setImg(filename);
		
		StudentDao dao = new StudentDao();

		if (id.equals("")) {
			Student email1 = dao.isEmailExist(std);
			if (email1 != null) {
				req.setAttribute("warn", "Email already exist!!");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			} else {
				dao.regStudent(std);
				req.setAttribute("msg", "Register Successfully!!");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		}
		else
		{
			dao.regStudent(std);
			req.getRequestDispatcher("display").forward(req, resp);
		}	}
}
