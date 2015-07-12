<%@ page import="com.xanne.dto.EmployeeDTO" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
EmployeeDTO employee = (EmployeeDTO) request.getAttribute("employeeDetail");
%>
SAMPLE JSP PAGE :)
First Name : <%= employee.getFirstName() %>
Middle Name : <%= employee.getMiddleName() %>
Last Name : <%= employee.getLastName() %>

</body>
</html>