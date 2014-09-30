<%-- 
    Document   : admin
    Created on : 4-Nov-2013, 9:56:21 AM
    Author     : MAfzal
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="com.survey.beans.UserBean"%>
<%@ page import="com.survey.dao.UserDao"%>
<%@ page import="java.util.*"%>
<html>
    <head>
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/foundation.min.css">
          <link rel="stylesheet" href="css/admin.css">
        <script></script>
        <script src="found/jquery.js"></script>      
        <script src="found/custom.modernizr.js"></script>     
        <script src="found/foundation.min.js"></script>
        <script>$(document).foundation();</script>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Questions</title>
    </head>
    <body>
        <%
       
            UserDao dao = new UserDao();
            List<UserBean> userList = dao.getAllQues();
     
            
            UserDao dao2 = new UserDao();
             List<UserBean> userList2 = dao.getAllsurvey();
             
             %>

             <h1>ENTER QUESTIONS</h1>
            <div class="row collapse">
                <div class="large-12 columns">
                    <table border="1">
                        <thead>
                        <tr>
                            <th width="200">Id</th>
                            <th width="400">Question</th>
                            <th width="200">Update</th>
                            <th width="200">Delete</th>

                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <%
                            
                                for (UserBean user : userList) {
                            %>
                            <td><%=user.getquestionID()%></td>
                            <td><%=user.getquestion()%></td>

                            <td><a
                                    href="UserHandlerSurvey?action=editform_ques&quesid=<%=user.getquestionID()%>">Update</a></td>
                            <td><a
                                    href="UserHandlerSurvey?action=delete_ques&quesid=<%=user.getquestionID()%>" >Delete</a></td>

                        </tr>
                       
                        <%
                            }
                        
                        %>
                        </tbody>
                    </table>
                    
            </div>
            </div>

                    
             
      
        <div class="button-bar">
            <a href="UserHandlerSurvey?action=listUser" class="button">Add User</a>
        </div>

    </body>
</html>
