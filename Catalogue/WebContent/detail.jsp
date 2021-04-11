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
<title>Web Form2</title>
</head>
<body>
	<h1>Détail de l'article</h1>


	<form action="">
		<label for="reference">Réference:</label> <input type="text"
			id="reference" name="reference" value="JZ001"> <label
			for="titre">titre:</label> <input type="text" id="titre" name="titre"
			value="Tutu"><br> <label for="auteur">auteur:</label> <input
			type="text" id="auteur" name="auteur" value="Miles Davies"> <label
			for="auteur">Editeur:</label> <input type="text" id="auteur"
			name="auteur" value="Polygram"><br>
		<br> <label for="quantite">Quantité en stock:</label> <input
			type="text" id="quantite" name="quantite" value="4"> <label
			for="prix">pour le prix modique de:</label> <input type="text"
			id="prix" name="prix" value="120,0000"><fmt:message key="label.price" /><br>

	</form>


</body>
</html>