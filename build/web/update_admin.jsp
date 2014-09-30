<%-- 
    Document   : update_admin
    Created on : 4-Nov-2013, 10:06:09 AM
    Author     : MAfzal
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.survey.beans.UserBean"%>
<%@ page import="com.survey.dao.UserDao"%>
<html>
<head>
     <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/foundation.min.css">
     
        <script src="found/jquery.js"></script>      
        <script src="found/custom.modernizr.js"></script>     
        <script src="found/foundation.min.js"></script>
        <script>$(document).foundation();</script> 
        <link rel="stylesheet" href="css/admin.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
<%
UserBean user = new UserBean();
%>
<%
UserDao dao = new UserDao();
%>
<form method="POST" action='UserHandlerSurvey' name="frmEditUser"><input
type="hidden" name="action" value="edit_ques" /> <%
String uid = request.getParameter("quesid");
if (!((uid) == null)) {
int id = Integer.parseInt(uid);
user = dao.getQuesById(id);
%>
    <h2>update here</h2>
    <table width="400" align="left">
    <tr>
<td></td>
<td><input type="hidden" name="surveyid" readonly="readonly"
value="<%= request.getParameter("surveyid")%>"></td>
</tr>
<tr>
<td></td>
<td><input type="hidden" name="quesid" readonly="readonly"
value="<%=user.getquestionID()%>"></td>
</tr>


<tr>
<td>Question</td>
<td><input type="text" name="Question" value="<%=user.getquestion()%>" /></td>
</tr>

<%-- for the --%>
<tr>   
    <td></td>
<td><input type="hidden" name="quesid" readonly="readonly"
 value="<%=request.getParameter("quesid") %>"></td>

</tr>

<tr>
<td></td>
<td><input type="submit" value="Update" /></td>
</tr>
</table>
 
 
<%
} else
out.println("ID Not Found");
%>
</form>



<div class="button-bar2">
            <a href="UserHandlerSurvey?action=displaySurvey" class="button">Back to Survey</a>
        </div>

</body>
</html>