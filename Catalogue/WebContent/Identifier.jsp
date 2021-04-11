<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<fmt:setLocale value="<%=request.getLocale()%>"/>
<fmt:setBundle basename="messages" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Identifier</title>
</head>
<body>
	<form action="noir" method="post">
		<label for="email">E-mail:</label><br> <input type="text"
			id="email" name="email" value="marc.fayolle@voila.fr"><br>
		<label for="motPasse">Mot de passe :</label><br> <input
			type="password" id="motPasse" name="MotPasse" value="Doea"><br>
		<br> <input name="login" type="submit" value="OK">
	</form>

</body>
</html>