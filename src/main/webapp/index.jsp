<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index jsp</title>
</head>
<body>
<center>
<h3>Product Registeration Form</h3>
<form action = "process.jsp">
	Product-Id:   <input type = "text"  name = "uid" " onclick = "this.value"/><br><br>
	Product-Name: <input type = "text"  name = "uname" " onclick = "this.value"/><br><br>
	Product-Type: <input type = "text"  name = "utype" " onclick = "this.value"/><br><br>
	<input type="submit" value ="REGISTER">
</form>
</center>

</body>
</html>