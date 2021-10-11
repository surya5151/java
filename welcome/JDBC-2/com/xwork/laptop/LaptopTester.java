package com.xwork.laptop;
import java.sql.*;

import com.xworkz.laptop.dio.LaptopDAO;
import com.xworkz.laptop.dio.LaptopDAOImpl;

public class LaptopTester {

	public static void main(String[] args) throws SQLException {
		
		LaptopDAO laptopDAO = new LaptopDAOImpl();
		
		//laptopDAO.saveLaptopRecord();
		//laptopDAO.updateBrand();				
		//laptopDAO.updateBrandAndPrice();
		//laptopDAO.deleteLaptopByID();		
		//laptopDAO.readSingleRecordByID();
		//laptopDAO.readAllRecords();
			
		laptopDAO.readLaptopBrandByID();		
		//laptopDAO.readLaptopColorByID();
		//laptopDAO.readLaptopPriceByID();
		
		
		
		
	}
}