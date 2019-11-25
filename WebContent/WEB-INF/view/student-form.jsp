<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
<!-- by the path attribute spring will call student.getFirstName() in the back -->
First Name: <form:input type="text" path="firstName"></form:input>
<br>
Last Name: <form:input type="text" path="lastName"></form:input>

<br>
<form:select path="country">
<form:options items="${student.countryOptions}"/>
</form:select>
<br>
<h4>Favorite Programming Languages : </h4>
<form:radiobuttons path="favLang" items="${student.favoriteLanguageOptions}"  />

<br><br>
<!-- here by submit spring will call the student.setFirstName() and student.setLastName() -->
<input type="submit"/>
</form:form>
</body>
</html>