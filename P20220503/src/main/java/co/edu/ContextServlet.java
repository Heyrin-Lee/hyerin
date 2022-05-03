package co.edu;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextServlet
 */
@WebServlet("/ContextServlet")
public class ContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletContext sc = null; //doGet, doPost에도 쓰기 위해서 지정
       
    
    public ContextServlet() {
        super();
    }
    
   @Override
public void init(ServletConfig config) throws ServletException {
	   sc = config.getServletContext(); //sc(servlet) => application(jsp) 이름만 다르고 같다
	   sc.setAttribute("name", "hong");
	super.init(config);
}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("name: " + sc.getAttribute("name"));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
