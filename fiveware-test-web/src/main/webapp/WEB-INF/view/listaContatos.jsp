<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contatos</title>
</head>
<body>
	<table>
		<tr>
			<th> Nome </th>
			<th> Favorito </th>
			<th> Sexo </th>
			<th> Tipo </th>
		</tr>
		
		<c:forEach begin="1" end="10" value="#{contatos}" var="contato">
			<tr>
				<td>  <c:out value="${contato.nome}" /> </td>
				<td>  <input type="checkbox" disabled="true" checked="${contato.favorito}"> </td>
				<td>  <c:out value="${contato.sexo}" /> </td>
				<td>  <c:out value="${contato.tipo}" /> </td>
			</tr>		
		</c:forEach>
		

	</table>
</body>
</html>