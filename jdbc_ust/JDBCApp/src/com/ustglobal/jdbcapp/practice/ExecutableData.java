package com.ustglobal.jdbcapp.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecutableData {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_practi?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			stmt = conn.createStatement();
			String sql = "select * from student";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("id is: "+id);
				System.out.println("name is: "+name);
				System.out.println("gender is: "+gender);
				System.out.println("***************");
				
			System.out.println("id is ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!= null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
