<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
input {
	width: 400px;
	height: 40px;
}
</style>
</head>
<body>
<%@page isErrorPage="true"  errorPage="error.jsp" %>
<center>
	<form name='frm' action='' method='POST'>
		<input type='text' name='first' value='' /><br>
		<br> <input type='text' name='second' value='' /><br>
		<br> <input type='submit' name='s' value='Calculate Division' /><br>
		<br>
	</form>
	</center>
	<%
	  String btn=request.getParameter("s");
	   if(btn!=null) //meaning is check button is click or not
	   {
		  String f=request.getParameter("first");
		  String s=request.getParameter("second");
		  int result=Integer.parseInt(f)/Integer.parseInt(s);
		  out.println("<h1>Division is "+result+"</h1>");
	   }
	%>
</body>
</html>
