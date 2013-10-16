<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${board.title}</h1>
	<br>
	<h2>내용: ${board.comment } </h2>
	<br>
	<img src="/images/${board.fileName}">
	<br>
	<c:forEach items="${board.getComments()}" var="eachComment">
		<h3>Comment: ${eachComment.comment } </h3>
	</c:forEach>
	<br>
	<h2>
	<a href="/board/edit/${board.id}">Edit</a>
	<a href="/board/delete/${board.id}">Delete</a>
	<a href="/">Finish</a>
	</h2>
	<h1>  댓글 달아주세요! </h1>
	<div>
		<form action="/board/replyform/${board.id}" method="post">
			<textarea name="comment" rows="10" cols="50">내용을 입력하세요 </textarea><br />
			<input type="submit" value="보내기">
		</form>
	</div>
	<br>
		<a href="/">main</a>
		<br>
		<a href="/board/list">리스트 보기 </a>
</body>
</html>