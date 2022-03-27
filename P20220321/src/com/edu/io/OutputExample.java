package com.edu.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExample {
	public static void main(String[] args) { //스트림은 예외처리를 반드시 해줘야한다
		try {
			OutputStream os = new FileOutputStream("first.dat");
			os.write(10);
			os.write(20);
			os.write(30);
			os.close(); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
