package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberInsertControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		// TODO Auto-generated method stub
		System.out.println("입력처리하는 컨트롤입니다");
		String id = request.getParameter("id");
		String nm = request.getParameter("name");
		String ps = request.getParameter("passwd");
		String em = request.getParameter("email");
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPasswd(ps);
		vo.setName(nm);
		vo.setEmail(em);
		
		MemberService service = new MemberService();
		service.memberInsert(vo); //회원 정보가 한 건 입력되었다
		
		request.setAttribute("id", id); //id에 id값을 담아두자
		request.setAttribute("name", nm);
		
		//Dispatcehr 객체 forward
		request.getRequestDispatcher("memberResult/memberInsertOutput.jsp").forward(request,response); //요청정보를 들고(=>setAttribute값을 읽어서) memberInsertOutput.jsp으로 이동한다   
	}

}
