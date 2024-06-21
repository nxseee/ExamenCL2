<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">
Registrar Usuario
</h1>
<form action="ControladorCliente" method="post">
<table align="center">
<tr>
<td>Usuario</td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td>apellido</td>
<td><input type="text" name="apellido"></td>
</tr>
<tr>
<td colspan="2" style="text-align:center">
<input type="submit"  value="Registrar">
</td>
</tr>
</table>

</form>
</body>
</html>