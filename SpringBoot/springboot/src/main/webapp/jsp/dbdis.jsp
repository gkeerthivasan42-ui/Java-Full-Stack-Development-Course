<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	out.println("<h1>Driver Accepted</h1>");		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsd","root","12345");
	out.println("<h2>Connection Success</h2>");
	
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from student");
	out.println("<table border='4' bgcolor='cyan' align='center'>");
	out.println("<tr><th>Rno</th><th>Student Name</th><th>mark</th><th>Rults</th></tr>");
	while(rs.next())
	{
		out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
	}
	out.println("</table>");
	
	
	
}
catch(Exception e)
{
	out.println("<h1>Error:"+e.toString()+"</h1>");
}
%>
</body>
</html>