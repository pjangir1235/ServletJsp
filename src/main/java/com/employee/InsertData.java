package com.employee;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertData
{
	public void Save(Data d)
	{
	
		try
		{
			Connection con=ConnectionEstablish.ConnectionObject();
			String query="insert into servlet_streams_exercises value(?,?,?);";
			PreparedStatement pr=con.prepareStatement(query);
			pr.setString(1, d.getId());
			pr.setString(2, d.getName());
			pr.setString(3, d.getMobile());
			pr.executeUpdate();
	        con.close();
		}
		catch(Exception e){e.printStackTrace();}
	
	}
}

