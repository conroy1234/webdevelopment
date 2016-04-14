<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html xmlns="http://www.w3.org/1999/xhtml"
lang="en" xmlns="http://www.w3.org/1999/xhtml"
		xmlns:h="http://sxmls.jcp.org./jsf/html"
		xmlns:p="http://primefaces.orgui">

<head>
	<title>Home</title>
</head>
<body>
<em><h1 style="color:#ff0000;">
	${welcome_display}!  
</h1></em>

<P> ${welcome_messahe}</P>
<em><a href= ${forward_to_index_page} > index page</a></em>
</body>
</html>
