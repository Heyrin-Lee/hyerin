package co.edu;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class EmployeePerDept
 */
@WebServlet("/EmployeePerDept")
public class EmployeePerDept extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public EmployeePerDept() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.66:1521:xe", "hr", "hr"); //db주소,id,password를 통해서 DB에 접속한다.. 리턴 타입은 Connection
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sql = "select e.department_id, d.department_name, count(1) as cnt from employees e, departments d\r\n"
				+ "where e.department_id = d.department_id\r\n"
				+ "group by e.department_id, d.department_name";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			Map<String, Integer> map = new HashMap<String, Integer>(); //List Collection 으로 담기
			while(rs.next() ) { 
				map.put(rs.getString("department_name"),rs.getInt("cnt")); 
			}
			Gson gson = new GsonBuilder().create();
			response.getWriter().print(gson.toJson(map)); //Json 타입으로 변환
			return;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//{"err":"에러 발생"}
		response.getWriter().print("{\"err\":\"에러 발생\"}");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
