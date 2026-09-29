package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class sqlconn {

	public static void main(String[] args) throws Exception {
		
		//1.loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loaded");
		
		//2.establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root");
		System.out.println("your connection has established");
		
		//3.create a statement object
		Statement stmt = con.createStatement();
		
		//(Sql query)
		String sql = "SELECT * FROM employee";
		
		//4.create a result set
		ResultSet rs = stmt.executeQuery(sql);
		
		//5.REPRESENTING the data
		while(rs.next()) {
			System.out.println(
			rs.getInt(1)+" "+
			rs.getString(2)+" "+
			rs.getString(3)+" "+
			rs.getInt(4)
			);

		}
	}

}
