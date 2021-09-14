package com.xworkz.java.compile_time_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException {
	public static void main(String[] args) {
		
		try {
			FileReader fd = new FileReader("F:\\JAVA Class Notes\\bahubali.txt");
			BufferedReader br= new BufferedReader(fd);
			
			System.out.println(br.readLine());
			br.close();
						
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
