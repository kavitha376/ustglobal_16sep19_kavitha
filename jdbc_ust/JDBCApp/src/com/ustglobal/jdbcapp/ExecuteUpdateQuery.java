package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt  = null;

		try {
			//step 1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step 2 get the connection
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);


			//step 3 issue sql query
//			String sql = " insert into employee_info values(6,'vismitha',10000,'F') ";
			String sql = "update employee_info set name='gowdthi',sal=20000,gender='f' where id=6";

			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			//  step 4 read the result 
			System.out.println(count + "Row(s) inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!= null) {
					conn.close();
				}if(stmt!= null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}


	}
	//	end of main()

}
