<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>
	<h2>Create Student</h2>
	<form:form method="post" action="save">    
        <table > 
        <tr>    
          <td>ID : </td>   
          <td><form:input path="studentId"  /></td>  
         </tr>    
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
           
         <tr>    
          <td>Department :</td>    
          <td><form:input path="department" /></td>  
         </tr> 
         <tr>    
          <td>Country :</td>    
          <td><form:input path="country" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>