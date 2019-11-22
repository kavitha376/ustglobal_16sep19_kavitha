package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MyfirstDeleteWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FileReader reader = null;

		try {
//		step1	load driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String url = prop.getProperty("url");
			
			conn = DriverManager.getConnection(url,prop);

			String sql = prop.getProperty("delete-query");
//	step3 issue sql query	
			pstmt = conn.prepareStatement(sql);

			String empid = args[0];
			int id = Integer.parseInt(empid);
			
//            String name = args[1];
//            
//            String empsal = args[2];
//            int sal = Integer.parseInt(empsal);
//            
//            String gender = args[3];
            
            pstmt.setInt(1, id);
            
//            or
//            pstmt.setInt(1, Integer.parseInt(args[0]));
//            check how many parameter 1 r many
//            pstmt.setString(1, name);
//            pstmt.setInt(2, sal);
//            pstmt.setString(3, gender);
//            
			int count = pstmt.executeUpdate();
        System.out.println(count +"row(s) updated");
//			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(conn!= null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}if(rs!=null) {
					rs.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}



}
