package resort;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/Rajini")
public class ResortServlet extends HttpServlet 
{
  public ResortServlet()
  {
	  System.out.println("default constructor is created...");
  }
  @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	 System.out.println("Service method is created in resortServlet");

	 System.out.println("service method si creted in fire servlet");
	 String type = req.getParameter("name");
	 String type1 = req.getParameter("SalaryPackage");
	 String type2 = req.getParameter("SoftwareDeveloper");
	 
	 resp.setContentType("type/http");
	 PrintWriter writer=resp.getWriter();
	 writer. append("<html><head><body bgcolor:'Yellow';><h1 style ='color:black;'>"
	  +"yellowcolor is displyed on the screen")
	 .append("</h1></head></html>");
	 PrintWriter writer1= resp.getWriter();
	
	}
}
