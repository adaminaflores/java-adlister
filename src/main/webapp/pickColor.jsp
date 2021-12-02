<%--
  Created by IntelliJ IDEA.
  User: adaminaflores
  Date: 12/2/21
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <form method= "post" action = "/pickColor">
        <h1>Please Pick A Color: </h1>
        <br>
        <select name="color" id="color">
            <option value="red">Red</option>
            <option value="green">Green</option>
            <option value="blue">Blue</option>
            <option value="yellow">yellow</option>

        </Select>
        <input type="submit" value="Submit">



    </form>

</body>
</html>
