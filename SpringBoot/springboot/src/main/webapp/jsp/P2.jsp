<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doc</title>
</head>
<body>
<%
out.println("welcome <br>");
int mark=10;
if(mark>34){
	out.println("<font size='7' color='green'>Pass</font>");
}
else{
	out.println("<font size='7' color='red'>Fail</font><br>");
}

for(int i=0;i<100;i++){
		out.println(" "+i);
}
out.println("<br>");
//odd-red,even-green
for(int i=0;i<100;i++){
	if(i%2==0)
		out.println("<font size='4' color='green'> "+i+"</font>");
	else
		out.println("<font size='4' color='red'>"+i+"</font>");
}

%>
</body>
</html>