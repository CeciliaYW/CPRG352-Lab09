<%-- 
    Document   : forgot
    Created on : Apr 4, 2022, 11:12:45 PM
    Author     : ceci_
--%>

<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
    </head>
    <body>
        <h1>Forgot Password</h1>
        <p>Please enter your email address to retrieve your password.</p>
        <form action="forgot" method="post">
        <p>Email Address: <input type="text" name="email" value="${email}"><br></p>
        <input type="submit" value="Submit">
        </form>
<!--        <c:if test="${message}">
            <p>If the address you entered is valid, you will receive an email very soon.</p>
        </c:if>-->
        <p>${message}</p>
    </body>
</html>