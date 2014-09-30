<%-- 
    Document   : addQuesOptions
    Created on : 5-Dec-2013, 4:17:50 PM
    Author     : MAfzal
    
    Description : 
                  
                  
                  
--%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.survey.beans.UserBean"%>
<%@ page import="com.survey.dao.UserDao"%>
<%@ page import="java.util.*"%>
<html>
    <%

        
UserBean user = new UserBean();
UserDao dao = new UserDao();
%>
<head>
     <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/foundation.min.css">
        <link rel="stylesheet" href="css/admin.css">
        <script src="found/jquery.js"></script>      
        <script src="found/custom.modernizr.js"></script>     
        <script src="found/foundation.min.js"></script>
        <script>$(document).foundation();</script> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Survey Question</title>
</head>
<body>
<form method="POST" action='UserHandlerSurvey' name="frmAddUser"><input
type="hidden" name="action" value="add_options" />
    
    <%
String uid = request.getParameter("quesid");
if (!((uid) == null)) {
int id = Integer.parseInt(uid);
user = dao.getQuesOptionById(id);
%>
<h2>Add New Question</h2>



<table width="400" align="left" >

<tr>   
    <td>survey id</td>
<td><input type="text" name="surveyid" readonly="readonly"
 value="<%=request.getParameter("surveyid") %>"></td>

</tr>

<tr>   
    <td>question id</td>
<td><input type="text" name="quesid" readonly="readonly"
 value="<%=request.getParameter("quesid") %>"></td>

</tr>

<tr>
<td>First Option</td>
<td><input type="text" name="f_option" value="<%=user.get_f_option()%>" ></td>
</tr>

<tr>
<td>Second Option</td>
<td><input type="text" name="s_option" value="<%=user.get_s_option()%>" ></td>
</tr>

<tr>
<td>Third Option</td>
<td><input type="text" name="t_option" value="<%=user.get_t_option()%>" ></td>
</tr>

<tr>
<td>Fourth Option</td>
<td><input type="text" name="fo_option"  value="<%=user.get_fo_option()%>"></td>
</tr>

<tr>  
<td></td>
<td><input type="submit" value="Submit" ></td>
</tr>
</table>

<%
} else
out.println("ID Not Found");
%>
</form>
<div class="button-bar3"><a href="UserHandlerSurvey?action=listUser" class="button">View-All-Records</a></div>


</body>
</html>