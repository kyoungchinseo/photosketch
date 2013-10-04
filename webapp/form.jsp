<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload your photo</title>
</head>
<body>
	<h1>Input your photo:</h1>
	<form action="/board/upload" method="post" enctype="multipart/form-data">
		Title: 
		<input type="text" name="title">
		<br>
		<label>Upload your photo:</label>
		<input type="file" name="file">
		<br>
		<label>Add your comment:</label>
		<br>
		<textarea rows="10" cols="50" name="comment"></textarea>
		<br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>