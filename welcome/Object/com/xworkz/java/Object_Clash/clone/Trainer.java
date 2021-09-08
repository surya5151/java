package com.xworkz.java.Object_Clash.clone;

public class Trainer {
	String name;
	String gender;
	int yearOfExperience;
	
	Trainer(String name, String gender, int yearOfExperience){
		this.name=name;
		this.gender= gender;
		this.yearOfExperience=yearOfExperience;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Trainer) {
			Trainer trainer = (Trainer) obj;
			if(this.name.equals(trainer.name)) {
				if(this.gender.equals(trainer.gender)) {
					if(this.yearOfExperience==(trainer.yearOfExperience)) {
						return true;							
					}					
					
					
					
					else {
						return false;
					}					
					
				}
				else {
					return false;
				}
				
			}
			else {
				return false;
			}
			
		}
		else {
			return false;
		}
		
	}
	

}
