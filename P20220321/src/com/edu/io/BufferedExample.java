package com.edu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io*;  위 코드들을 줄이고 싶다면

public class BufferedExample {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("C:/temp/image.jpg"); //FileInputStream은 기본스트림
			BufferedInputStream bis = new BufferedInputStream(fis); // BufferedInputStream(fis)는 매개값을 갖는 보조스트림.. 성능을 향상시켜서 출력시키는 역할
			BufferedOutputStream bos = //
					new BufferedOutputStream(new FileOutputStream("C:/temp/copy3.jpg"));){ //출력스트림
			int readByte = -1;
			while((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
		} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("end of prog");
	}
}
