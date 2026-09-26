<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to jsp</h1>
<%
	int i=1;
String sname="Keerthivasan G";
while(i<=150)
{
	if(i%2==0)
		out.println("<br><font color='green'>"+i+" "+sname+"</font>");
	else
		out.println("<br><font color='red'>"+i+" "+sname+"</font>");
	i++;
}
%>
</body>
</html>