package com.employee;

public class Data 
{
	String id;
	String name;
	String mobile;
	public Data(String id, String name, String mobile) 
	{
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getMobile()
	{
		return mobile;
	}
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}
	
	
}
