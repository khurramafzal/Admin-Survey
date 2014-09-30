package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.survey.beans.UserBean;
import com.survey.dao.UserDao;
import java.util.ArrayList;

public final class graph_005ftesting_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            a.test {\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]><script language=\"javascript\" type=\"text/javascript\" src=\"../excanvas.js\"></script><![endif]-->\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("        <link class=\"include\" rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.jqplot.min.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/shCore.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/shBrushJScript.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/shBrushXml.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"js/jquery.jqplot.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.canvasTextRenderer.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.canvasAxisLabelRenderer.min.js\"></script>\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"js/jqplot.donutRenderer.min.js\"></script>\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"js/jqplot.pieRenderer.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.bubbleRenderer.min.js\"></script>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            //UserBean user = new UserBean();
            UserDao dao = new UserDao();
            List<UserBean> userList = dao.getAllansForGraph();
            //Iterator<UserBean> itr = userList.iterator();

            List<UserBean> userList_sur = dao.getAllsurvey();

        
      out.write("   \n");
      out.write("\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>ENTER SURVEY</legend>\n");
      out.write("\n");
      out.write("            <div class=\"row collapse\">\n");
      out.write("                <div class=\"large-12 columns\">\n");
      out.write("                    <table border=\"1\">\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            ");


                                String str = "";
                            
                                for (UserBean user : userList) {
                                  
                                    str = str + Integer.toString(user.get_ques_option_id());
                                    System.out.println(str);
                                    str = str + "," + "";
                                    System.out.println(str);

                      
                                }

                            
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                    </table>        \n");
      out.write("                    <div><input id=\"id1\" value=\"");
      out.print(str);
      out.write("\"/></div>\n");
      out.write("                    <pre class=\"code brush:js\"></pre>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </fieldset>     \n");
      out.write("\n");
      out.write("        <div id=\"chart1\" style=\"height:300px; width:500px;\"></div>\n");
      out.write("        <pre class=\"code brush:js\"></pre>\n");
      out.write("\n");
      out.write("        <script class=\"code\" type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("\n");
      out.write("                var abc = $(\"#id1\").val();\n");
      out.write("                var arr = new Array();\n");
      out.write("                arr = abc.split(\",\");\n");
      out.write("                var plot2 = $.jqplot('chart1', [arr], {\n");
      out.write("                    // Give the plot a title.\n");
      out.write("                    title: 'Plot With Options',\n");
      out.write("                    // You can specify options for all axes on the plot at once with\n");
      out.write("                    // the axesDefaults object.  Here, we're using a canvas renderer\n");
      out.write("                    // to draw the axis label which allows rotated text.\n");
      out.write("                    axesDefaults: {\n");
      out.write("                        labelRenderer: $.jqplot.CanvasAxisLabelRenderer\n");
      out.write("                    },\n");
      out.write("                    // An axes object holds options for all axes.\n");
      out.write("                    // Allowable axes are xaxis, x2axis, yaxis, y2axis, y3axis, ...\n");
      out.write("                    // Up to 9 y axes are supported.\n");
      out.write("                    axes: {\n");
      out.write("                        // options for each axis are specified in seperate option objects.\n");
      out.write("                        xaxis: {\n");
      out.write("                            label: \"X Axis\",\n");
      out.write("                            // Turn off \"padding\".  This will allow data point to lie on the\n");
      out.write("                            // edges of the grid.  Default padding is 1.2 and will keep all\n");
      out.write("                            // points inside the bounds of the grid.\n");
      out.write("                            pad: 0\n");
      out.write("                        },\n");
      out.write("                        yaxis: {\n");
      out.write("                            label: \"Y Axis\"\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
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
