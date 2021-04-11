
	<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>

<title>Select Language</title>

</head>

<body>

<h1>Please select language:</h1>

<c:url value="accueil.jsp" var="engURL">

<c:param name="locale" value="en" />

</c:url>

<a href="${engURL}">English </a>

<br />

<br />



<br />

<c:url value="accueil.jsp" var="frenchURL">

<c:param name="locale" value="fr" />

</c:url>



<a href="${frenchURL}"> Français</a>

</body>