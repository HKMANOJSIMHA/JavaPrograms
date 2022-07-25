

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Ex1 extends HttpServlet {
	private String msg;
    
	public void init(ServletConfig config) throws ServletException {
		msg="Welcome....";
	}
	 
	public void destroy() {
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<h2>This is the message from servelet</h2>");
		out.print("<font color='red'"+msg+"</font>");
	}

}
