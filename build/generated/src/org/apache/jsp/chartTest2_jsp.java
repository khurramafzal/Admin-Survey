package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chartTest2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <title>AJAX and JSON Data Loading via Data Renderers</title>\n");
      out.write("\n");
      out.write("    <link class=\"include\" rel=\"stylesheet\" type=\"text/css\" href=\"../jquery.jqplot.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"examples.min.css\" />\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"syntaxhighlighter/styles/shCoreDefault.min.css\" />\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"syntaxhighlighter/styles/shThemejqPlot.min.css\" />\n");
      out.write("  \n");
      out.write("    <!--[if lt IE 9]><script language=\"javascript\" type=\"text/javascript\" src=\"../excanvas.js\"></script><![endif]-->\n");
      out.write("    <script class=\"include\" type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <div class=\"nav\">\n");
      out.write("            <a class=\"nav\" href=\"../../../index.php\"><span>&gt;</span>Home</a>\n");
      out.write("            <a class=\"nav\"  href=\"../../../docs/\"><span>&gt;</span>Docs</a>\n");
      out.write("            <a class=\"nav\"  href=\"../../download/\"><span>&gt;</span>Download</a>\n");
      out.write("            <a class=\"nav\" href=\"../../../info.php\"><span>&gt;</span>Info</a>\n");
      out.write("            <a class=\"nav\"  href=\"../../../donate.php\"><span>&gt;</span>Donate</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"colmask leftmenu\">\n");
      out.write("      <div class=\"colleft\">\n");
      out.write("        <div class=\"col1\" id=\"example-content\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("<!-- Example scripts go here -->\n");
      out.write("\n");
      out.write("<p>Data renderers allow jqPlot to pull data from any external source (e.g. a function implementing an AJAX call).  Simply assign the external source to the \"dataRenderer\" plot option.  The only requirement on data renderers is that it must return a valid jqPlot data array.</p>\n");
      out.write("\n");
      out.write("<div id=\"chart1\" style=\"height:300px; width:500px;\"></div>\n");
      out.write("\n");
      out.write("<pre class=\"code prettyprint brush: js\"></pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("<p>Data renderers get passed options by the plot.  The signiture for a data renderer is:</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("<pre class=\"brush: js\">\n");
      out.write("function(userData, plotObject, options) {\n");
      out.write("  ...\n");
      out.write("  return data;\n");
      out.write("}\n");
      out.write("</pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("<p>Where userData is whatever data was passed into the plot, plotObject is a reference back to the plot itself, and options are any options passed into the plots \"dataRendererOption\" option.  The following example shows a more complicated example which uses ajax pulls data from an external json data source.</p>\n");
      out.write("\n");
      out.write("<div id=\"chart2\" style=\"height:300px; width:500px;\"></div>\n");
      out.write("\n");
      out.write("<pre class=\"code prettyprint brush: js\"></pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script class=\"code\" type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("  // Our data renderer function, returns an array of the form:\n");
      out.write("  // [[[x1, sin(x1)], [x2, sin(x2)], ...]]\n");
      out.write("  var sineRenderer = function() {\n");
      out.write("    var data = [[]];\n");
      out.write("    for (var i=0; i<13; i+=0.5) {\n");
      out.write("      data[0].push([i, Math.sin(i)]);\n");
      out.write("    }\n");
      out.write("    return data;\n");
      out.write("  };\n");
      out.write("\n");
      out.write("  // we have an empty data array here, but use the \"dataRenderer\"\n");
      out.write("  // option to tell the plot to get data from our renderer.\n");
      out.write("  var plot1 = $.jqplot('chart1',[],{\n");
      out.write("      title: 'Sine Data Renderer',\n");
      out.write("      dataRenderer: sineRenderer\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("  \n");
      out.write("<script class=\"code\" type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("  // Our ajax data renderer which here retrieves a text file.\n");
      out.write("  // it could contact any source and pull data, however.\n");
      out.write("  // The options argument isn't used in this renderer.\n");
      out.write("  var ajaxDataRenderer = function(url, plot, options) {\n");
      out.write("    var ret = null;\n");
      out.write("    $.ajax({\n");
      out.write("      // have to use synchronous here, else the function \n");
      out.write("      // will return before the data is fetched\n");
      out.write("      async: false,\n");
      out.write("      url: url,\n");
      out.write("      dataType:\"json\",\n");
      out.write("      success: function(data) {\n");
      out.write("        ret = data;\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("    return ret;\n");
      out.write("  };\n");
      out.write("\n");
      out.write("  // The url for our json data\n");
      out.write("  var jsonurl = \"./jsondata.txt\";\n");
      out.write("\n");
      out.write("  // passing in the url string as the jqPlot data argument is a handy\n");
      out.write("  // shortcut for our renderer.  You could also have used the\n");
      out.write("  // \"dataRendererOptions\" option to pass in the url.\n");
      out.write("  var plot2 = $.jqplot('chart2', jsonurl,{\n");
      out.write("    title: \"AJAX JSON Data Renderer\",\n");
      out.write("    dataRenderer: ajaxDataRenderer,\n");
      out.write("    dataRendererOptions: {\n");
      out.write("      unusedOptionalUrl: jsonurl\n");
      out.write("    }\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- End example scripts -->\n");
      out.write("\n");
      out.write("<!-- Don't touch this! -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script class=\"include\" type=\"text/javascript\" src=\"../jquery.jqplot.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"syntaxhighlighter/scripts/shCore.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"syntaxhighlighter/scripts/shBrushJScript.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"syntaxhighlighter/scripts/shBrushXml.min.js\"></script>\n");
      out.write("<!-- End Don't touch this! -->\n");
      out.write("\n");
      out.write("<!-- Additional plugins go here -->\n");
      out.write("\n");
      out.write("    <script class=\"include\" language=\"javascript\" type=\"text/javascript\" src=\"../plugins/jqplot.json2.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- End additional plugins -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("         <div class=\"col2\">\n");
      out.write("\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"data-renderers.html\">AJAX and JSON Data Loading via Data Renderers</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"barLineAnimated.html\">Animated Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"dashboardWidget.html\">Animated Dashboard Sample - Filled Line with Log Axis</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"kcp_area.html\">Area Chart</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"kcp_area2.html\">Area Chart 2</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"axisLabelTests.html\">Axis Labels</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"axisLabelsRotatedText.html\">Axis Labels and Rotated Text</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"barTest.html\">Bar Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"multipleBarColors.html\">Bar Colors Example</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"bezierCurve.html\">Bezier Curve Plots</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"blockPlot.html\">Block Plots</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"bubbleChart.html\">Bubble Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"bubble-plots.html\">Bubble Plots</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"candlestick.html\">Candlestick and Open Hi Low Close Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"theming.html\">Chart Theming</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"fillBetweenLines.html\">Charts with Fill Between Lines</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"kcp_cdf.html\">Cumulative Density Function Chart</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"dashedLines.html\">Dashed Lines with Smoothing</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"cursor-highlighter.html\">Data Point Highlighting, Tooltips and Cursor Tracking</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"point-labels.html\">Data Point labels</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"date-axes.html\">Date Axes</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"dateAxisRenderer.html\">Date Axes 2</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"rotatedTickLabelsZoom.html\">Date Axes, Rotated Labels and Zooming</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"canvas-overlay.html\">Draw Lines on Plots - Canvas Overlay</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"draw-rectangles.html\">Draw Rectangles on Plots</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"kcp_engel.html\">Engel Curves</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"bandedLine.html\">Error Bands and Confidence Intervals</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"area.html\">Filled (Area) Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"axisScalingForceTickAt.html\">Force Plot to Have Tick at 0 or 100</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"hiddenPlotsInTabs.html\">Hidden Plots</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"customHighlighterCursorTrendline.html\">Highlighting, Dragging Points, Cursor and Trend Lines</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"line-charts.html\">Line Charts and Options</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"kcp_lorenz.html\">Lorenz Curves</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"mekkoCharts.html\">Mekko Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"meterGauge.html\">Meter Gauge</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"candlestick-charts.html\">Open Hi Low Close and Candlestick Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"pieTest.html\">Pie Charts and Options</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"pieTest4.html\">Pie Charts and Options 2</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"pie-donut-charts.html\">Pie and Donut Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"selectorSyntax.html\">Plot Creation with jQuery Selectors</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"zooming.html\">Plot Zooming and Cursor Control</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"kcp_pdf.html\">Probability Density Function Chart</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"kcp_pyramid_by_age.html\">Pyramid Chart By Age</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"kcp_pyramid.html\">Pyramid Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"kcp_pyramid2.html\">Pyramid Charts 2</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"kcp_quintiles.html\">Quintile Pyramid Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"resizablePlot.html\">Resizable Plots</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"rotated-tick-labels.html\">Rotated Labels and Font Styling</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"smoothedLine.html\">Smoothed Lines</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"bar-charts.html\">Vertical and Horizontal Bar Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"waterfall.html\">Waterfall Charts</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"waterfall2.html\">Waterfall Charts 2</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"zoomOptions.html\">Zoom Options</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"zoomProxy.html\">Zoom Proxy - Control one plot from another</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"zoom1.html\">Zooming</a></div>\n");
      out.write("           <div class=\"example-link\"><a class=\"example-link\" href=\"dateAxisLogAxisZooming.html\">Zooming with Date and Log Axes</a></div>\n");
      out.write("\n");
      out.write("         </div>\n");
      out.write("               </div>\n");
      out.write("    </div>\n");
      out.write("    <script type=\"text/javascript\" src=\"example.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
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
