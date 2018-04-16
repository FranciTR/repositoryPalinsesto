<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
</head>
<body>
<h1>benvenuto utente </h1>

<h2>inserire i seguenti dati</h2>

<form action="/Home.jsp" target="_blank">
username: <br>
<input type="text" name="utente">
<br>
password:<br>
<input type="text" name="password">
<br><br>
 <input type="submit" value="login">
<br><br>
<input type="button" value="recuperopassword">
</form>

</body>
</html>