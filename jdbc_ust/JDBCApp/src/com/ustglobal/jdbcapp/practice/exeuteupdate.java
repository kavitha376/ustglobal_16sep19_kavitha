package com.ustglobal.jdbcapp.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class exeuteupdate {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
	  try {
		  Driver driver = new Driver();
		  DriverManager.registerDriver(driver);
          
		  
		  String url = "";
		  DriverManager.getConnection(url);
		  
		  stmt = conn.createStatement();
//		  sql = "";
//		  rs = stmt.executeQuery(sql);
		  
	} catch (Exception e) {

	}	
	}

}
