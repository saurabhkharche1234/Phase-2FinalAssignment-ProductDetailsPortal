<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="dao.RegisterDao"%>
    
<jsp:useBean id="obj" class="model.User"/>

<jsp:setProperty property="*" name="obj"/> 

<% 
int status=RegisterDao.register(obj);
if(status > 0)
	out.print("Registered Successfully !!!");
%>
<center></center>
<form action = "display">
<input type ="submit" value="Display Data"/>

</form>

</center>