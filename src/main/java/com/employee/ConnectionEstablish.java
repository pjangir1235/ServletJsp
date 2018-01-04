package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectionEstablish 
{
	private static volatile  Connection con=null;

	private ConnectionEstablish()
	{
		
	}
	public static synchronized Connection ConnectionObject()
	{
		if(con==null)
		{
			try
			{
				String url="jdbc:mysql://localhost:3306/au?useSSL=false";
				String user="root";
				String pass="root";
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection(url, user, pass);
			}
			catch(Exception e){e.printStackTrace();}
			return con;
		}
		return con;
	}
	
}
