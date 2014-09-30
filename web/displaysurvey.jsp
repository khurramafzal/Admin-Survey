<%-- 
    Document   : displaysurvey
    Created on : 5-Dec-2013, 4:17:50 PM
    Author     : MAfzal
    
    Description : This file "displaysurvey.jsp" is for the purpose to display data from survey.survey_sections table 
                  form method="POST" servlet used 'UserHandlerSurvey'
            
                  
                  
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
        <script></script>
        <script src="found/jquery.js"></script>      
        <script src="found/custom.modernizr.js"></script>     
        <script src="found/foundation.min.js"></script>
    <link rel="stylesheet" href="css/admin.css">
        <script>$(document).foundation();</script>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Questions</title>
    </head>
    <body>
         <%@include file="header.jsp" %>
        <%
/**
         * Object created of class UserDao.java
 */           
            UserDao dao = new UserDao();
            List<UserBean> userList = dao.getAllsurvey();
          
%>

<h1>   ENTER SURVEY</h1>
            <div class="row collapse">
                <div class="large-12 columns">
                    <table border="1">
                        <thead>
                        <tr>

                            <th width="400">Survey Name</th>
                      
                            <th width="100">Questions</th>
                            <th width="100">Update Survey</th>
                            <th width="100">Delete Survey</th>

                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <%
 /**
 * for loop to display data in table 
 */                            
                                for (UserBean user : userList) {
                            %>
<!--                            <td><%=user.getsurveyID()%></td>-->
                            <td><%=user.getsurvey()%></td>
                            
                            
                           
                            <td><a
                                    href="UserHandlerSurvey?action=add_quesPage&surveyid=<%=user.getsurveyID()%>">Questions</a></td>
                            <td><a
                                    href="UserHandlerSurvey?action=editform&surveyid=<%=user.getsurveyID()%>">Update</a></td>
                            <td><a
                                    href="UserHandlerSurvey?action=delete&surveyid=<%=user.getsurveyID()%>">Delete</a></td>

                            

                        </tr>
                        <%
                            }

                        %>
                        </tbody>
                    </table>


                </div>




            </div>

       
        <div class="button-bar">
            <a href="UserHandlerSurvey?action=addsurveyPage" class="button">Add User</a>
        </div>
                        
                          <div class="button-bar">
            <a href="UserHandlerSurvey?action=graph_display" class="button">Display Graph</a>
        </div>

                          <div class="button-bar">
            <a href="UserHandlerSurvey?action=userDisplay" class="button">Display User Page</a>
        </div>

                        

    </body>
</html>
