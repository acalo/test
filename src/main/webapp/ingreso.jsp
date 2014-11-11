<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="usuarioAction">
		<s:textfield label="Ingrese Usuario" name="usuario"/>
		<s:password label="Ingrese Password" name="password"></s:password>
		<s:checkbox name="estado"></s:checkbox>
		<s:submit label="Ingresar"></s:submit>
	</s:form>
</body>
</html>