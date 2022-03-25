package com.edu.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputExample {
	public static void main(String[] args) {
		
		try {
			// 입력스트림을 생성(first.dat 라는 파일을 입력스트림의 소스로 사용하고자함)
			InputStream is = new FileInputStream("first.dat");  // 출력스트림에서 만든 first.dat 파일을 읽어온다 
			int readByte = -1;
			while((readByte = is.read()) !=-1) { //is.read값을 읽어와서 readByte에 저장하는데, -1이 아닐 동안에 계속 반복해서 읽어오겠다.. 더 이상 읽을 값이 없으면 -1을 리턴하겠다
				System.out.println(readByte);	
			}
			is.close(); //리소스 반환
		} catch (IOException e) { //예외처리
			e.printStackTrace();
		}
	}
}
