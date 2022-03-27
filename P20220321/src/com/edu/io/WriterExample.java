package com.edu.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
	public static void main(String[] args) {
		// 문자 기반의 출력스트림을 생성..second.txt
		try {
			FileWriter fw = new FileWriter("second.txt");
			fw.write("Hello\n");
			fw.write("World\n");
			fw.close(); //다 쓴 스트림은 운영체제에 리소스를 반환해줘야 한다
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
		
	}
}
