package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberSearchControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String job = request.getParameter("job");
		
		String path = "";
		if(job.equals("search")) { //job이라는 값이 search라면(memberSearch.jsp에서 job의 parameter값을 search로 설정하였음) *MemberSearchControl을 조회,수정,삭제 기능 모두에 사용할 것이기 때문에 if문 생성==>id로 조회해와야 하는 작업이기 때문*
			path = "memberView/memberSearch.jsp";
		} else if(job.equals("update")) { //job이라는 값이 update에서 왔다면
			path = "memberView/memberUpdate.jsp";
		} else if(job.equals("delete")) { //job이라는 값이 delete에서 왔다면
			path = "memberView/memberDelete.jsp";
		}
		
		if(id.isEmpty()) {
			request.setAttribute("error", "아이디를 입력하세요");
			request.getRequestDispatcher(path).forward(request, response);
			return; //매소드 종료
		}
		
		MemberService service = new MemberService();
		MemberVO member = service.memberSearch(id);
		
		if(member == null) {
			request.setAttribute("result", "조회된 정보가 없습니다");
		}
		request.setAttribute("member", member); //(member변수는 실제 조회된 결과값을 가지고 있는 참조변수) 조회된 결과값을 가지고 있는 주소갑을 넣어서 결과 반환
		
		if(job.equals("search")) {
			path = "memberResult/memberSearchOutput.jsp";
		}
		request.getRequestDispatcher(path).forward(request, response);
	}

}
