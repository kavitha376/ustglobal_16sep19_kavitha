package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstinsertWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt  = null;
		FileReader reader = null;


		try {
			//step 1 load the driver
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//step 2 get the connection
			
			Class.forName(prop.getProperty("driver-class-name"));

			
	          String url = prop.getProperty("url");

			conn = DriverManager.getConnection(url,prop);


			//step 3 issue sql query
			String sql = prop.getProperty("insert-query");
//			String sql = "update employee_info set name='gowdthi',sal=20000,gender='f' where id=6";

			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal); 
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			
			
			int count = pstmt.executeUpdate();

			//  step 4 read the result 
			System.out.println(count + "Row(s) inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!= null) {
					conn.close();
				}if(pstmt!= null) {
					pstmt.close();
//				}if(stmt!= null) {
//					stmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}


	}
	//	end of main()
}
