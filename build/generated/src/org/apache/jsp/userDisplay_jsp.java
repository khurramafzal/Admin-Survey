package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.survey.beans.UserBean;
import com.survey.dao.UserDao;
import java.util.*;

public final class userDisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/foundation.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/user.css\">\n");
      out.write("        <script src=\"found/jquery.js\"></script>      \n");
      out.write("        <script src=\"found/custom.modernizr.js\"></script>     \n");
      out.write("        <script src=\"found/foundation.min.js\"></script>\n");
      out.write("        <script>$(document).foundation();</script> \n");
      out.write("        <script>function reloadPage(){location.reload();}</script>\n");
      out.write("        <script>function hiding($var){$element=\"#\"+$var;$($element).slideUp(3000);}</script>\n");
      out.write("        <script>\n");
      out.write("                        \n");
      out.write("            function trying($id,$id1,$id2,$but1,$but2,$but3,$but4)\n");
      out.write("            {           \n");
      out.write("                $(\"#123\").html(\"<div>\\n\\\n");
      out.write("                                <center>\\n\\\n");
      out.write("                                <label style='word-wrap: break-word;width:70px'><b>\"+$id1+\"</b></label>\\n\\\n");
      out.write("                                <ul class='inline-list'>\\n\\\n");
      out.write("                                <li> <a href='UserHandlerSurvey?action=insert_ans&quesid=\"+$id+\"&surveyid=\"+$id2+\"&value=1' class='small button'>\"+$but1+\"</a></li>\\n\\\n");
      out.write("                                <li> <a href='UserHandlerSurvey?action=insert_ans&quesid=\"+$id+\"&surveyid=\"+$id2+\"&value=2' class='small button'>\"+$but2+\"</a></li>\\n\\\n");
      out.write("                                <li> <a href='UserHandlerSurvey?action=insert_ans&quesid=\"+$id+\"&surveyid=\"+$id2+\"&value=3' class='small button'>\"+$but3+\"</a></li>\\n\\\n");
      out.write("                                <li> <a href='UserHandlerSurvey?action=insert_ans&quesid=\"+$id+\"&surveyid=\"+$id2+\"&value=4' class='small button'>\"+$but4+\"</a></li>\\n\\\n");
      out.write("                                </ul>\\n\\\n");
      out.write("                                </center>\\n\\\n");
      out.write("                                </div>\"); \n");
      out.write("            }</script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("   <body>      \n");
      out.write("    <header class=\"row\">\n");
      out.write("    <div class=\"large-3 columns\">\n");
      out.write("      <h1><img src=\"css/img/pmp_photosheet.png\"></h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"large-6 columns\">\n");
      out.write("      <h1>SURVEY FORMS</h1>\n");
      out.write("    </div>\n");
      out.write("    </header>\n");
      out.write("  <ul class=\"breadcrumbs\">         \n");
      out.write("           ");

            UserDao dao = new UserDao();
             List<UserBean> userList2 = dao.getAllsurvey();
        
      out.write("                            \n");
      out.write("                       <li> ");
 for (UserBean user : userList2) {
      out.write("  </li>\n");
      out.write("                        <li> <a href=\"UserHandlerSurvey?action=displayReq_Ques_User&surveyid=");
      out.print(user.getsurveyID());
      out.write('"');
      out.write('>');
      out.print(user.getsurvey());
      out.write("</a></li> ");
 }
      out.write(" </ul>\n");
      out.write("   ");

String uid = request.getParameter("surveyid");
 //String uid_ques = "225";
 //System.out.println(uid + uid_ques); 
if (!(uid == null) ) {

    int id = Integer.parseInt(uid);
// int id_ques = Integer.parseInt(uid_ques);
List<UserBean> userList = dao.getOpt_dynamic(id);
//List<UserBean> optionList = dao.getQuesOptionById_list(id_ques);

      out.write("                     \n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"large-2 columns\">\n");
      out.write("                                                <div style='border:solid #2daebf' id=\"123\" onclick='hiding'>\n");
      out.write("                                                    \n");
      out.write("                                        </div></div>\n");
      out.write("                                    <div class=\"large-8 columns\">\n");
      out.write("                                      \n");
      out.write("                                        ");
 int k=0; for (UserBean user : userList) { 
                                       
                                                UserBean test1 = new UserBean();
                                               test1 = dao.getQuesOptionById_list(user.getquestionID());
                                             //  System.out.println(test1); 
                                                     
      out.write("    \n");
      out.write("                                                <label style=\"color:white; font-size:30px; font-family:cursive; text-align:left\" id=\"");
      out.print(user.getquestionID());
      out.write("\" onclick=\"trying(id,'");
      out.print(user.getQues_Survey());
      out.write("','");
      out.print(user.getQues_SurID());
      out.write("','");
      out.print(test1.get_f_option());
      out.write("','");
      out.print(test1.get_s_option());
      out.write("','");
      out.print(test1.get_t_option());
      out.write("','");
      out.print(test1.get_fo_option());
      out.write("')\">");
      out.print(++k);
      out.write('.');
      out.write(' ');
      out.print(user.getQues_Survey());
      out.write("</label>\n");
      out.write("                            \n");
      out.write("                                                ");
    }   
      out.write("  <br><br><br>  \n");
      out.write("<!--                                                <div class=large-2 columns\">\n");
      out.write("                                                <div style='border:solid'id=\"123\"></div></div>-->\n");
      out.write("                                            \n");
      out.write("      </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("                                        \n");
      out.write("                                            \n");
      out.write("                                        ");

} else
out.println("");

      out.write("                              \n");
      out.write("      <div class=\"large-2 columns\" >\n");
      out.write("                                                \n");
      out.write("                                    <a href=\"#\" style=\"word-wrap: break-word;width:70px \" class=\" button\" value=\"Reload page\" onclick=\"reloadPage()\" >PRESS*<br><img src=\"css/img/Click.PNG\"><br>*HERE</a>\n");
      out.write("                                            </div>\n");
      out.write("      </div>       \n");
      out.write("                        <!--   start footer section-->\n");
      out.write("<!--   <aside class=\"row\">\n");
      out.write("       \n");
      out.write("    <a href=\"#\" style=\"word-wrap: break-word;width:70px \" class=\" button\" value=\"Reload page\" onclick=\"reloadPage()\" >DONE</a>\n");
      out.write("   \n");
      out.write("   </aside>-->\n");
      out.write("                        <!--  end footer section-->\n");
      out.write("\n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
