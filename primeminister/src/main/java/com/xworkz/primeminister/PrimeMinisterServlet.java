package com.xworkz.primeminister;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns ="/Rajini")
public class PrimeMinisterServlet extends HttpServlet 
{
  public void PrimeMinister()
  {
	  System.out.println("default constructor is created");
  }
  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Dopost method is created inside the ServletClass");
		String Name= req.getParameter("name");
		String Countryname= req.getParameter("CountryName");
		String married= req.getParameter("Married");
		String Party = req.getParameter("PartyName");
		String Gender= req.getParameter("female");
		String period = req.getParameter("Period");
		String time = req.getParameter("Time");
		
		req.setAttribute("nm",Name);
		req.setAttribute("cn",Countryname);
		req.setAttribute("marri",married);
		req.setAttribute("Par",Party);
		req.setAttribute("gend",Gender);
		req.setAttribute("pr",period);
		req.setAttribute("ti",time);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/contact.jsp");
		dispatcher.forward(req, resp);


		
	}
  
}
