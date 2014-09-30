<%-- 
    Document   : add_ques
    Created on : 5-Dec-2013, 4:17:50 PM
    Author     : MAfzal
    
    Description : This file "add_ques.jsp" is for the purpose to add and display data from survey.question table 
                  form method="POST" servlet used 'UserHandlerSurvey'
                  
                  
                  
--%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.survey.beans.UserBean"%>
<%@ page import="com.survey.dao.UserDao"%>
<%@ page import="java.util.*"%>
<html>
    <%
        /**
         * Object created of class UserDao.java
         */
        UserDao dao = new UserDao();
    %>
    <head>

        <%-- **scripts and css** links are used for "foundation zurb" --%>

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

        <%-- UserHandlerSurvey is used to call action= insert_ques--%>

        <form method="POST" action='UserHandlerSurvey' name="frmAddUser"><input
                type="hidden" name="action" value="insert_ques" />
            <h2>Add New Question</h2>


            <%-- get data "Question" from user to save in the database--%>
            <table width="400" align="left" >
                <tr>
                    <td>Question</td>
                    <td><input type="text" name="Question" /></td>
                </tr>
                <tr>   
                    <td></td>
                    <td><input type="hidden" name="surveyid" readonly="readonly"

                               <%-- get parameter for "surveyid" to insert into the "survey.question" table as a foriegn key--%>                               
                               value="<%=request.getParameter("surveyid")%>"></td>

                </tr>

                <%-- on submit the form surveyid and question will be saved into the table "survey.question"--%> 
                <tr>  
                    <td></td>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form>

        <div class="button-bar3"><a href="UserHandlerSurvey?action=listUser" class="button">View-All-Records</a></div>

        <%
            String uid = request.getParameter("surveyid");
            if (!((uid) == null)) {
                int id = Integer.parseInt(uid);
                List<UserBean> userList = dao.getAllQuesBysurvey(id);
        %>

        <h2>Display Question of selected survey</h2>
        <div class="row collapse">
            <div class="large-12 columns">
                <table border="1">
                    <thead>
                        <tr>
                            <th width="100">Survey Id</th>
                            <th width="400">Questions</th>
                            <th width="100">Update</th>
                            <th width="100">add options</th>
                            <th width="100">Delete</th>
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
                            <td><%=user.getQues_SurID()%></td>
                            <td><%=user.getQues_Survey()%></td>
                            <td><a
                                    href="UserHandlerSurvey?action=editform_ques&quesid=<%=user.getquestionID()%>&surveyid=<%=user.getQues_SurID()%>">Update</a></td>

                            <td><a
                                    href="UserHandlerSurvey?action=addQuesOption&quesid=<%=user.getquestionID()%>&surveyid=<%=user.getQues_SurID()%>">add options</a></td>

                            <td><a
                                    href="UserHandlerSurvey?action=delete_ques&quesid=<%=user.getquestionID()%>&surveyid=<%=user.getQues_SurID()%>" >Delete</a></td>

                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="button-bar2">
            <a href="UserHandlerSurvey?action=displaySurvey" class="button">Back to Survey</a>
        </div>
        <%
            } else
                out.println("ID Not Found");
        %>
    </body>
</html>