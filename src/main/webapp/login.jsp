<%--
  Created by IntelliJ IDEA.
  User: adaminaflores
  Date: 11/30/21
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<% if(request.getMethod().equalsIgnoreCase("post")) {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username.equals("admin") && password.equals("password")) {
        response.sendRedirect("/profile.jsp");
    }

}
%>

<html>
<head>
    <title>Title</title>

</head>
<body>
<%@ include file="index.jsp" %>

<div style="text-align: center">
    <h1>Admin Login</h1>
    <form action="login.jsp" method="POST">
        <div class = "form-group">
            <label for="email">Email:</label>
            <input type = "text" id="email" size="30" />
        </div>

        <br><br>

        <div class = "form-group">
            <label for="password">Password:</label>
            <input type = "text" id="password" name="password" size="30" />
        </div>

        <br><br>
            <button type="submit">Login</button>
    </form>
</div>


</body>
</html>
