<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adaminaflores
  Date: 12/3/21
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Ads</title>
</head>
<body>
<h1>Here Are Your Ads: </h1>
<c:forEach var = "ad" items = "${ads}">
    <div class = "ad">
        <h2>Title: ${ad.title}</h2>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>


</body>
</html>
