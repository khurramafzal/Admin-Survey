package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TestZurb_005fButton_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Survey</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("      var categoryId = null;\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <link href=\"button_js/application-454cd6bceaebb1d6efd280d1849b4280.css\" media=\"screen\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"button_js/foundicons-5bb0c000ab78d795f62f4a83ac4cf31f.css\" media=\"screen\" rel=\"stylesheet\" />\n");
      out.write("    <script src=\"button_js/vendor/custom.modernizr-8b14e1bab48835cc3f6679272cc68047.js\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"off-canvas hide-extras antialiased dark-page\">\n");
      out.write("\n");
      out.write("  <section role=\"main\" class=\"body\">\n");
      out.write("\n");
      out.write("  <!-- Mobile nav header -->\n");
      out.write("  <div class=\"row show-for-small offcanvas-toggle\">\n");
      out.write("    <div class=\"large-12 columns\">\n");
      out.write("      <a class=\"sidebar-button\" id=\"sidebarButton\" href=\"#sidebar\">\n");
      out.write("        <h4>ZURB Playground</h4>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("  .transparent.header {\n");
      out.write("    background: #333;\n");
      out.write("  }\n");
      out.write("  section[role=\"main\"] {\n");
      out.write("    background: #333;\n");
      out.write("    color: #fff;\n");
      out.write("  }\n");
      out.write("  section[role=\"main\"] h1 {\n");
      out.write("    color: #fff;\n");
      out.write("  }\n");
      out.write("  section[role=\"main\"] h2 {\n");
      out.write("    color: #fff;\n");
      out.write("  }\n");
      out.write("  section[role=\"main\"] h3 {\n");
      out.write("    color: #fff;\n");
      out.write("  }\n");
      out.write("  .button {\n");
      out.write("    margin-right: 0.5em;\n");
      out.write("    border-radius: 4px;\n");
      out.write("  }\n");
      out.write("  ol {\n");
      out.write("    margin-left: 2em;\n");
      out.write("  }\n");
      out.write("  div#sidebarAd.cleanslate {\n");
      out.write("    background: #444 !important;\n");
      out.write("    color: #fff !important;\n");
      out.write("  }\n");
      out.write("  div#sidebarAd.cleanslate .ad-sponsor {\n");
      out.write("    color: #ccc !important;\n");
      out.write("  }\n");
      out.write("  .zurb-footer-top {\n");
      out.write("    background: #222;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  @-webkit-keyframes bigAssButtonPulse {\n");
      out.write("\t  from { background-color: #749a02; -webkit-box-shadow: 0 0 25px #333; }\n");
      out.write("\t  50% { background-color: #91bd09; -webkit-box-shadow: 0 0 50px #91bd09; }\n");
      out.write("\t  to { background-color: #749a02; -webkit-box-shadow: 0 0 25px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes greenPulse {\n");
      out.write("\t  from { background-color: #749a02; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #91bd09; -webkit-box-shadow: 0 0 18px #91bd09; }\n");
      out.write("\t  to { background-color: #749a02; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes bluePulse {\n");
      out.write("\t  from { background-color: #007d9a; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #2daebf; -webkit-box-shadow: 0 0 18px #2daebf; }\n");
      out.write("\t  to { background-color: #007d9a; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes redPulse {\n");
      out.write("\t  from { background-color: #bc330d; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #e33100; -webkit-box-shadow: 0 0 18px #e33100; }\n");
      out.write("\t  to { background-color: #bc330d; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes magentaPulse {\n");
      out.write("\t  from { background-color: #630030; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #a9014b; -webkit-box-shadow: 0 0 18px #a9014b; }\n");
      out.write("\t  to { background-color: #630030; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes orangePulse {\n");
      out.write("\t  from { background-color: #d45500; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #ff5c00; -webkit-box-shadow: 0 0 18px #ff5c00; }\n");
      out.write("\t  to { background-color: #d45500; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes orangellowPulse {\n");
      out.write("\t  from { background-color: #fc9200; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #ffb515; -webkit-box-shadow: 0 0 18px #ffb515; }\n");
      out.write("\t  to { background-color: #fc9200; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\ta.button {\n");
      out.write("\t\t-webkit-animation-duration: 2s;\n");
      out.write("\t\t-webkit-animation-iteration-count: infinite; \n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.green.button { -webkit-animation-name: greenPulse; -webkit-animation-duration: 3s; }\n");
      out.write("\t.blue.button { -webkit-animation-name: bluePulse; -webkit-animation-duration: 4s; }\n");
      out.write("\t.red.button { -webkit-animation-name: redPulse; -webkit-animation-duration: 1s; }\n");
      out.write("\t.magenta.button { -webkit-animation-name: magentaPulse; -webkit-animation-duration: 2s; }\n");
      out.write("\t.orange.button { -webkit-animation-name: orangePulse; -webkit-animation-duration: 3s; }\n");
      out.write("\t.orangellow.button { -webkit-animation-name: orangellowPulse; -webkit-animation-duration: 5s; }\n");
      out.write("\t\n");
      out.write("\t.wall-of-buttons { text-align: center; margin-top: 2em; margin-bottom: 2em; }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div id=\"radioactive-buttons-page\" class=\"dark-code\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Wall of Buttons -->\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div class=\"large-12 columns wall-of-buttons\">\n");
      out.write("\t\t<a class=\"green button\">Look at me!</a>\n");
      out.write("\t\t<a class=\"blue button\">Click me!</a>\n");
      out.write("\t\t<a class=\"magenta button\">Hi ho, Silver!</a>\n");
      out.write("\t\t<a class=\"green button\">Look at me!</a>\n");
      out.write("\t\t<a class=\"red button\">I'm Glowing!</a>\n");
      out.write("\t\t<a class=\"magenta button\">Hi ho, Silver!</a>\n");
      out.write("\t\t\n");
      out.write("\t\t<a class=\"orange button\">Call to Action</a>\n");
      out.write("\t\t<a class=\"magenta button\">Hi ho, Silver!</a>\n");
      out.write("\t\t<a class=\"green button\">Look at me!</a>\n");
      out.write("\t\t<a class=\"orangellow button\">Got clicks?</a>\n");
      out.write("\t\t<a class=\"blue button\">Click me!</a>\n");
      out.write("\t\t<a class=\"red button\">I'm Glowing!</a>\n");
      out.write("\t\t<a class=\"blue button\">Click me!</a>\n");
      out.write("\t\t\n");
      out.write("\t\t<a class=\"magenta button\">Hi ho, Silver!</a>\n");
      out.write("\t\t<a class=\"orangellow button\">Got clicks?</a>\n");
      out.write("\t\t<a class=\"red button\">I'm Glowing!</a>\n");
      out.write("\t\t<a class=\"orange button\">Call to Action</a>\n");
      out.write("\t\t<a class=\"green button\">Look at me!</a>\n");
      out.write("\t\t<a class=\"orangellow button\">Got clicks?</a>\n");
      out.write("\t\t<a class=\"red button\">I'm Glowing!</a>\n");
      out.write("\n");
      out.write("\t\t<a class=\"blue button\">Click me!</a>\n");
      out.write("\t\t<a class=\"orangellow button\">Got clicks?</a>\n");
      out.write("\t\t<a class=\"blue button\">Click me!</a>\n");
      out.write("\t\t<a class=\"red button\">I'm Glowing!</a>\n");
      out.write("\t\t<a class=\"orange button\">Call to Action</a>\n");
      out.write("\t\t<a class=\"orangellow button\">Got clicks?</a>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- /Wall of Buttons -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <div class=\"reveal-modal-bg\"></div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"button_js/application-33285803af8fb0638f18b56d23239b09.js\"></script>\n");
      out.write("  <script src=\"button_js/jquery.offcanvas-c6deb341926c97e94c30e9e268a52ea1.js\"></script>\n");
      out.write("  \n");
      out.write("  </body>\n");
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
