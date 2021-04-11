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
<title>WebForm1</title>
</head>
<body>
	<h1>Catalogue</h1>
	<FORM>
		<label for="genre">Choisissez le genre:</label><br> <SELECT
			name="genre" size="1">
			<OPTION selected>Jazz
			<OPTION>Pop
			<OPTION>Classic
		</SELECT>
	</FORM>


	<table border="1">
		<tr>
			<th>reference</th>
			<th>titre</th>
			<th>auteur</th>
			<th>photo</th>
			<th>prix</th>
			<th></th>
		</tr>
		<tr>
			<td><a href="detail.jsp">JZ001</a></td>
			<td>Tutu</td>
			<td>MIles Davies</td>
			<td>Photo</td>
			<td>120,0000</td>
			<td><a href="construction.jsp">Ajouter au panier</a></td>
		</tr>
		<tr>
			<td><a href="detail.jsp">JZ002</a></td>
			<td>Travel</td>
			<td>Pat Metheny</td>
			<td>Photo</td>
			<td>100,0000</td>
			<td><a href="construction.jsp">Ajouter au panier</a></td>
		</tr>
		<tr>
			<td><a href="detail.jsp">JZ003</a></td>
			<td>One</td>
			<td>Brad Meldhau</td>
			<td>Photo</td>
			<td>99,0000</td>
			<td><a href="construction.jsp">Ajouter au panier</a></td>
		</tr>
	</table>
</body>
</html>