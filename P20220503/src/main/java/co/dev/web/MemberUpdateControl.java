package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberUpdateControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		System.out.println("수정처리하는 컨트롤입니다");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String ps = request.getParameter("passwd");
		String em = request.getParameter("email");
		
		if(id.isEmpty() || name.isBlank() || ps.isBlank() || em.isBlank()) {
			request.setAttribute("error", "모든 항목을 입력하세요");
			request.getRequestDispatcher("memberView/memberUpdate.jsp").forward(request, response);
			return;
		}
		
		//처리된 결과가 있으면 업데이트한다
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setName(name);
		vo.setPasswd(ps);
		vo.setEmail(em);
		
		MemberService service = new MemberService();
		service.memberUpdate(vo);
		
		request.setAttribute("id", id);
		
		request.getRequestDispatcher("memberResult/memberUpdateOutput.jsp").forward(request, response);

	}

}
