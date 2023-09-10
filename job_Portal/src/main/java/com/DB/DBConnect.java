package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	private static Connection conn;
	
	public static Connection getConn(){
		
		
		try {
			if(conn==null || conn.isClosed()){
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:6630/job_portal"
						,"root","1234");
				System.out.println("Connection established successfully!");
			       
			}
			
		} catch (Exception e) {
			System.out.println("Failed to establish the database connection!");
			e.printStackTrace();
		}
		
		
		return conn;
		
	}

}
