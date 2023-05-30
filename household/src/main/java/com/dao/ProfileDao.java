package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Profile;


public class ProfileDao {
	
	private  Connection conn;
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public boolean register(Profile s) 
	{
		boolean f=false;
		if(conn == null) {
			System.out.println("Connection Is Null..//");
		}
		
		try {
			String sql="insert into profile(firstname,lastname,email,password,contact,address,product,product_dtls) values(?,?,?,?,?,?,?,?) ";
			
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, s.getFirstname());
			ps.setString(2, s.getLastname());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getPassword());
			ps.setString(5, s.getContact());
			ps.setString(6, s.getAddress());
			ps.setString(7, s.getProduct());
			ps.setString(8, s.getProduct_dtls());
			
			
			int i=ps.executeUpdate();
			
			if(i==1)
			{
				f=true;
			}
			else {
				f=false;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
	 }
	return f;
	
	}
	public List <Profile> getAllProfile(){
		List<Profile> list=new ArrayList<Profile>();
		Profile f=null;
		try {
		String sql="select * from profile order by id desc";
		PreparedStatement ps=conn.prepareStatement(sql);

		ResultSet rs=ps.executeQuery();
		while(rs.next()){
}

	} catch (Exception e) {
	e.printStackTrace();
	
	return list;
	}
		return list;}}
	