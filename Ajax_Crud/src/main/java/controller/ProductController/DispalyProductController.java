package controller.ProductController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

@WebServlet("/product")
public class DispalyProductController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		ProductDao pd=new ProductDao();
		ArrayList<Product> al=pd.getAllProduct();
		pw.write("<table class='table'><tr><th>PID</th><th>PNAME</th><th>PRICE</th><th>ACTION</th></tr>");
		for(Product p:al) {
			pw.write("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getPrice()+"</td>");
			pw.write("<td><button class='btn btn-success' onclick='deleteData("+p.getPid()+")'>Delete</button></td>");
			pw.write("<td><button class='btn btn-primary' onclick='updateData("+p.getPid()+")'>Update</button></td></tr>");
		}
		pw.write("</table>");
	}
}
