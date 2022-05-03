package co.dev.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//필요한 서블릿 모아놓기
public class FrontController extends HttpServlet {
	HashMap<String, Control> list = null; //key:String타입, value:Control ==> String타입의 key값을 넣으면 Control Class타입의 값을 받아오겠다 
	//MemberInsertControl, MemberUpdateControl은 Control 인터페이스 클래스를 구현하고있다(implements) ==> Control Class타입의 value값
	String charset = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		charset = config.getInitParameter("charset");
		list = new HashMap<String, Control>(); 
		list.put("/memberInsert.do", new MemberInsertControl()); //서블릿에 따라 입력작업/수정작업이 다르게 출력된다 => 주소 표시창이 어떤 서블릿을 호출하는지에 따라 작업을 구분해서 처리한다 
		list.put("/memberUpdate.do", new MemberUpdateControl()); //"/memberUpdate.do":키값, new MemberUpdateControl(): value값
		list.put("/memberList.do", new MemberListControl());
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding(charset); //web.xml에서 저장한 charset으로 요청한다 => 한글로 읽어오도록해!
		//req.setCharacterEncoding("utf-8"); //request: 요청한다! 한글형태로 파일을 불러오기를 요청한다!
		resp.setCharacterEncoding("UTF-8"); //response: 응답한다! 한글형태의 파일로 응답받는다!
		resp.setContentType("text/html;charset=UTF-8");
		
		String url = req.getRequestURI(); // ==> /P20220503/ memberInsert.do
		String context = req.getContextPath(); //ContextPath = /P20220503 (=프로젝트 이름)
		String path = url.substring(context.length()); //memberInsert.do/memberUpdate.do을 path라는 변수에 담아준다
		
		Control exeCon = list.get(path); //get() 매소드: list.get(path) = value값 *ex)) memberInsert.do라는 key값을 담은 변수 path를 list에서 가져오면 memberInsertControl()의 value값이 나올 거야*
		exeCon.execute(req, resp); //exeCon(=value값)을 실행시킬거야 --> MemberInsertControl 인터페이스에 있는 execute()가 실행됐을 때 "입력처리하는 컨트롤입니다"가 출력될거야
	}
	
}
