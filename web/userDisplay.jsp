<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="com.survey.beans.UserBean"%>
<%@ page import="com.survey.dao.UserDao"%>
<%@ page import="java.util.*"%>
<html>
    <head>
   <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/foundation.min.css">
        <link rel="stylesheet" href="css/user.css">
        <script src="found/jquery.js"></script>      
        <script src="found/custom.modernizr.js"></script>     
        <script src="found/foundation.min.js"></script>
        <script>$(document).foundation();</script> 
        <script>function reloadPage(){location.reload();}</script>
        <script>function hiding($var){$element="#"+$var;$($element).slideUp(3000);}</script>
        <script>
                        
            function trying($id,$id1,$id2,$but1,$but2,$but3,$but4)
            {           
                $("#123").html("<div>\n\
                                <center>\n\
                                <label style='word-wrap: break-word;width:70px'><b>"+$id1+"</b></label>\n\
                                <ul class='inline-list'>\n\
                                <li> <a href='UserHandlerSurvey?action=insert_ans&quesid="+$id+"&surveyid="+$id2+"&value=1' class='small button'>"+$but1+"</a></li>\n\
                                <li> <a href='UserHandlerSurvey?action=insert_ans&quesid="+$id+"&surveyid="+$id2+"&value=2' class='small button'>"+$but2+"</a></li>\n\
                                <li> <a href='UserHandlerSurvey?action=insert_ans&quesid="+$id+"&surveyid="+$id2+"&value=3' class='small button'>"+$but3+"</a></li>\n\
                                <li> <a href='UserHandlerSurvey?action=insert_ans&quesid="+$id+"&surveyid="+$id2+"&value=4' class='small button'>"+$but4+"</a></li>\n\
                                </ul>\n\
                                </center>\n\
                                </div>"); 
            }</script>
        
        
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <body>      
    <header class="row">
    <div class="large-3 columns">
      <h1><img src="css/img/pmp_photosheet.png"></h1>
    </div>
    <div class="large-6 columns">
      <h1>SURVEY FORMS</h1>
    </div>
    </header>
  <ul class="breadcrumbs">         
           <%
            UserDao dao = new UserDao();
             List<UserBean> userList2 = dao.getAllsurvey();
        %>                            
                       <li> <% for (UserBean user : userList2) {%>  </li>
                        <li> <a href="UserHandlerSurvey?action=displayReq_Ques_User&surveyid=<%=user.getsurveyID()%>"><%=user.getsurvey()%></a></li> <% }%> </ul>
   <%
String uid = request.getParameter("surveyid");
 //String uid_ques = "225";
 //System.out.println(uid + uid_ques); 
if (!(uid == null) ) {

    int id = Integer.parseInt(uid);
// int id_ques = Integer.parseInt(uid_ques);
List<UserBean> userList = dao.getOpt_dynamic(id);
//List<UserBean> optionList = dao.getQuesOptionById_list(id_ques);
%>                     

                                <div class="row">
                                    <div class="large-2 columns">
                                                <div style='border:solid #2daebf' id="123" onclick='hiding'>
                                                    
                                        </div></div>
                                    <div class="large-8 columns">
                                      
                                        <% int k=0; for (UserBean user : userList) { 
                                       
                                                UserBean test1 = new UserBean();
                                               test1 = dao.getQuesOptionById_list(user.getquestionID());
                                             //  System.out.println(test1); 
                                                     %>    
                                                <label style="color:white; font-size:30px; font-family:cursive; text-align:left" id="<%=user.getquestionID()%>" onclick="trying(id,'<%=user.getQues_Survey()%>','<%=user.getQues_SurID()%>','<%=test1.get_f_option()%>','<%=test1.get_s_option()%>','<%=test1.get_t_option()%>','<%=test1.get_fo_option()%>')"><%=++k%>. <%=user.getQues_Survey()%></label>
                            
                                                <%    }   %>  <br><br><br>  
<!--                                                <div class=large-2 columns">
                                                <div style='border:solid'id="123"></div></div>-->
                                            
      </div> 


   
                                        
                                            
                                        <%
} else
out.println("");
%>                              
      <div class="large-2 columns" >
                                                
                                    <a href="#" style="word-wrap: break-word;width:70px " class=" button" value="Reload page" onclick="reloadPage()" >PRESS*<br><img src="css/img/Click.PNG"><br>*HERE</a>
                                            </div>
      </div>       
                        <!--   start footer section-->
<!--   <aside class="row">
       
    <a href="#" style="word-wrap: break-word;width:70px " class=" button" value="Reload page" onclick="reloadPage()" >DONE</a>
   
   </aside>-->
                        <!--  end footer section-->

            
    </body>
</html>
