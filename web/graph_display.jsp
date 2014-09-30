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
        <script type="text/javascript" src="js/jqplot.barRenderer.min.js"></script>
        <script type="text/javascript" src="js/jqplot.categoryAxisRenderer.min.js"></script>
        <script type="text/javascript" src="js/jqplot.pointLabels.min.js"></script>
        <script>

            $(document).ready(function() {
                var Ans1 = parseInt($("#id1").val());
                var Ans2 = parseInt($("#id2").val());
                var Ans3 = parseInt($("#id3").val());
                var Ans4 = parseInt($("#id4").val());
                var f_opt = $("#id5").val();
                var s_opt = $("#id6").val();
                var t_opt = $("#id7").val();
                var fo_opt = $("#id8").val();


                var faq = new Array(2);
                for (i = 0; i < 4; i++)
                {
                    faq[i] = new Array(2);
                }
                faq[0][0] = f_opt;
                faq[0][1] = Ans1;
                faq[1][0] = s_opt;
                faq[1][1] = Ans2;
                faq[2][0] = t_opt;
                faq[2][1] = Ans3;
                faq[3][0] = fo_opt;
                faq[3][1] = Ans4;

                var plot1 = jQuery.jqplot('chart1', [faq],
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
        <%-- display Data for the survey 
        
        Fetch the data from the database and display all surveys from (survey.survey_sections)
        
        --%>
        <%

            UserDao dao = new UserDao();

            List<UserBean> userList2 = dao.getAllsurvey();
        %>
        <div class="row">
            <div class="large-12 columns">
                <h2 >GRAPH DISPLAY PAGES</h2> 
            </div>
        </div>
        <%-- Display Surveys --%> 
        <div class="row">
            <div class="large-6 columns">
                <fieldset>
                    <legend>DISPLAY SURVEYS</legend>
                    <div class="row collapse">
                        <div class="large-12 columns">
                            <table width="400" align="left">
                                <tr>
                                    <th>Surveys</th>
                                </tr>
                                <tr>
                                    <%

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
            </div>
            <%-- END --%>
            <div class="large-6 columns">

                <form>

                    <%-- display Data for the selected questions 
      
      Fetch the data from the database and display all questions of selected survey by using survey ID from (survey.questions)
      
                    --%>
                    <%
                        String uid = request.getParameter("surveyid");
                        String uid_ques = request.getParameter("quesid");
                        System.out.println(uid + uid_ques);
                        if (!(uid == null) || !(uid_ques == null)) {
                            int id = Integer.parseInt(uid);
                            List<UserBean> userList = dao.getAllQuesBysurvey(id);
                    %>
                    <fieldset>
                        <legend>DISPLAYS QUESTIONS OF SURVEYS</legend>
                        <div class="row">
                            <div class="large-12 columns">
                                <table width="400" align="left">
                                    <tr>
                                        <%
                                            for (UserBean user : userList) {
                                        %>
                                        <%--       <td><%=user.getquestionID()%></td>
                                        --%>         
                                        <td><%=user.getQues_Survey()%></td>
                                        <td>  <a href="UserHandlerSurvey?action=displayReq_Graph_&quesid=<%=user.getquestionID()%>&surveyid=<%=user.getQues_SurID()%>" class="small button">Display Graph</a> </td>
                                    </tr>
                                    <%
                                        }
                                    %>
                                </table>      
                            </div>
                        </div>
                    </fieldset>
                    <%
                        } else
                            out.println("");
                    %>
                </form>
            </div>
            <%-- Graph section started --%>
            <div class="row">
                <div class="large-12 columns">
                    <%-- Data from "survey.answers" to display GRAPHS 
                  
                  Fetch the data from the database and display GRAPHS of selected question by using question ID from (survey.answers)
                    
                  
                    --%>
                    <%
                        String uid_G = request.getParameter("quesid");
                        if (!(uid_G == null)) {
                            int id = Integer.parseInt(uid_G);


                            /**
                             * Create objects of UserBean class to use
                             * seperately for answers options i-e 1 and 2 and 3
                             * and 4 Methods used to count the number of times
                             * selected each option in userDisplay.jsp page
                             *
                             */
                            UserBean pieUserBean1 = new UserBean();
                            UserBean pieUserBean2 = new UserBean();
                            UserBean pieUserBean3 = new UserBean();
                            UserBean pieUserBean4 = new UserBean();
                            UserBean GraphNames = new UserBean();

                            GraphNames = dao.getQuesOptionById_list(id);
                            String f_option = GraphNames.get_f_option();
                            String s_option = GraphNames.get_s_option();
                            String t_option = GraphNames.get_t_option();
                            String forth_option = GraphNames.get_fo_option();

                            //    System.out.println("id is :  " + id);
                            //       String test = "f_option"


                            pieUserBean1 = dao.data_pieChart_option1(id);
                            pieUserBean2 = dao.data_pieChart_option2(id);
                            pieUserBean3 = dao.data_pieChart_option3(id);
                            pieUserBean4 = dao.data_pieChart_option4(id);
                            String pie1 = Integer.toString(pieUserBean1.getpie_graph1());
                            String pie2 = Integer.toString(pieUserBean2.getpie_graph2());
                            String pie3 = Integer.toString(pieUserBean3.getpie_graph3());
                            String pie4 = Integer.toString(pieUserBean4.getpie_graph4());

                            //      List<UserBean> userList_G = dao.getGraphbyQuesID(id);
%>
                    <fieldset>
                        <legend>DISPLAYS CLICKS AND GRAPH</legend>
                        <table border="1">
                            <tr>

                            </tr>
                        </table>  
                        <div><input  id="id1" value="<%=pie1%>"/></div>
                        <pre class="code brush:js"></pre>

                        <div><input  id="id2" value="<%=pie2%>"/></div>
                        <pre class="code brush:js"></pre>

                        <div><input  id="id3" value="<%=pie3%>"/></div>
                        <pre class="code brush:js"></pre>

                        <div><input  id="id4" value="<%=pie4%>"/></div>
                        <pre class="code brush:js"></pre>

                        <div><input  id="id5" value="<%=f_option%>"/></div>
                        <pre class="code brush:js"></pre>

                        <div><input  id="id6" value="<%=s_option%>"/></div>
                        <pre class="code brush:js"></pre>

                        <div><input  id="id7" value="<%=t_option%>"/></div>
                        <pre class="code brush:js"></pre>

                        <div><input  id="id8" value="<%=forth_option%>"/></div>
                        <pre class="code brush:js"></pre>

                        <div id="chart1" style="height:300px; width:500px;"></div>
                        <pre class="code brush:js"></pre>

                        <!--                        <div id="chart2" style="height:300px; width:500px;"></div>
                                                <pre class="code brush:js"></pre>
                        
                                                <div id="chart3" style="height:300px; width:500px;"></div>
                                                <pre class="code brush:js"></pre>-->
                </div></div>
        </fieldset>

        <%
            } else
                out.println("");
        %> 
    </div>
    <div class="row">
        <div class="large-12 columns">         
            <div class="button-bar3"><a href="UserHandlerSurvey?action=listUser" class="button">Survey Page</a></div>

        </div>    </div>            
</body>
</html>
