<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%
		String first=request.getParameter("fn");
		String last=request.getParameter("ln");
		
		out.print("<h2>"+first+" "+last+"</h2>");
	%>
</body>
</html>