package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.entity.Seller;

public class SellerDao {
	
	private  Connection conn;

	public SellerDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean register(Seller s) 
	{
		boolean f=false;
		
		try {
			String sql="insert into seller_details(full_name,email,password) values(?,?,?) ";
			
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, s.getFull_name());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getPassword());
			
			
			int i=ps.executeUpdate();
			
			if(i==1)
			{
				f=true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
	 }
	return f;
	}
}
