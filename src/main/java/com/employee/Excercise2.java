package com.employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Excercise2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String mobile=req.getParameter("mobile");
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("Id : "+id);
		out.println("Name : "+name);
		out.println("Mobile : "+mobile);
		
		
		
	}
}
