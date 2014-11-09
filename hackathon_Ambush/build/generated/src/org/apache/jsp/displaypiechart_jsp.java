package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.awt.*;
import java.io.*;
import org.jfree.chart.*;
import org.jfree.chart.entity.*;
import org.jfree.data.general.*;

public final class displaypiechart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

            
            //session.getAttribute("piechart");
            ArrayList piechart=(ArrayList)session.getAttribute("piechart");
    
    
            final DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("housing("+piechart.get(0).toString()+")", new Double(piechart.get(0).toString()));
            data.setValue("Debt("+piechart.get(1).toString()+")", new Double(piechart.get(1).toString()));
            data.setValue("transportation("+piechart.get(2).toString()+")", new Double(piechart.get(2).toString()));
            data.setValue("Food("+piechart.get(3).toString()+")", new Double(piechart.get(3).toString()));
            data.setValue("Saving("+piechart.get(4).toString()+")", new Double(piechart.get(4).toString()));
            String name=piechart.get(5).toString();
            String location=piechart.get(6).toString();
            Float income=Float.parseFloat(piechart.get(7).toString());
            
            //data.setValue("Two", new Double());
            //data.setValue("Three", new Double(27.5));
            //data.setValue("Four", new Double(17.5));
            //data.setValue("Five", new Double(11.0));
            //data.setValue("Six", new Double(19.4));
            JFreeChart chart = ChartFactory.createPieChart("Expense Distribution for the "+name+" having income "+income+" per month", data, true, true, false);
            try {
                final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection()); 
                final File file1 = new File("E:\\java projects\\hackathon1\\web\\piechart.jpg");
                ChartUtilities.saveChartAsPNG(file1, chart, 600, 400, info);
            } catch (Exception e) {
                out.println(e);
            }

      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wraper\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <style type=\"text/css\">\n");
      out.write("        .header{\n");
      out.write("            margin-top: 1 cm;\n");
      out.write("            background-color: mediumspringgreen;\n");
      out.write("\t\theight:70px;\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t.logo\n");
      out.write("\t{\n");
      out.write("\t\tbackground-image:url(images/bug.jpg);\n");
      out.write("\t\theight:62px;\n");
      out.write("\t\twidth:62px;\n");
      out.write("\t\tmargin-top: 4px;\n");
      out.write("\t\tmargin-left: 3px;\n");
      out.write("\t\tfloat:left;\n");
      out.write("\t}\n");
      out.write("\t.companyname{\n");
      out.write("\tmargin-left: 20px;\n");
      out.write("\theight: 62px;\n");
      out.write("\tfloat: left;\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t.login\n");
      out.write("\t{\n");
      out.write("\t\tfloat:right;\n");
      out.write("\t\theight: 62px;\n");
      out.write("\t\tmargin-left:30%;\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t.menu\n");
      out.write("\t{\n");
      out.write("\t\tmargin-top:10px;\n");
      out.write("\t\theight:35px;\n");
      out.write("\t\tbackground-color:#FFFF66;\n");
      out.write("\t}\n");
      out.write("\t\t\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("<div class=\"logo\">\n");
      out.write("</div>\n");
      out.write("<div class=\"companyname\">\n");
      out.write("\n");
      out.write("<h1> Ambush Financial </h1></div> \n");
      out.write(" <div class=\"login\">\n");
      out.write(" \n");
      out.write("<table height=\"61\" width=\"302\" style=\"border-width:0px;\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td height=\"25px\"><center><a href=\"index.jsp\"> Home </a></center></td>\n");
      out.write("<td height=\"25px\"><a href=\"financiallearning.jsp\"> Financial Learning</a></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <image src=\"");
      out.print( request.getContextPath());
      out.write("/piechart.jpg\"></td>\n");
      out.write("        ");
 if(location.equalsIgnoreCase("urban")) {
      out.write("\n");
      out.write("                <td><image src=\"");
      out.print( request.getContextPath());
      out.write("/piecharturban.jpg\"></td>\n");
      out.write("                </tr>\n");
      out.write("        </table>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("            <td><image src=\"");
      out.print( request.getContextPath());
      out.write("/piechartrural.jpg\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        ");
 } 
            Double savingdiff=new Double(piechart.get(4).toString())-(10.00);
            if(savingdiff<0)
            { 
      out.write("\n");
      out.write("            <font style=\"size: 20px;\">You Saving is below average. To find more tips about saving, please visit: <a href=\"gensavingtips.jsp\">Saving Tips</a></font>\n");
      out.write("           ");
} else { 
      out.write("\n");
      out.write("           <font style=\"size: 20px;\">You Saving is above average. To find more tips about saving, please visit: <a href=\"gensavingtips.jsp\">Saving Tips</a></font>\n");
      out.write("       ");
 } 
      out.write("\n");
      out.write("        </div>  \n");
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
