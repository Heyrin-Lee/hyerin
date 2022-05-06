package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberInsertControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		// TODO Auto-generated method stub
		//multipart요청이 들어오면 request,saveDir,maxSize,encoidng,renamePolicy 정책이 필요합니다
		String saveDir = "upload";
		saveDir = request.getServletContext().getRealPath(saveDir); 
		int maxSize = 1024*1024*10;
		String encoding = "utf-8";
		//multipart 요청(cos.jar)
		//request, 저장위치, 파일의 최대사이즈, 인코딩 방식, 리네임 정책을 정해준다. 
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy()); 
		//new DefaultFileRenamePolicy() : 똑같은 이름의 파일이 있으면 자동으로 이름을 바꿔주는 클래스
		
		System.out.println("입력처리하는 컨트롤입니다");
		
		String id = multi.getParameter("id");
		String nm = multi.getParameter("name");
		String ps = multi.getParameter("passwd");
		String em = multi.getParameter("email");
		String pf = multi.getFilesystemName("profile");
		
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPasswd(ps);
		vo.setName(nm);
		vo.setEmail(em);
		vo.setProfile(pf);
		
		MemberService service = new MemberService();
		service.memberInsert(vo); //회원 정보가 한 건 입력되었다
		
		request.setAttribute("id", id); //id에 id값을 담아두자
		request.setAttribute("name", nm);
		
		//Dispatcehr 객체 forward
		request.getRequestDispatcher("memberResult/memberInsertOutput.jsp").forward(request,response); //요청정보를 들고(=>setAttribute값을 읽어서) memberInsertOutput.jsp으로 이동한다   
	}

}
