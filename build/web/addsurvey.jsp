<%-- 
    Document   : addsurvey
    Created on : 5-Dec-2013, 4:17:50 PM
    Author     : MAfzal
    
    Description : This file "addsurvey.jsp" is for the purpose to add and display data from survey.survey_sections table 
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
        <form method="POST" action='UserHandlerSurvey' name="frmAddUser"><input
                type="hidden" name="action" value="insert" />
            <h2>Add New Survey</h2> <br><br>
            <table width="400" align="left">
                <tr>
                   
                    <td><input type="hidden" name="surveyid" /></td>
                </tr>
                <tr>
                    <td>Survey</td>
                    <td><input type="text" name="Survey" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form>


      


        <%
/**
* Object created of class UserDao.java
*/
            UserDao dao = new UserDao();
            List<UserBean> userList = dao.getAllsurvey();
          
        %>
        <br><br><br><br><br><br><br><br><br><br><br><br>
        <h1>   Survey Record To Display</h1>
        <div class="row collapse">
            <div class="large-12 columns">
              
<%--Table to display data from "survey.survey_sections" --%>                
                <table border="1">
                    <thead>
                        <tr>
                            
                            <th width="400">Survey Name</th>
                            <th width="100">Display Questions</th>
                            <th width="100">Add Question</th>
                            <th width="100">Update Survey</th>
                            <th width="100">Delete Survey</th>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <%
 /**
  * Create object user for UserBean class
  */                        
                                for (UserBean user : userList) {
                            %>
<!--                            <td><%=user.getsurveyID()%></td>-->

                            <td><%=user.getsurvey()%></td>


                            <td><a
                                    href="UserHandlerSurvey?action=displayReq_Ques&surveyid=<%=user.getsurveyID()%>">Questions</a></td>
                            <td><a
                                    href="UserHandlerSurvey?action=add_quesPage&surveyid=<%=user.getsurveyID()%>">Add</a></td>
                            <td><a
                                    href="UserHandlerSurvey?action=editform&surveyid=<%=user.getsurveyID()%>">Update</a></td>
                            <td><a
                                    href="UserHandlerSurvey?action=delete2&surveyid=<%=user.getsurveyID()%>">Delete</a></td>



                        </tr>
                        <%
                            }

                        %>
                    </tbody>
                </table>

            </div>
            <div class="button-bar3"><a href="UserHandlerSurvey?action=listUser" class="button">Survey Page</a></div>




        </div>





    </body>
</html>
