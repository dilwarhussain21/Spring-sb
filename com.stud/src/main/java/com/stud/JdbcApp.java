package com.stud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcApp {
	public static void insertData(int roll, String name) throws SQLException, ClassNotFoundException {
		//jdbc code
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Dil@12345";
		
		String sql = "INSERT INTO stud VALUES(?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, roll);
		ps.setString(2, name);
		
		ps.executeUpdate();
	}
}
