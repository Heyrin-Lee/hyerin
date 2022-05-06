package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberInsertJson implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/json;charset=utf-8");
		MemberVO vo = new MemberVO();
		
		boolean isMulti = ServletFileUpload.isMultipartContent(request); //multipart 형식인지 아닌지 체크
		
		if(isMulti) { //multipart 요청일 떄 
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
			
			
			vo = new MemberVO();
			vo.setId(id);
			vo.setPasswd(ps);
			vo.setName(nm);
			vo.setEmail(em);
			vo.setProfile(pf);
			
			MemberService service = new MemberService();
			service.memberInsert(vo);
			
		} else { //key:value 형식 요청일떄 
			String id = request.getParameter("id");
			String nm = request.getParameter("name");
			String ps = request.getParameter("passwd");
			String em = request.getParameter("email");
			
			vo = new MemberVO();
			vo.setId(id);
			vo.setPasswd(ps);
			vo.setName(nm);
			vo.setEmail(em);
			
			MemberService service = new MemberService();
			service.memberInsert(vo);
			
		}
		//Json 형태의 결과를 반환
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(vo));
	}
}
