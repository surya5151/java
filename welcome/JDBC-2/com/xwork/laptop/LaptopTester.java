package com.xwork.laptop;
import java.sql.*;

public class LaptopTester {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="surya1991";
		
		String insertQuery="INSERT INTO laptops VALUES  (2,'sony','white',60000); ";
		
		String updateQuery="update laptops set BRAND='mackBook' where ID=3;";
		
		String updateBrandAndPrice="update laptops set brand='macbookpro', PRICE=70000 where ID=3;";
		 
		String deteonerow ="delete from laptops where id=3;";
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is sucessful "+url);
			
			Statement statement = connection.createStatement();
			statement.executeUpdate(insertQuery);
			System.out.println("Delet last row");
			
		} catch (SQLException sqlException) {
			System.out.println(sqlException.getMessage());
			//sqlException.printStackTrace();
		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			classNotFoundException.printStackTrace();
		}
		
		
		
	}

}
