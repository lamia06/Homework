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
<title>inscrire</title>
</head>
<body>
	<form action="blan" method="POST">
		<label for="Nom">Nom:</label><br> <input type="text" id="nom"
			name="nom" value="Fayolle"><br> <label for="prenom">Prénom:</label><br>
		<input type="text" id="prenom" name="prenom" value="Marc"><br>
		<br> <label for="adresse">Adresse:</label><br> <input
			type="text" id="adresse" name="adresse" value="10 rue de la poste"><br>
		<input type="text" id="codepostal" name="codepostal" value="38000"><br>
		<input type="text" id="ville" name="ville" value="grenoble"><br>
		<label for="email">E-mail:</label><br> <input type="text"
			id="email" name="email" value="marc.fayolle"><br> <label
			for="motPasse">Mot de passe :</label><br> <input type="password"
			id="motPasse" name="motPasse" value="blabla"><br> <input
			type="submit" name="inscription" value="Ok">
	</form>

</body>
</html>