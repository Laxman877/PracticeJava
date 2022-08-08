package controller.ProductController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

@WebServlet("/addProduct")
public class AddProductController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid=req.getParameter("pid");
		String pname=req.getParameter("pname");
		double price =Double.parseDouble(req.getParameter("price"));

		Product p=new Product();
		p.setPname(pname);
		p.setPrice(price);

		ProductDao pd=new ProductDao();
		if(!uid.equals("")) {
			p.setPid(Integer.parseInt(uid));
			int i=pd.updateProduct(p);
			if(i>0) {
				ArrayList<Product> al=pd.getAllProduct();
				req.setAttribute("data", al);
				req.getRequestDispatcher("product.jsp").forward(req, resp);
			}
		}else {
			boolean b=pd.isExist(p);
			if(b) {
				ArrayList<Product> al=pd.getAllProduct();
				req.setAttribute("data", al);
				req.setAttribute("err", "Product Already Exist!!");
				req.getRequestDispatcher("product.jsp").forward(req, resp);
			}else {
				int i=pd.addProduct(p);
				if(i>0) {
					ArrayList<Product> al=pd.getAllProduct();
					req.setAttribute("data", al);
					req.setAttribute("msg", "Product Added Successfully!!");
					req.getRequestDispatcher("product.jsp").forward(req, resp);
				}
			}
		}
	}
}
