<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your input result</title>
</head>
<body>
<h1>${board.title}</h1>
<br>
<h2>내용: ${board.comment } </h2>
<br>
<img src="/images/${board.fileName}">
<br>
<h2><a href="/board/edit/${board.id}">Edit</a>
<a href="/board/delete/${board.id}">Delete</a>
<a href="/">Finish</a></h2>
</body>
</html>