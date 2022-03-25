package com.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/temp/image.jpg");
			FileOutputStream fos = new FileOutputStream("C:/temp/copy2.jpg");
			
			int readByte = -1;
			byte[] readBytes = new byte[100]; //배열의 생성해서 읽어온 바이트만큼 쓰겠다.. 이 예제에서는 100바이트가 찰 때까지 읽어온다->처리속도가 빨라진다
			while((readByte = fis.read(readBytes)) !=-1) { //read파일 끝까지 읽어오겠다..-1이 될때까지
				fos.write(readBytes, 0, readByte);  // 배열, 시작 시점, 읽어올 데이터의값
//				fos.wirte(readBytes); //100바이트가 찰 때까지 읽어온다(읽어온 후 스트림을 바로 버리지 않는다)->처리속도가 빨라진다다
			}
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
