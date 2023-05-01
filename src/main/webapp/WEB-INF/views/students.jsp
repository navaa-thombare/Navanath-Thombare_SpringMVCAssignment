<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students List</title>
</head>
<body>
	<h2>Students registered for the event..</h2>
	<table border="2" width="70%" cellpadding="2">  
		<tr><th>Id</th><th>Name</th><th>Department</th><th>Country</th></tr>  
	   <c:forEach var="student" items="${list}">   
	   <tr>  
	   <td>${student.studentId}</td>  
	   <td>${student.name}</td>  
	   <td>${student.department}</td>  
	   <td>${student.country}</td>  
	   <%-- <td><a href="editemp/${emp.id}">Edit</a></td>  
	   <td><a href="deleteemp/${emp.id}">Delete</a></td>  --%> 
	   </tr>  
	   </c:forEach>  
   </table>  
   <br/>  
   <a href="addstudent">Add New Student</a>  
</body>
</html>