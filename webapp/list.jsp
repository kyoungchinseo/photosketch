<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List</title>
</head>
<body>
	<h1>Photo List</h1>
	<c:forEach items="${list}" var="object">
    		<h2> Title: ${object.title}</h2>
		<h2>Comment: ${object.comment } </h2>
		<br>
		<img src="/images/${object.fileName}" height=200>
		<br>
		<c:forEach items="${object.getComments() }" var="eachComment">
			<h3>Reply: ${eachComment.comment }</h3>
		</c:forEach>
		<br>
		<h4><a href="/board/reply/${object.id }">Add Reply</a></h4>
		<hr/>
	</c:forEach>
	<br>
	<h2><a href="/">Return</a></h2>
	
	
</body>
</html>