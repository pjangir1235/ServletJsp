<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validate</title>
</head>
<body>
	<%
		String email=request.getParameter("email").toString();
		String email_regex = "[A-Z]+[a-zA-Z_]+@\b([a-zA-Z]+.){2}\b?.[a-zA-Z]+";
		Boolean b = email.matches(email_regex);
		if(b==true)
			out.println("Email is correct");
		else
			out.println("Email is incorrect");
	%>
</body>
</html>