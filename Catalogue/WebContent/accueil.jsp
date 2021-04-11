
	<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<fmt:setLocale value="${param.locale}"/> 
<fmt:setBundle basename="messages" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
	<h1><fmt:message key="label.welcome" />Lamia-<fmt:message key="label.next" /></h1>
	<a href="Identifier.jsp"><fmt:message key="label.dc" /></a>
	
	<a href="inscrire.jsp"><fmt:message key="label.nc" /></a>

	
</body>
</html>

