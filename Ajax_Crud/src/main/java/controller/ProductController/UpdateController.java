package controller.ProductController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.ProductDao;
import model.Product;

@WebServlet("/update")
public class UpdateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		String action=req.getParameter("action");
		int uid=Integer.parseInt(req.getParameter("uid"));
		ProductDao pd=new ProductDao();
		if(action.equals("delete")) {
			int i=(pd.deleteProduct(uid));
			if(i>0) {
				pw.write("Data Deleted!!");
			}
		}
		else if(action.equals("update")) {
			Product p=pd.getProductById(uid);
			Gson gson=new Gson();
			String data=gson.toJson(p);
			pw.write(data);
		}
	}
}
