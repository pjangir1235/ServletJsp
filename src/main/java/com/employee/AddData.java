package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;

import com.mysql.cj.api.Session;

public class AddData extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		InsertData data=new InsertData();
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String mobile=req.getParameter("mobile");
		Data d=new Data(id,name,mobile);
		data.Save(d);
		out.println("SUccessfully Store");
		req.getRequestDispatcher("/nextpage").forward(req, res);
		
		
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		InsertData data=new InsertData();
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String mobile=req.getParameter("mobile");
		Data d=new Data(id,name,mobile);
		data.Save(d);
		out.println("SUccessfully Store");
		req.getRequestDispatcher("/nextpage").forward(req, res);
		
	}
		

}
