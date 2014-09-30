package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.survey.beans.UserBean;
import com.survey.dao.UserDao;

public final class editsurvey_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/foundation.min.css\">\n");
      out.write("        <script src=\"found/jquery.js\"></script>      \n");
      out.write("        <script src=\"found/custom.modernizr.js\"></script>     \n");
      out.write("        <script src=\"found/foundation.min.js\"></script>\n");
      out.write("        <script>$(document).foundation();</script> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Edit User</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");

UserBean user = new UserBean();

UserDao dao = new UserDao();

      out.write("\n");
      out.write("<form method=\"POST\" action='UserHandlerSurvey' name=\"frmEditUser\"><input\n");
      out.write("type=\"hidden\" name=\"action\" value=\"edit\" /> ");

String uid = request.getParameter("surveyid");
if (!((uid) == null)) {
int id = Integer.parseInt(uid);
user = dao.getSurveyById(id);

      out.write("\n");
      out.write("    <h2>update here</h2>\n");
      out.write("<table width=\"500\" align=\"left\">\n");
      out.write("<tr>\n");
      out.write("<td>Survey ID</td>\n");
      out.write("<td><input type=\"text\" name=\"surveyid\" readonly=\"readonly\"\n");
      out.write("value=\"");
      out.print(user.getsurveyID());
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Survey Name</td>\n");
      out.write("<td><input type=\"text\" name=\"Survey\" value=\"");
      out.print(user.getsurvey());
      out.write("\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td><input type=\"submit\" value=\"Update\" /></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");

} else
out.println("ID Not Found");

      out.write("\n");
      out.write("</form>\n");
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
