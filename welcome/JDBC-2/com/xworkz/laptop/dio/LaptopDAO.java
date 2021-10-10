package com.xworkz.laptop.dio;

public interface LaptopDAO {
	
	void saveLaptopRecord();

	void updateBrand();

	void updateBrandAndPrice();

	void deleteLaptopByID();

	void readSingleRecordByID();

	void readAllRecords();
	
	void readLaptopBrandByID();
	
	void readLaptopColorByID();
	
	void readLaptopPriceByID();
	

	
	
	

}
