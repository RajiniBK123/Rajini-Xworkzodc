package com.xworkz.company;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/company")

public class CompanyServlet extends HttpServlet
{
 public CompanyServlet()
 {
	 System.out.println(this.getClass().getSimpleName());
 }
 @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			}
 
}
