<%--
  Created by IntelliJ IDEA.
  User: adaminaflores
  Date: 12/2/21
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file= "partials/head.jsp" %>
<head>
    <title>Pizza Order Menu</title>
</head>
<body>
<h1>Pizza Form</h1>
<form action="" method="POST">
    <div>
        <label for="crust-type">Crust Type</label>
        <select name="crust-type" id="crust-type">
            <option value="hand-tossed">Hand Tossed</option>
            <option value="deep-dish">Deep Dish</option>
            <option value="vegan">Vegan</option>
        </select>
    </div>
    <br>
    <div>
        <label for="sauce-type">Sauce Type</label>
        <select name="sauce-type" id="sauce-type">
            <option value="red">Red</option>
            <option value="white">White</option>
            <option value="None">None</option>
        </select>
    </div>
    <br>
    <fieldset>
        <legend>Toppings</legend>
        <label for="onions">
            <input id="onions" type="checkbox" value="onions" name="toppings">
            Onions
        </label>
        <br>
        <label for="pepperoni">
            <input id="pepperoni" type="checkbox" value="pepperoni" name="toppings">
            Pepperoni
        </label>
        <label for="pineapple">
            <input id="pineapple" type="checkbox" value="pineapple" name="toppings">
            Pineapple
        </label>
        <label for="olives">
            <input id="olives" type="checkbox" value="olives" name="toppings">
            Olives
        </label>
    </fieldset>
    <br>
    <div>
        <label for="address">Address</label>
        <input id="address" type="text" name="address" placeholder="Enter Address">
    </div>
    <br>
    <button>Place Order</button>
</form>



</body>
</html>
