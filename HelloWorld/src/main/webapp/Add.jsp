<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
		int n1 = Integer.parseInt(request.getParameter("num1")) ;
	    int n2 = Integer.parseInt(request.getParameter("num2")) ;
	    int o = n1+n2;
	    out.println("output: "+o);
	
	%>
	<form action="Hi.jsp">
	enter option : <input type = "text" name = "option">
	<input type = "submit">
	</form>
	
	
	
	
	
</body>
</html>