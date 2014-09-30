<%-- 
    Document   : login
    Created on : 28-Nov-2013, 12:14:40 PM
    Author     : MAfzal
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
         <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/foundation.min.css">
        <script></script>
        <script src="found/jquery.js"></script>      
        <script src="found/custom.modernizr.js"></script>     
        <script src="found/foundation.min.js"></script>
<!--    <link rel="stylesheet" href="css/admin.css">-->
        <script>$(document).foundation();</script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login to our app</title>
    </head>
    <body>
   
 
        <form action="loginAuthenticate.jsp" >
 <fieldset>
    <legend>PLEASE LOGIN</legend>
             <div class="row">
      <div class="large-5 columns">
             <label>USER NAME</label>
            <input type="text" name="username"/>
      </div>
             </div>
            <div class="row">
               <div class="large-5 columns">    
            <label>PASSWORD</label>
             <input type="password" name="password"/>
               </div> </div>
                     <div class="row">
      <div class="large-12 columns">   
            <input type="submit" />
      </div></div>
 </fieldset>
        </form>
        <font color="red"><c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}" />
            </c:if></font>
    </body>
</html>