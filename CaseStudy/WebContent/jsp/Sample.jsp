<%@ page import="com.xanne.dto.EmployeeDTO" %>
<%@ page import="java.util.List"%>

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
//EmployeeDTO employee = (EmployeeDTO) request.getAttribute("employeeDetail");
//List <EmployeeDTO> employee = (List <EmployeeDTO>) request.getAttribute("employeeDetail");
 EmployeeDTO employees = (EmployeeDTO)request.getAttribute("employeeList");
 %>
SAMPLE JSP PAGE :)
First Name : <%= employees.getFirstName() %>
Middle Name : <%= employees.getMiddleName() %>
Last Name : <%= employees.getLastName() %>


</body>
</html>