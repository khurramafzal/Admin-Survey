package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class testing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<form method=\"post\" action=\"testing2.jsp\">\n");
      out.write("<table>\n");

Class.forName("com.mysql.jdbc.Driver"); 
Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/survey","root","");
Statement st=conn.createStatement();
ResultSet rs=st.executeQuery("select * from question");
int i=0;
while(rs.next()){ 

      out.write("\n");
      out.write("<tr><td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("<td><input type=\"hidden\" name=\"quid\" value=\"");
      out.print(rs.getString(1));
      out.write("\"><td><input type=\"radio\" value=\"Poor\" name=\"radio");
      out.print(i);
      out.write("\"/>Poor</td><td><input type=\"radio\" value=\"Average\" name=\"radio");
      out.print(i);
      out.write("\"/>Average</td><td><input type=\"radio\" value=\"Good\" name=\"radio");
      out.print(i);
      out.write("\"/>Good</td></tr>\n");
 i++;
}

      out.write("\n");
      out.write("<tr><td><input type=\"Submit\" value=\"Submit\"></td></tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
