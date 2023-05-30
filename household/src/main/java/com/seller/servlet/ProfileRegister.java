package com.seller.servlet;

import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ProfileDao;

import com.db.DBConnect;
import com.entity.Profile;

@WebServlet("/ProfileRegister")
public class ProfileRegister extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/household","root","Shweta@1234");
			String firstname=req.getParameter("firstname");
			String lastname=req.getParameter("lastname");

			String email=req.getParameter("email");
			String password=req.getParameter("password");
			String contact=req.getParameter("contact");
			String address=req.getParameter("address");
			String product=req.getParameter("products");
			String product_dtls=req.getParameter("product_dtls");

			

			Profile s = new Profile();
			s.setFirstname(firstname);
			s.setLastname(lastname);
			s.setEmail(email);
			s.setPassword(password);
			s.setContact(contact);
			s.setAddress(address);
			s.setProduct(product);
			s.setProduct_dtls(product_dtls);
			
			ProfileDao dao =new ProfileDao();
			dao.setConn(conn);
			
			HttpSession session=req.getSession();
			
			
			boolean f=dao.register(s);
			if(f == true)
			{
				session.setAttribute("sucMsg", "Register Successfully");
				resp.getWriter().println(session.getAttribute("sucMsg"));
				resp.sendRedirect("admin/Index.jsp");
				
			}else if(f == false){
				session.setAttribute("errorMsg", "something wrong on server");
				resp.getWriter().println(session.getAttribute("errorMsg"));
				resp.sendRedirect("admin/Index.jsp");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}}}
		
		
		
	
	

