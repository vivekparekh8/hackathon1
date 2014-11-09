package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<td height=\"25px\"><a href=\"Expenditure.jsp\"> Financial Learning</a></td>\n");
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
