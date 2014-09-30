package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.lang.*;
import java.io.*;

public final class PieData_jsp extends org.apache.jasper.runtime.HttpJspBase
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

/** 
 * The following JSP script is a sample script designed to demonstrate
 * a method for creating real-time dynamic graphs from data
 * held within databases.
 *
 * This sample connects to a database and reads data from
 * a table "SalesLine". It then formats the data for use by the
 * Active Graph software.
 *
 * You may freely copy and modify this script to suite your own
 * requirements.
 *
 * 
 */

/*
 * Initialise and set variables
 */
String     url   = "jdbc:MySQL:///graphtestdb";  // URL specifying the JDBC connection to a MySQL database graphtestdb.
Connection con   = null;                         
Statement  stmt  = null;                         
String     query;                                
int        datacount;
ResultSet  rs    = null;

/*
 * Establish the database connection
 */
try 
{
    Class.forName("org.gjt.mm.mysql.Driver");
    con = DriverManager.getConnection (url,"[DB Username]","[DB Password]");
    stmt = con.createStatement();
} 
catch(ClassNotFoundException e) 
{
    out.println("Could not load database driver: " + e.getMessage());
}
catch(SQLException e) 
{
    out.println("SQLException caught: " + e.getMessage());
}

/*
 * Get the data from the database
 */
try 
{
    query = "SELECT productx,producty,productz FROM sales ORDER BY month";
    rs    = stmt.executeQuery(query);
    
    /*
     * Output the data to the graph
     */
    datacount = 1;
    while (rs.next()) 
        {
        out.println("series1data" + datacount + " = " + rs.getString("productx")+"\n");
        out.println("series2data" + datacount + " = " + rs.getString("producty")+"\n");
        out.println("series3data" + datacount + " = " + rs.getString("productz")+"\n");          
        datacount++;
    }
	
}
catch(SQLException e) 
{
    out.println("SQLException caught: " + e.getMessage());
}
finally 
{
    try 
    {
        if (con != null) con.close();
    }
    catch (SQLException e) 
    {
        out.println("Errot trying to close database connection: " + e.getMessage());
    }
}	
	

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
