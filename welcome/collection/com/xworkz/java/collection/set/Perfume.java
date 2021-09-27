package com.xworkz.java.collection.set;

import java.util.Objects;

public class Perfume {

	String brand;
	double prize;
	String flavor;
	String type;
	
	public Perfume(String brand,double prize,String flavor,String type) {
		this.brand=brand;
		this.flavor=flavor;
		this.prize=prize;
		this.type=type;
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, flavor, prize, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfume other = (Perfume) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(flavor, other.flavor)
				&& Double.doubleToLongBits(prize) == Double.doubleToLongBits(other.prize)
				&& Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Perfume [brand=" + brand + ", prize=" + prize + ", flavor=" + flavor + ", type=" + type + "]";
	}
}
