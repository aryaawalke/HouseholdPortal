package com.seller.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.SellerDao;
import com.db.DBConnect;
import com.entity.Seller;

@WebServlet("/Seller_register")
public class SellerRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String full_name=req.getParameter("full_name");
		
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			

			Seller s = new Seller(full_name, email, password);
			
			SellerDao dao =new SellerDao(DBConnect.getConn());
			
			HttpSession session=req.getSession();
			
			
			boolean f=dao.register(s);
			
			
			if(f)
			{
				session.setAttribute("sucMsg", "Register Successfully");
				resp.sendRedirect("profile.jsp");
				
			}else {
				session.setAttribute("errorMsg", "something wrong on server");
				resp.sendRedirect("signup.jsp");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}