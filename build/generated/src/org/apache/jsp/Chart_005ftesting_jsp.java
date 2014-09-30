package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.survey.beans.UserBean;
import com.survey.dao.UserDao;
import java.util.ArrayList;

public final class Chart_005ftesting_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link class=\"include\" rel=\"stylesheet\" type=\"text/css\" hrf=\"css/jquery.jqplot.min.css\" />\n");
      out.write("        \n");
      out.write("\n");
      out.write(" <script type=\"text/javascript\" src=\"js/shCore.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/shBrushJScript.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/shBrushXml.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"js/jquery.jqplot.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.canvasTextRenderer.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.canvasAxisLabelRenderer.min.js\"></script>\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"js/jqplot.donutRenderer.min.js\"></script>\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"js/jqplot.pieRenderer.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.bubbleRenderer.min.js\"></script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("          <script type=\"text/javascript\" src=\"js/jquery.highchartTable.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>ENTER SURVEY</legend>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("            \n");
      out.write("            <div class=\"row collapse\">\n");
      out.write("                <div class=\"large-12 columns\">\n");
      out.write("                    <table border=\"1\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Survey Id</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            ");

                               String t = "";
                                           //         t = "["+temp+"]";
                    t =  "Heavy Industry,12,Retail,9,Light Industry,14,Out of home,16,Commuting,7,Orientation,9";
                                             //       System.out.println(t);

                   
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div><input id=\"id2\" value=\"[\n");
      out.write("    ['Heavy Industry', 12],['Retail', 9], ['Light Industry', 14],\n");
      out.write("    ['Out of home', 16],['Commuting', 7], ['Orientation', 9]\n");
      out.write("  ]\"/></div>\n");
      out.write("                     <pre class=\"code brush:js\"></pre>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </fieldset>     \n");
      out.write("      \n");
      out.write("        <div id=\"chart2\" style=\"height:300px; width:500px;\"></div>\n");
      out.write("        <pre class=\"code brush:js\"></pre>\n");
      out.write("      \n");
      out.write("        <script class=\"code\" type=\"text/javascript\">\n");
      out.write("   \n");
      out.write("            \n");
      out.write("            var faq = new Array(2);\n");
      out.write("\n");
      out.write("for (i=0; i < 3; i++)\n");
      out.write("    {\n");
      out.write("        faq[i]=new Array(2);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("faq[0][0] ='Industry';\n");
      out.write("faq[0][1] = 12;\n");
      out.write("\n");
      out.write("\n");
      out.write("faq[1][0] = 'Retail';\n");
      out.write("faq[1][1] = 2;\n");
      out.write("\n");
      out.write("\n");
      out.write("    alert(faq);    \n");
      out.write(" \n");
      out.write("    $(document).ready(function() {\n");
      out.write("                  \n");
      out.write("\n");
      out.write("\n");
      out.write("  var plot1 = jQuery.jqplot ('chart2', [faq]  ,\n");
      out.write("  \n");
      out.write("    {\n");
      out.write("      seriesDefaults: {\n");
      out.write("        // Make this a pie chart.\n");
      out.write("        renderer: jQuery.jqplot.PieRenderer,\n");
      out.write("        rendererOptions: {\n");
      out.write("          // Put data labels on the pie slices.\n");
      out.write("          // By default, labels show the percentage of the slice.\n");
      out.write("          showDataLabels: true\n");
      out.write("        }\n");
      out.write("      },\n");
      out.write("      legend: { show:true, location: 'e' }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("  ); \n");
      out.write("});\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("  $('table.highchart').highchartTable();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<table class=\"highchart\" \n");
      out.write("  data-graph-container=\".. .. .highchart-container\" \n");
      out.write("  data-graph-type=\"column\">\n");
      out.write("  <caption>Column example</caption>\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th>Month</th>\n");
      out.write("      <th>Sales</th>\n");
      out.write("      <th>Benefits</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <td>January</td>\n");
      out.write("      <td>8000</td>\n");
      out.write("      <td>2000</td>\n");
      out.write("    </tr>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("<input type=\"button\" value=\"test\" />\n");
      out.write("<input type=\"submit\" value=\"Jtest\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("<iframe src=\"http://techcrunch.com\"></iframe>\n");
      out.write("\n");
      out.write("</body>\n");
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
