package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testing_005fbutton_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write(".selectBtn{height:60px;width:80px;\n");
      out.write("  background-color:yellow;}\n");
      out.write("#abc{background-color:gray;height:100%;width:60%;}\n");
      out.write("</style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id='abc'></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("content = document.getElementById('abc');\n");
      out.write("\n");
      out.write("function dx(){\n");
      out.write("  var Btn = document.createElement('button');\n");
      out.write("  Btn.type = 'button';\n");
      out.write("  Btn.className = 'selectBtn';\n");
      out.write("  Btn.innerHTML = 'Submit';\n");
      out.write("  Btn.onclick = function() {\n");
      out.write("    this.innerHTML='Done';\n");
      out.write("    sessionStorage.done = true;\n");
      out.write("  }\n");
      out.write("  if (sessionStorage.done) {\n");
      out.write("    Btn.innerHTML = 'Done';\n");
      out.write("  }\n");
      out.write("  content.appendChild(Btn);   \n");
      out.write("}\n");
      out.write("\n");
      out.write("dx();\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    $(\"#tabs\").tabs({\n");
      out.write("    create: function(event, ui){\n");
      out.write("        $(this).tabs({'select': $(this).find(\"ul\").index($(this).find('a[href=\"' + window.location.hash + '\"]').parent())});\n");
      out.write("    },\n");
      out.write("    activate: function(event, ui){\n");
      out.write("        window.location.hash = $(ui.newTab[0]).find('a[href^=\"#Tab\"]').attr(\"href\");\n");
      out.write("    }\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<a href=\"javascript:location.reload();\">Reload page</a>\n");
      out.write("<div id=\"tabs\">\n");
      out.write("<ul id=\"ulid\" class=\"tabs\">\n");
      out.write("    <li> \n");
      out.write("        <a href=\"#Tab1\" id=\"newsdtls\" class=\"dtls\">Text 1</a>\n");
      out.write("    </li>\n");
      out.write("    <li>    \n");
      out.write("        <a href=\"#Tab2\" id=\"anndtls\" class=\"dtls\">Text 2</a>\n");
      out.write("    </li>\n");
      out.write("    <li>    \n");
      out.write("        <a href=\"#Tab3\" class=\"dtls\">Text 3</a>\n");
      out.write("    </li>\n");
      out.write("    <li>    \n");
      out.write("        <a href=\"#Tab4\" id=\"imgsdtls\" class=\"dtls\">Text 4</a>\n");
      out.write("    </li>\n");
      out.write("    <li>    \n");
      out.write("        <a href=\"#Tab5\" id=\"movieMakingdtls\" class=\"dtls\">Text 5</a>\n");
      out.write("    </li>\n");
      out.write("    <li>    \n");
      out.write("        <a href=\"#Tab6\" id=\"tradeInfodtls\" class=\"dtls\">Text 6</a>\n");
      out.write("    </li>\n");
      out.write("</ul>\n");
      out.write("<div id=\"Tab1\">Content 1</div>\n");
      out.write("<div id=\"Tab2\">Content 2</div>\n");
      out.write("<div id=\"Tab3\">Content 3</div>\n");
      out.write("<div id=\"Tab4\">Content 4</div>\n");
      out.write("<div id=\"Tab5\">Content 5</div>\n");
      out.write("<div id=\"Tab6\">Content 6</div>\n");
      out.write("</div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<ul id=\"ulid\" class=\"\">\n");
      out.write("        <li class=\"\">\n");
      out.write("            <a href=\"#tab=one\" id=\"one\" class=\"active\">text1</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"#tab=two\" id=\"two\" class=\"\">text2</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"#tab=three\" id=\"three\" class=\"\">text3</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"#tab=four\" id=\"four\" class=\"\">text4</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"#tab=five\" id=\"five\" class=\"\">text5</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"#tab=six\" id=\"six\"  class=\"\">text6</a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function parseHashBangArgs(aURL) {\n");
      out.write("\n");
      out.write("aURL = aURL || window.location.href;\n");
      out.write("\n");
      out.write("var vars = {};\n");
      out.write("var hashes = aURL.slice(aURL.indexOf('#') + 1).split('&');\n");
      out.write("\n");
      out.write("for(var i = 0; i < hashes.length; i++) {\n");
      out.write("   var hash = hashes[i].split('=');\n");
      out.write("\n");
      out.write("   if(hash.length > 1) {\n");
      out.write("       vars[hash[0]] = hash[1];\n");
      out.write("   } else {\n");
      out.write("      vars[hash[0]] = null;\n");
      out.write("   }      \n");
      out.write("}\n");
      out.write("\n");
      out.write("return vars;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $('ul#ulid li a').click(function(){\n");
      out.write("    $('li a').removeClass('active');\n");
      out.write("    $(this).addClass('active');\n");
      out.write("});\n");
      out.write("\n");
      out.write("var selectedTab = parseHashBangArgs(window.location.href).tab;\n");
      out.write("if(selectedTab){\n");
      out.write("    $('li a').removeClass('active');\n");
      out.write("    $('#'+selectedTab).addClass('active');\n");
      out.write("}\n");
      out.write("    </script>\n");
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
