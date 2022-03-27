package com.edu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
	public static void main(String[] args) {
		try {
			// 문자기반 스트림(한 문자씩 읽어오거나 쓸것이다)
			FileReader fr = new FileReader("second.txt");
			int readChar = -1;
			while((readChar = fr.read()) != -1) {
				System.out.print((char) readChar); //강제형변환.. 유니코드 값이 아니라 문자형태로 읽어오기 위해 char으로 강제형변환
			}
			fr.read();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
