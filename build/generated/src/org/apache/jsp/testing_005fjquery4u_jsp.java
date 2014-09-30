package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testing_005fjquery4u_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Copyright 2011 jQuery4u.com -->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>jQuery Function Demo - jQuery4u.com</title>\n");
      out.write("<head>\n");
      out.write("    <script src=\"http://www.jquery4u.com/function-demos/js/jquery-1.6.4.min.js\"></script>\n");
      out.write("    <script src=\"http://www.jquery4u.com/scripts/function-demos-script.js\"></script>\n");
      out.write("    <script src=\"http://www.jquery4u.com/scripts/jquery.sparkline.min.js\"></script>\n");
      out.write(" \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write(" \n");
      out.write("    var JQFUNCS =\n");
      out.write("    {\n");
      out.write("        runFunc:\n");
      out.write("        {\n");
      out.write("            /* ------------------------------ slice Demo ------------------------------ */\n");
      out.write("            \"slice\":\n");
      out.write("            {\n");
      out.write("                run: function(id)\n");
      out.write("                {\n");
      out.write("                    var trs = $('#'+id+' table tr'), selectedRow = 0;\n");
      out.write("                    $('#'+id+' button').live('click', function(e)\n");
      out.write("                    {\n");
      out.write("                        e.preventDefault();\n");
      out.write("                        trs.css(\"background\", \"\");\n");
      out.write("                        selectedRow = (selectedRow == 5) ? 1 : selectedRow += 1;\n");
      out.write("                        trs.slice(selectedRow, selectedRow+1).css(\"background\", \"orange\");\n");
      out.write("                        var slices = trs.slice(selectedRow, selectedRow+1).text().trim().replace(/\\s/g, \"\");\n");
      out.write("                        $('#sparklinesExample').html(slices[0]+','+slices[1]+','+slices[2]);\n");
      out.write("                        $('#sparklinesExample').sparkline('html', { type: 'pie', height: '9.0em' });\n");
      out.write("                    });\n");
      out.write("                },\n");
      out.write(" \n");
      out.write("                reset: function(id)\n");
      out.write("                {\n");
      out.write("                    $('#'+id).hide();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write(" \n");
      out.write("    </script>\n");
      out.write(" \n");
      out.write("    <style type=\"text/css\" media=\"screen\">\n");
      out.write("        .demoarea {\n");
      out.write(" \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write(" \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("<h3>Demo: Using .slice() to perform actions on a subset of elements.</h3>\n");
      out.write("<p><a href=\"#\" id=\"slice-demobtn\" class=\"demobtn btn actionr\">Run Demo</a> <a href=\"#\" id=\"slice-codebtn\" class=\"codebtn btn actionr\">View Code</a> <a href=\"#\" id=\"slice-resetbtn\" class=\"resetbtn btn actionr\" style=\"display: none;\">Reset</a></p>\n");
      out.write("<div class=\"demoarea\" id=\"slice\" style=\"border:1px solid orange; padding:25px;height: 280px;width: 550px;\">\n");
      out.write("    <div style=\"width:300px;float:left;\">\n");
      out.write("<table border=\"1\">\n");
      out.write("<tr>\n");
      out.write("<th>Slice 1</th>\n");
      out.write("<th>Slice 2</th>\n");
      out.write("<th>Slice 3</th>\n");
      out.write("</tr>\n");
      out.write("<tr><td>1</td><td>1</td><td>1</td></tr>\n");
      out.write("<tr><td>1</td><td>2</td><td>3</td></tr>\n");
      out.write("<tr><td>1</td><td>4</td><td>2</td></tr>\n");
      out.write("<tr><td>7</td><td>3</td><td>0</td></tr>\n");
      out.write("<tr><td>3</td><td>6</td><td>1</td></tr>\n");
      out.write("</table>\n");
      out.write("<button class=\"btn\">Slice Me!</button>\n");
      out.write("    </div>\n");
      out.write("    <div style=\"width:150px; display:inline-block; height: 160px;font-size:16px;color:blue;margin: 50px;\">\n");
      out.write("        <span id=\"sparklinesExample\"></span>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("</html>");
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
