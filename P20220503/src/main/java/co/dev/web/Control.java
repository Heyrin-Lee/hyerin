package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Control {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException; //execute()라는 추상매소드 선언 + 예외도 등록
	
}
