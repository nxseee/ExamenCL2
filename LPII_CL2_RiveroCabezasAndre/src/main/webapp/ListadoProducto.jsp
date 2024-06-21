<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.util.*" %>
   <%@page import="Modelo.TblProducto" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %> 
   <%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Producto</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Listado de Producto</h1>
<h2 align="center">
<a  href="RegistrarCliente.jsp" style="text-decoration:none">Registrar Producto</a>
</h2>
<table align="center" border="2">
<tr>
<td>Nombre</td>
<td>Estado</td>
<td>Descripcion</td>
</tr>
<%
List<TblProducto> listadoproducto=(List<TblProducto>)request.getAttribute("listadoproducto");
if(listadoproducto!=null){
	
for(TblProducto lis:listadoproducto){
%>
<tr>
<td>
<%=lis.getIdProducto() %>
</td>
<td>
<%=lis.getNombre()%>
</td>
<td>
<%=lis.getEstado() %>
</td>
<td>
<%=lis.getDescrip() %>
</td>
</tr>
<%
      }//cerramos la condicion...
}   //cerramos el bucle
%>
</table>

</body>
</html>