<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<spring:form action="adicionaContato" method="post" commandName="cadastroContato">
		<table>
			<tr><td>Nome : <spring:input path="nome" type="text"></spring:input> </td>
				<td>Favorito <spring:checkbox path="favorito" /></tr>
			
			<tr><td>Tipo : <spring:select path="tipo" items="${tipos}"/></td></tr> 
			<tr><td>Sexo : Masculino <spring:radiobutton path="sexo" value="M" /></td> 
				<td>Feminino <spring:radiobutton path="sexo" value="F"/></td></tr>
			
			<tr><td></td></tr>
		</table>
		<spring:button name="Enviar" value="Enviar" id="Enviar" type="submit" ></spring:button>
	</spring:form>
</body>
</html>