package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class FileUploadServ
 */
@WebServlet("/fileUploadServlet")
public class FileUploadServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FileUploadServ() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		System.out.println("title: "+title+"content: "+content);
		
		String saveDir = "upload";
		saveDir = getServletContext().getRealPath(saveDir); //getServletContst():최상위 폴더를 기준으로 .getRealPath(saveDir) : saveDir폴더를 찾아오겠다
		int maxSize = 1024*1024*10;
		String encoding = "utf-8";
		//multipart 요청(cos.jar)
		//request, 저장위치, 파일의 최대사이즈, 인코딩 방식, 리네임 정책을 정해준다. 
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy()); //new DefaultFileRenamePolicy() : 똑같은 이름의 파일이 있으면 자동으로 이름을 바꿔주는 클래스
		title = multi.getParameter("title");
		content = multi.getParameter("content");
		String profile = multi.getOriginalFileName("profile");
		String fileName = multi.getFilesystemName("profile"); 
		System.out.println("title: "+title+",content: "+content + ",profile: "+profile +",file: "+fileName);
		
	}

}
