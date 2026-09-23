<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Student</title>
</head>
<body>

<%
    String rnoValue = request.getParameter("rno");

    if (rnoValue == null || rnoValue.trim().isEmpty())
    {
        out.println("<h3>Please enter Roll Number</h3>");
    }
    else
    {
        try
        {
            int rno = Integer.parseInt(rnoValue);

            out.println("<h1>Roll Number: " + rno + "</h1>");

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jsd",
                "root",
                "12345"
            );

            Statement st = con.createStatement();

            int res = st.executeUpdate(
                "DELETE FROM student WHERE rno = " + rno
            );

            if (res > 0)
                out.println("<h3>Successfully deleted</h3>");
            else
                out.println("<h3>Roll Number not found</h3>");

            st.close();
            con.close();
        }
        catch (NumberFormatException e)
        {
            out.println("<h3>Roll Number must be a number</h3>");
        }
        catch (Exception e)
        {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
%>

</body>
</html>