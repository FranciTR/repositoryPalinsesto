<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>HTML Forms</h2>

<form action="/Home.java">
  nome:<br>
  <input type="text" name="nome" value="">
  <br>  <br>
  cognome:<br>
  <input type="text" name="cognome" value="">
  <br>  <br>
  email:<br>
  <input type="text" name="email" value="">
  <br>  <br>
  data di nascita:<br>
  <input type="date" name="datadinascità" min="1900
  12-31"><br><br>

  password:<br>
  <input type="text" name="password" value="">
  <br>  <br>
  username:<br>
  <input type="text" name="username" value="">
  <br><br>
  <input type="submit" value="registrazione">
  <input type="reset" value="cancella">
</form>
</body>
</html>