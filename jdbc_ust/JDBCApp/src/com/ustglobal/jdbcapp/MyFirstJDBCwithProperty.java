package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class MyFirstJDBCwithProperty {
	public static void main(String[] args) {
		Connection conn =  null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
//			step 1 load the driverr
			Class.forName(prop.getProperty("driver-class-name"));
//        GET THE CONNECTION
//			step 2
          String url = prop.getProperty("url");
		
			conn = DriverManager.getConnection(url,prop);

			
//			step 3 ISSUE SQL QUERY 
			
			stmt = conn.createStatement();
			String sql = prop.getProperty("select-query");
			rs = stmt.executeQuery(sql);
			
//			step 4 read  the results
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				System.out.println("Id : "+id);
				System.out.println("Name  : "+name);
				System.out.println("Salary : "+sal);
				System.out.println("Gender : "+gender);
				System.out.println("************");
			}


	 	} catch (Exception e) {
			e.printStackTrace();
		}
//		STEP 5 CLOSE ALL D CONNECTION for jdbc object
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}if(reader!=null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	} 


}
