package com.evergent.java.jdbc.mysql;
import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args)throws Exception {
		Connection conn = null;
	      String url = "jdbc:mysql://localhost:3306/";
	      String dbName = "rohithdb";
	      String driverName = "com.mysql.jdbc.Driver";
	      String userName = "root";
	      String password = "admin";
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url+dbName,userName,password);
		//PreparedStatement ps = con.prepareStatement("insert into rohithdemo values('shiva','kmm',2);");
		PreparedStatement ps = con.prepareStatement(" update rohithdemo set name ='rajesh' where id=2;");
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("Success");
		}else {
			System.out.println("Not success"); 
		}
	}

}




//String sql = "UPDATE rohithdemo SET name = ? WHERE id = ?";
//ps = conn.prepareStatement(sql);
//ps.setString(1, "rajesh");
//ps.setInt(2, 2);
