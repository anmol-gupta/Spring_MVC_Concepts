<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Form</title>
<style>
.error{color:red}
</style>
</head>
<body>
<h3>Fill out the form</h3>
	<form:form action="processForm" modelAttribute="customer">
		First Name: <form:input type="text" path="firstName" />
		<br>
		Last Name: (*) <form:input type="text" path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>