package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

import com.dao.ProfileDao;

public class DBConnect {

		private static Connection conn;
		
		public  static Connection getConn()
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/household","root","Shweta@1234");
				ProfileDao pd= new ProfileDao();
				pd.setConn(conn);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return conn;
		}
	
	
	
}
