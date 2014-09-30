<%-- 
    Document   : testing_graph
    Created on : 22-Nov-2013, 5:20:39 PM
    Author     : MAfzal
--%>

<%-- 
    Document   : graph_display
    Created on : 21-Nov-2013, 2:48:06 PM
    Author     : MAfzal
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@ page import="com.survey.beans.UserBean"%>
<%@ page import="com.survey.dao.UserDao"%>
<%@ page import="java.util.*"%>
<html>
    <head>
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/foundation.min.css">
        <script src="found/jquery.js"></script>      
        <script src="found/custom.modernizr.js"></script>     
        <script src="found/foundation.min.js"></script>
        <!--[if lt IE 9]><script language="javascript" type="text/javascript" src="../excanvas.js"></script><![endif]-->
        <script class="include" type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <link class="include" rel="stylesheet" type="text/css" href="css/jquery.jqplot.min.css" />
        <script type="text/javascript" src="js/shCore.min.js"></script>
        <script type="text/javascript" src="js/shBrushJScript.min.js"></script>
        <script type="text/javascript" src="js/shBrushXml.min.js"></script>
        <script class="include" type="text/javascript" src="js/jquery.jqplot.min.js"></script>
        <script type="text/javascript" src="js/jqplot.canvasTextRenderer.min.js"></script>
        <script type="text/javascript" src="js/jqplot.canvasAxisLabelRenderer.min.js"></script>
        <script class="include" type="text/javascript" src="js/jqplot.donutRenderer.min.js"></script>
        <script class="include" type="text/javascript" src="js/jqplot.pieRenderer.min.js"></script>
        <script type="text/javascript" src="js/jqplot.bubbleRenderer.min.js"></script>

        <script class="code" type="text/javascript">
            $(document).ready(function() {

                var abc = $("#id1").val();
                var arr = new Array();
                arr = abc.split(",");
                var plot2 = $.jqplot('chart1', [arr], {
                    // Give the plot a title.
                    title: 'Plot With Options',
                    // You can specify options for all axes on the plot at once with
                    // the axesDefaults object.  Here, we're using a canvas renderer
                    // to draw the axis label which allows rotated text.
                    axesDefaults: {
                        labelRenderer: $.jqplot.CanvasAxisLabelRenderer
                    },
                    // An axes object holds options for all axes.
                    // Allowable axes are xaxis, x2axis, yaxis, y2axis, y3axis, ...
                    // Up to 9 y axes are supported.
                    axes: {
                        // options for each axis are specified in seperate option objects.
                        xaxis: {
                            label: "X Axis",
                            // Turn off "padding".  This will allow data point to lie on the
                            // edges of the grid.  Default padding is 1.2 and will keep all
                            // points inside the bounds of the grid.
                            pad: 0
                        },
                        yaxis: {
                            label: "Y Axis"
                        }
                    }
                });
            });
        </script>
        <script>
            $(document).ready(function() {
                var data =  $("#id2").val();
                var plot1 = jQuery.jqplot('chart2', [data],
                        {
                            seriesDefaults: {
                                // Make this a pie chart.
                                renderer: jQuery.jqplot.PieRenderer,
                                rendererOptions: {
                                    // Put data labels on the pie slices.
                                    // By default, labels show the percentage of the slice.
                                    showDataLabels: true
                                }
                            },
                            legend: {show: true, location: 'e'}
                        }
                );
            });
        </script>    
        <script>$(document).foundation();</script>


        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- display Data for the survey  --%>
        <%
            //UserBean user = new UserBean();
            UserDao dao = new UserDao();
            //   UserDao dao2 = new UserDao();
            List<UserBean> userList2 = dao.getAllsurvey();
        %>

        <div class="row">
            <div class="large-4 columns">
                <h2 >SURVEY FORMS</h2>
                <hr />
            </div>
        </div>

        <%-- Display Surveys --%>                                       

        <fieldset>
            <legend>ENTER SURVEY</legend>
            <div class="row collapse">
                <div class="large-12 columns">
                    <table border="1">
                        <tr>
                            <th>Surveys</th>
                        </tr>
                        <tr>
                            <%
                                /*while(itr.hasNext())
                                 {
                                 System.out.println(user.getId());*/
                                for (UserBean user : userList2) {
                            %>

                            <td> <%=user.getsurvey()%></td>
                            <td><a
                                    href="UserHandlerSurvey?action=displayReq_Ques_Graph&surveyid=<%=user.getsurveyID()%>">Display</a></td>
                        </tr>
                        <%
                            }

                        %>
                    </table>
                </div>
            </div>
        </fieldset>                     
        <%-- END --%>
        <div class="container">
            <div class="section-container auto" data-section data-options="deep_linking: true;">
                <section class="active">
                    <p class="title" data-section-title><a href="#panel1">Cat 1</a></p>
                    <div class="content" data-slug="panel1" data-section-content>
                        <form>

                            <%
                                String uid = request.getParameter("surveyid");
                                String uid_ques = request.getParameter("quesid");
                                System.out.println(uid + uid_ques);

                                if (!(uid == null) || !(uid_ques == null)) {
                                    int id = Integer.parseInt(uid);
//user = dao.getQuesBySurveyId(id);
                                    List<UserBean> userList = dao.getAllQuesBysurvey(id);

                            %>
                            <fieldset>
                                <legend>ENTER QUESTIONS</legend>
                                <div class="row collapse">
                                    <div class="large-2 columns">
                                        <label class="inline">Question 1</label>
                                    </div>

                                    <div class="large-7 columns">

                                        <table border="1">
                                            <tr>

                                            </tr>             
                                            <tr>
                                                <%
                                                    /*while(itr.hasNext())
                                                     {
                                                     System.out.println(user.getId());*/
                                                    for (UserBean user : userList) {
                                                %>

                                                <%--       <td><%=user.getquestionID()%></td>
                                                --%>         
                                                <td><%=user.getQues_Survey()%></td>
                                                <td>  <a href="UserHandlerSurvey?action=displayReq_Graph_&quesid=<%=user.getquestionID()%>&surveyid=<%=user.getQues_SurID()%>" class="small button">Option 1</a> </td>

                                            </tr>
                                            <%
                                                }

                                            %>
                                        </table>      
                                    </div>
                            </fieldset>
                            <div class="row">
                                <a href="#" class="button alert round disabled">SUBMIT</a>
                            </div>

                            <%
                                } else
                                    out.println("ID Not Found");
                            %>
                        </form>
                    </div>
                </section>
            </div>
        </div>


        <%-- Graph section started --%>

        <div class="container">
            <div class="section-container auto" data-section data-options="deep_linking: true;">
                <section class="active">
                    <p class="title" data-section-title><a href="#panel1">Cat 1</a></p>
                    <div class="content" data-slug="panel1" data-section-content>
                        <form>

                            <%
                                String uid_G = request.getParameter("quesid");
                                //          String uid_ques_G = request.getParameter("quesid");
                                System.out.println(uid_G);

                                if (!(uid_G == null)) {
                                    int id = Integer.parseInt(uid_G);

                                    //      List<UserBean> userList_G = dao.getAllQuesBysurvey(id);


// For graphs from UserDao.java class

                                    List<UserBean> userList_G = dao.getGraphbyQuesID(id);

                            %>
                            <fieldset>
                                <legend>ENTER QUESTIONS</legend>
                                <div class="row collapse">
                                    <div class="large-2 columns">
                                        <label class="inline">Question 1</label>
                                    </div>

                                    <div class="large-7 columns">

                                        <table border="1">
                                            <tr>

                                            </tr>             
                                            <tr>
                                                <%
                                                    String str = "";
                                                    String str1 = "";

                                                    for (UserBean user : userList_G) {

                                                        str = str + Integer.toString(user.get_ques_Graph_answer_numeric());
                                                        System.out.println(str);
                                                        str = str + "," + "";
                                                        System.out.println(str);
                                                    }
                                                    System.out.println("userList_G.size------------" + userList_G.size());
                                           String t = "";
                                                String temp = "";
                                                String temp2 = "";
                                                    int i = 0;
                                                    for (UserBean user : userList_G) {

                                                        str = Integer.toString(user.getquestionID());
                                                        str1 = Integer.toString(user.get_ques_Graph_answer_numeric());
                                                     temp2 = "['"+str+"',"+str1+"]";
                                                       temp = temp + temp2 + ",";

                                                        System.out.println(str);
                                                        System.out.println(str1);
                                                        
                                                     

                                                    }
                                                    t = "["+temp+"]";
                                             //       t =  "[['Heavy Industry', 12],['Retail', 9], ['Light Industry', 14],    ['Out of home', 16],['Commuting', 7], ['Orientation', 9]];";
                                                    System.out.println(t);

                                                %>
                                            </tr>
                                        </table>  
                                        <div><input id="id1" value="<%=str%>"/></div>
                                        <div><input id="id2" value="<%=t%>"/></div>
                                        <pre class="code brush:js"></pre>
                                    </div>
                            </fieldset>

                            <div id="chart1" style="height:300px; width:500px;"></div>
                            <pre class="code brush:js"></pre>
                            <div id="chart2" style="height:300px; width:500px;"></div>
                            <pre class="code brush:js"></pre>


                            <div class="row">
                                <a href="#" class="button alert round disabled">SUBMIT</a>
                            </div>
                            <%
                                } else
                                    out.println("ID Not Found");
                            %>
                        </form>
                    </div>
                </section>
            </div>
        </div>
    </body>
</html>
