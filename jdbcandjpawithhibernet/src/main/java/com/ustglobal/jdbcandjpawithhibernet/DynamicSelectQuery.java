package com.ustglobal.jdbcandjpawithhibernet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
//		step1	load driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
//		step2	get connection
			conn = DriverManager.getConnection(url);
			
			String sql = "select * from employee_info where id =?";
//	step3 issue sql query	
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

//			step4 read the result
			if(rs.next()) {
				int emp_id = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("Id: "+emp_id);
				System.out.println("Name: "+name);
				System.out.println("salary: "+sal);
				System.out.println("gender: "+gender);
				System.out.println("*****************");
			}
			
			
		} catch (SQLException e) {
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
