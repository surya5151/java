package com.xwork.laptop;
import java.sql.*;

public class LaptopTester {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="surya1991";
		
		String insertQuery="INSERT INTO laptops VALUES  (2,'sony','white',60000); ";
		
		String updateQuery="update laptops set BRAND='mackBook' where ID=3;";
		
		String updateBrandAndPrice="update laptops set brand='macbookpro', PRICE=70000 where ID=3;";
		 
		String deteOneRow ="delete from laptops where id=3;";
		
		String readSingleRecordByID="select*from laptops where id=3;";
		
		String readAllRecord = "SELECT * FROM laptops;";
		Connection connection = null;
		try { 
			//Class.forName("com.mysql.cj.jdbc.Driver");			
			connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is sucessful "+url);
			
			Statement statement = connection.createStatement();
			
			//statement.executeUpdate(readSingleRecordByID);
			
			ResultSet resultset=statement.executeQuery(readAllRecord);
					
			while (resultset.next()) {
			System.out.println("LaptopID- "+resultset.getInt(1));
			System.out.println("BRAND- "+resultset.getString(2));
			System.out.println("COLOR- "+resultset.getString(3));
			System.out.println("Price- "+resultset.getDouble(4));
			}
						
//			for(int i=0; i<3; i++) {				
//				resultset.next(); 
//				System.out.println("LaptopID- "+resultset.getInt(1));
//				System.out.println("BRAND- "+resultset.getString(2));
//				System.out.println("COLOR- "+resultset.getString(3));
//				System.out.println("Price- "+resultset.getDouble(4));
//				}
//						
//			resultset.next();
//			System.out.println("LaptopID- "+resultset.getInt(1));
//			System.out.println("BRAND- "+resultset.getString(2));
//			System.out.println("COLOR- "+resultset.getString(3));
//			System.out.println("Price- "+resultset.getDouble(4));
//			
//			resultset.next();
//			System.out.println("LaptopID- "+resultset.getInt(1));
//			System.out.println("BRAND- "+resultset.getString(2));
//			System.out.println("COLOR- "+resultset.getString(3));
//			System.out.println("Price- "+resultset.getDouble(4));
			
//			System.out.println(resultset);
			
		} catch (Exception Exception) {
			System.out.println("inside sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
		finally{
			if(connection !=null) {
				connection.close();
				System.out.println("connection closed......");			
			}else {
				System.out.println("Connection is not closed..!!!!!!!!!!!!");
			}
		}		
			
	}
}
