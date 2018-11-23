package com.DB.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_TEST {
	public static Connection getCon() {
		Connection con=null;
		String url="jdbc:mysql://127.0.0.1:3306/student?autoReconnect=true&useSSL=false";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, "hbstudent", "hbstudent");
			System.out.println("conn found");
		} catch (ClassNotFoundException e) {
			System.out.println("error getting con db connection1 "+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error getting con db connection1 "+e.getMessage());
		}
		return con;

	}
	

}
