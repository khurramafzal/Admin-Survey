package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class survey_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--        <link rel=\"stylesheet\" href=\"foundation/css/foundation.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"foundation/css/foundation.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"foundation/css/foundation.normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"foundation/css/style.css\">\n");
      out.write("\n");
      out.write("        <script src=\"foundation/js/vendor/jquery.js\"></script>        \n");
      out.write("        <script src=\"foundation/js/vendor/custom.modernizr.js\"></script>\n");
      out.write("        <script src=\"foundation/js/foundation.min.js\"></script>  -->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/foundation.min.css\">\n");
      out.write("\n");
      out.write("  <script src=\"found/jquery.js\"></script>      \n");
      out.write("  <script src=\"found/custom.modernizr.js\"></script>     \n");
      out.write("  <script src=\"found/foundation.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>$(document).foundation(); </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                <div class=\"row\">\n");
      out.write("<div class=\"large-4 columns\">\n");
      out.write("<h2 >SURVEY FORMS</h2>\n");
      out.write("<hr />\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"section-container auto\" data-section data-options=\"deep_linking: true;\">\n");
      out.write("                <section class=\"active\">\n");
      out.write("                    <p class=\"title\" data-section-title><a href=\"#panel1\">category 1</a></p>\n");
      out.write("                    <div class=\"content\" data-slug=\"panel1\" data-section-content>\n");
      out.write("                        <form>\n");
      out.write("                             <fieldset>\n");
      out.write("                                  <legend>ENTER QUESTIONS</legend>\n");
      out.write("                            <div class=\"row collapse\">\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                    <label class=\"inline\">Question 1</label>\n");
      out.write("                                 </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-7 columns\">\n");
      out.write("                                    <input type=\"text\" id=\"question1\" placeholder=\"enter question1\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                 <label for=\"customDropdown1\" class=\"inline\">\n");
      out.write("                                 \n");
      out.write("                                     <select id=\"customDropdown1\" class=\"medium\">\n");
      out.write("                                      <option>AGREE</option>\n");
      out.write("                                      <option>DISAGREE</option>\n");
      out.write("                                      <option>STRONGLY AGREE</option>\n");
      out.write("                                      <option>NEUTRAL</option>\n");
      out.write("                                  </select>\n");
      out.write("                                 </label>\n");
      out.write("                                   </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row collapse\">\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                    <label class=\"inline\"> Question 2</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"large-7 columns\">\n");
      out.write("                                    <input type=\"text\" id=\"question2\" placeholder=\"enter question2\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                 <label for=\"customDropdown1\" class=\"inline\">\n");
      out.write("                                       <select id=\"customDropdown1\" class=\"medium\">\n");
      out.write("                                             <option>AGREE</option>\n");
      out.write("                                      <option>DISAGREE</option>\n");
      out.write("                                    <option>STRONGLY AGREE</option>\n");
      out.write("                                  <option>NEUTRAL</option>\n");
      out.write("                                  </select>\n");
      out.write("                                 </label>\n");
      out.write("                                   </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row collapse\">\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                    <label class=\"inline\"> Question 3</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"large-7 columns\">\n");
      out.write("                                    <input type=\"text\" id=\"question3\" placeholder=\"enter question3\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                 <label for=\"customDropdown1\" class=\"inline\">\n");
      out.write("                                       <select id=\"customDropdown1\" class=\"medium\">\n");
      out.write("                                             <option>AGREE</option>\n");
      out.write("                                      <option>DISAGREE</option>\n");
      out.write("                                    <option>STRONGLY AGREE</option>\n");
      out.write("                                  <option>NEUTRAL</option>\n");
      out.write("                                  </select>\n");
      out.write("                                 </label>\n");
      out.write("                                   </div>\n");
      out.write("                            </div>\n");
      out.write("     <div class=\"row collapse\">\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                    <label class=\"inline\">Question 4</label>\n");
      out.write("                                 </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-7 columns\">\n");
      out.write("                                    <input type=\"text\" id=\"question4\" placeholder=\"enter question4\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                 <label for=\"customDropdown1\" class=\"inline\">\n");
      out.write("                                       <select id=\"customDropdown1\" class=\"medium\">\n");
      out.write("                                             <option>AGREE</option>\n");
      out.write("                                      <option>DISAGREE</option>\n");
      out.write("                                    <option>STRONGLY AGREE</option>\n");
      out.write("                                  <option>NEUTRAL</option>\n");
      out.write("                                  </select>\n");
      out.write("                                 </label>\n");
      out.write("                                   </div>\n");
      out.write("                            </div>\n");
      out.write("     <div class=\"row collapse\">\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                    <label class=\"inline\">Question 5</label>\n");
      out.write("                                 </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-7 columns\">\n");
      out.write("                                    <input type=\"text\" id=\"question5\" placeholder=\"enter question5\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                 <label for=\"customDropdown1\" class=\"inline\">\n");
      out.write("                                       <select id=\"customDropdown1\" class=\"medium\">\n");
      out.write("                                             <option>AGREE</option>\n");
      out.write("                                      <option>DISAGREE</option>\n");
      out.write("                                    <option>STRONGLY AGREE</option>\n");
      out.write("                                  <option>NEUTRAL</option>\n");
      out.write("                                  </select>\n");
      out.write("                                 </label>\n");
      out.write("                                   </div>\n");
      out.write("                            </div>\n");
      out.write("                                                      </fieldset>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <a href=\"#\" class=\"button alert round disabled\">SUBMIT</a>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <section>\n");
      out.write("                    <p class=\"title\" data-section-title><a href=\"#panel2\">category 2</a></p>\n");
      out.write("                    <div class=\"content\" data-slug=\"panel2\" data-section-content>\n");
      out.write("                        <div class=\"section-container auto\" data-section data-options=\"deep_linking: true;\">\n");
      out.write("                            <section class=\"active\" data-section-region>\n");
      out.write("                                <p class=\"title\" data-section-title><a href=\"#panel2nested1\">sub category 1</a></p>\n");
      out.write("                                <div class=\"content\" data-slug=\"nested1\" data-section-content>\n");
      out.write("                                    <form>\n");
      out.write("                                        <fieldset>\n");
      out.write("                                             <legend>UPLOAD PICTURES</legend>\n");
      out.write("                                        <div class=\"row collapse\">\n");
      out.write("                                            <div class=\"large-2 columns\">\n");
      out.write("                                                <label class=\"inline\"><img src=\"../img/demos/demo1.png\"></label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"large-7 columns\">\n");
      out.write("                                                <input type=\"text\" id=\"yourName\" placeholder=\"enter question1\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"large-2 columns\">\n");
      out.write("                                                 <div class=\"small-2 switch medium round\">\n");
      out.write("\n");
      out.write("                                                <input id=\"d\" name=\"switch-d\" type=\"radio\" checked>\n");
      out.write("                                                <label for=\"d\" class=\"success button\" onclick=\"\">yes</label>\n");
      out.write("\n");
      out.write("                                                <input id=\"d1\" name=\"switch-d\" type=\"radio\">\n");
      out.write("                                                <label for=\"d1\" class=\"small alert button\" onclick=\"\">no</label>\n");
      out.write("\n");
      out.write("                                                <span> </span>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                       \n");
      out.write("                                        </fieldset>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <a href=\"#\" class=\"button alert round disabled\">SUBMIT</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </section>\n");
      out.write("                            <section data-section-region>\n");
      out.write("                                <p class=\"title\" data-section-title><a href=\"#panel2nested2\">sub category  2</a></p>\n");
      out.write("                                <div class=\"content\" data-slug=\"panel2nested2\" data-section-content>\n");
      out.write("                                    <form>\n");
      out.write("                                         <fieldset>\n");
      out.write("                                             <legend>UPLOAD PICTURES</legend>\n");
      out.write("                                        <div class=\"row collapse\">\n");
      out.write("                                            <div class=\"large-2 columns\">\n");
      out.write("                                                <label class=\"inline\"><img src=\"../img/demos/demo1.png\"></label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"large-7 columns\">\n");
      out.write("                                                <input type=\"text\" id=\"yourName\" placeholder=\"enter question1\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"large-2 columns\">\n");
      out.write("                                                 <div class=\"small-2 switch medium round\">\n");
      out.write("\n");
      out.write("                                                <input id=\"d\" name=\"switch-d\" type=\"radio\" checked>\n");
      out.write("                                                <label for=\"d\" class=\"success button\" onclick=\"\">yes</label>\n");
      out.write("\n");
      out.write("                                                <input id=\"d1\" name=\"switch-d\" type=\"radio\">\n");
      out.write("                                                <label for=\"d1\" class=\"small alert button\" onclick=\"\">no</label>\n");
      out.write("\n");
      out.write("                                                <span> </span>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                       \n");
      out.write("                                        </fieldset>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <a href=\"#\" class=\"button alert round disabled\">SUBMIT</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </section>\n");
      out.write("                            <div data-section-region class=\"section\">\n");
      out.write("                                <p class=\"title\" data-section-title><a href=\"#panel2nested3\">sub category  3</a></p>\n");
      out.write("                                <div class=\"content\" data-slug=\"panel2nested3\" data-section-content>\n");
      out.write("                                    <form>\n");
      out.write("                                        <fieldset>\n");
      out.write("                                             <legend>UPLOAD PICTURES</legend>\n");
      out.write("                                        <div class=\"row collapse\">\n");
      out.write("                                            <div class=\"large-2 columns\">\n");
      out.write("                                                <label class=\"inline\"><img src=\"../img/demos/demo1.png\"></label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"large-7 columns\">\n");
      out.write("                                                <input type=\"text\" id=\"yourName\" placeholder=\"enter question1\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"large-2 columns\">\n");
      out.write("                                                 <div class=\"small-2 switch medium round\">\n");
      out.write("\n");
      out.write("                                                <input id=\"d\" name=\"switch-d\" type=\"radio\" checked>\n");
      out.write("                                                <label for=\"d\" class=\"success button\" onclick=\"\">yes</label>\n");
      out.write("\n");
      out.write("                                                <input id=\"d1\" name=\"switch-d\" type=\"radio\">\n");
      out.write("                                                <label for=\"d1\" class=\"small alert button\" onclick=\"\">no</label>\n");
      out.write("\n");
      out.write("                                                <span> </span>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                       \n");
      out.write("                                        </fieldset>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <a href=\"#\" class=\"button alert round disabled\">SUBMIT</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <div data-section-region class=\"section\">\n");
      out.write("                    <p class=\"title\" data-section-title><a href=\"#panel3\">category 3</a></p>\n");
      out.write("                    <div class=\"content\" data-slug=\"panel3\" data-section-content>\n");
      out.write("                        <form>\n");
      out.write("                            <fieldset>\n");
      out.write("                                <legend>ENTER QUESTIONS</legend>\n");
      out.write("                             <div class=\"row collapse\">\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                    <label class=\"inline\">Question 1</label>\n");
      out.write("                                 </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-7 columns\">\n");
      out.write("                                    <input type=\"text\" id=\"question1\" placeholder=\"enter question1\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                  <label for=\"customDropdown1\" class=\"inline\">\n");
      out.write("                                  <div class=\"small-2 switch medium round\">\n");
      out.write("\n");
      out.write("                                                <input id=\"d\" name=\"switch-d\" type=\"radio\" checked>\n");
      out.write("                                                <label for=\"d\" class=\"success button\" onclick=\"\">yes</label>\n");
      out.write("\n");
      out.write("                                                <input id=\"d1\" name=\"switch-d\" type=\"radio\">\n");
      out.write("                                                <label for=\"d1\" class=\"small alert button\" onclick=\"\">no</label>\n");
      out.write("\n");
      out.write("                                                <span> </span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </label>\n");
      out.write("                                   </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row collapse\">\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                    <label class=\"inline\"> Question 2</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"large-7 columns\">\n");
      out.write("                                    <input type=\"text\" id=\"question2\" placeholder=\"enter question2\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                   <label for=\"customDropdown1\" class=\"inline\">\n");
      out.write("                                  <div class=\"small-2 switch medium round\">\n");
      out.write("\n");
      out.write("                                                <input id=\"d\" name=\"switch-d\" type=\"radio\" checked>\n");
      out.write("                                                <label for=\"d\" class=\"success button\" onclick=\"\">yes</label>\n");
      out.write("\n");
      out.write("                                                <input id=\"d1\" name=\"switch-d\" type=\"radio\">\n");
      out.write("                                                <label for=\"d1\" class=\"small alert button\" onclick=\"\">no</label>\n");
      out.write("\n");
      out.write("                                                <span> </span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </label>\n");
      out.write("                                   </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row collapse\">\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                    <label class=\"inline\"> Question 3</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"large-7 columns\">\n");
      out.write("                                    <input type=\"text\" id=\"question3\" placeholder=\"enter question3\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                 <label for=\"customDropdown1\" class=\"inline\">\n");
      out.write("                                  <div class=\"small-2 switch medium round\">\n");
      out.write("\n");
      out.write("                                                <input id=\"d\" name=\"switch-d\" type=\"radio\" checked>\n");
      out.write("                                                <label for=\"d\" class=\"success button\" onclick=\"\">yes</label>\n");
      out.write("\n");
      out.write("                                                <input id=\"d1\" name=\"switch-d\" type=\"radio\">\n");
      out.write("                                                <label for=\"d1\" class=\"small alert button\" onclick=\"\">no</label>\n");
      out.write("\n");
      out.write("                                                <span> </span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </label>\n");
      out.write("                                   </div>\n");
      out.write("                            </div>\n");
      out.write("     <div class=\"row collapse\">\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                    <label class=\"inline\">Question 4</label>\n");
      out.write("                                 </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-7 columns\">\n");
      out.write("                                    <input type=\"text\" id=\"question4\" placeholder=\"enter question4\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                   <label for=\"customDropdown1\" class=\"inline\">\n");
      out.write("                                  <div class=\"small-2 switch medium round\">\n");
      out.write("\n");
      out.write("                                                <input id=\"d\" name=\"switch-d\" type=\"radio\" checked>\n");
      out.write("                                                <label for=\"d\" class=\"success button\" onclick=\"\">yes</label>\n");
      out.write("\n");
      out.write("                                                <input id=\"d1\" name=\"switch-d\" type=\"radio\">\n");
      out.write("                                                <label for=\"d1\" class=\"small alert button\" onclick=\"\">no</label>\n");
      out.write("\n");
      out.write("                                                <span> </span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </label>\n");
      out.write("                                   </div>\n");
      out.write("                            </div>\n");
      out.write("     <div class=\"row collapse\">\n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                    <label class=\"inline\">Question 5</label>\n");
      out.write("                                 </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-7 columns\">\n");
      out.write("                                    <input type=\"text\" id=\"question5\" placeholder=\"enter question5\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"large-2 columns\">\n");
      out.write("                                    <label for=\"customDropdown1\" class=\"inline\">\n");
      out.write("                                  <div class=\"small-2 switch medium round\">\n");
      out.write("\n");
      out.write("                                                <input id=\"d\" name=\"switch-d\" type=\"radio\" checked>\n");
      out.write("                                                <label for=\"d\" class=\"success button\" onclick=\"\">yes</label>\n");
      out.write("\n");
      out.write("                                                <input id=\"d1\" name=\"switch-d\" type=\"radio\">\n");
      out.write("                                                <label for=\"d1\" class=\"small alert button\" onclick=\"\">no</label>\n");
      out.write("\n");
      out.write("                                                <span> </span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </label>\n");
      out.write("                                   </div>\n");
      out.write("                            </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <a href=\"#\" class=\"button alert round disabled\">SUBMIT</a>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
