package com.xworkz.job;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/job")
public class JobApplicationServlet extends HttpServlet
{
	List <JobDTO> dtos = new ArrayList();
	private HttpServletResponse resp2;
  public JobApplicationServlet()
  {
	 System.out.println(this.getClass().getSimpleName());
  }
  @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  
	  System.out.println("Service method is created ");
	  resp.setContentType("type/html");
	  String name=req.getParameter("name");
	  String email=req.getParameter("email");
	  String mobileNo=req.getParameter("mobileNo");
	  String altNo =req.getParameter("altNo");
	  String gend =req.getParameter("gend");
	  String qualification =req.getParameter("qualification");
	  String University=req.getParameter("University");
	  String addresss =req.getParameter("addresss");
	  String Skills =req.getParameter("Skills");
	  String Package =req.getParameter("Package");
	  String experience  =req.getParameter("experience");
	  String idproof =req.getParameter("idproof");
	  String idProofNo =req.getParameter("idProofNo");
	  
	  System.out.println("Name:"+name);
	  System.out.println("Email:"+email);
	  System.out.println("mobileNo:"+mobileNo);
	  System.out.println("altNo:"+altNo);
	  System.out.println("gend:"+gend);
	  System.out.println(" qualification :"+ qualification );
	  System.out.println(" University:"+ University);
	  System.out.println("addresss :"+addresss );
	  System.out.println(" Skills:"+ Skills);
	  System.out.println("Package :"+Package );
	  System.out.println("experience:"+experience);
	  System.out.println(" idproof :"+ idproof );
	  System.out.println(" idproofNo :"+ idProofNo );

	  
	PrintWriter writer = resp.getWriter();
	writer.append("<html>")
	.append("<body>")
	.append("<h1>")
	.append("registration is succesfull and here is the below details")
	.append("</h1>")
	.append("name :"+name).append("<br/>")
	.append("email :"+email).append("</br>")
	.append("mobileNo"+mobileNo).append("<br/>")
	.append("altNo :"+altNo).append("</br>")
	.append("Gend:"+gend).append("<br/>")
	.append("Qualification :"+qualification).append("</br>")
	.append("university:"+University).append("<br/>")
	.append("Addresss:"+addresss).append("</br>")
	.append("skills:"+Skills).append("<br/>")
	.append("Package:"+Package).append("</br>")
	.append("experience:"+experience).append("<br/>")
	.append("idproof:"+idproof).append("</br>")
	.append("idProofNo:"+idProofNo).append("</br>");
	
	JobDTO dto = new JobDTO(name,email,Long.parseLong(mobileNo),
			Long.parseLong(altNo),gend,qualification,University,
			addresss,Skills,Double.parseDouble(Package),Integer.parseInt(experience),idproof,idProofNo);
			dtos.add(dto);
	
	
}
  
}
