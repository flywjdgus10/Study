/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2017-02-04 16:11:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch13;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class writeForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/ch13/color.jspf", Long.valueOf(1441860912000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charser=UTF-8;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

   String bodyback_c="#FFF0B5";
   String value_c="#FFE271";

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\">\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<script src=\"script.js\"></script>\n");
      out.write("\t\t<title>Board</title>\t\t\n");
      out.write("\t</head>\n");
      out.write("\t<body bgcolor=\"");
      out.print(bodyback_c);
      out.write("\">\n");
      out.write("\t\t");

		int num=0,ref=1,re_step=0,re_level=0;
		String strV="";
		try{
			if(request.getParameter("num") != null){
				num = Integer.parseInt(request.getParameter("num"));
				ref = Integer.parseInt(request.getParameter("ref"));
				re_step = Integer.parseInt(request.getParameter("re_step"));
				re_level = Integer.parseInt(request.getParameter("re_level"));
			}
			
			
      out.write("\n");
      out.write("\t\t\t<p>Write</p>\n");
      out.write("\t\t\t<form method=\"post\" action=\"writePro.jsp\" name=\"writeForm\" onsubmit=\"return writeSave()\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"num\" value=\"");
      out.print(num );
      out.write("\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"ref\" value=\"");
      out.print(ref );
      out.write("\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"re_step\" value=\"");
      out.print(re_step );
      out.write("\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"re_level\" value=\"");
      out.print(re_level );
      out.write("\">\n");
      out.write("\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td align=\"right\" colspan=\"2\" bgcolor=\"");
      out.print(value_c);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"list.jsp\">contents list</a>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t\tname\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td width=\"330\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" size=\"10\" maxlength=\"10\" name=\"writer\" style=\"ime-mode:active;\">\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t\tsubject\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td width=\"330\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t");

							if(request.getParameter("num") != null) strV="";
							else strV="[answer]";
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" size=\"40\" maxlength=\"50\" name=\"subject\" \n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(strV);
      out.write("\" style=\"ime-mode:active;\">\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t\tEmail\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td width=\"330\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" size=\"40\" maxlength=\"30\" name=\"email\" \n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(strV);
      out.write("\" style=\"ime-mode:inactive;\">\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t\tcontent\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td width=\"330\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t<textarea rows=\"13\" cols=\"40\" name=\"content\" \n");
      out.write("\t\t\t\t\t\t\t          style=\"ime-mode:active;\"></textarea>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t\tpasswd\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td width=\"330\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" size=\"8\" maxlength=\"12\" name=\"passwd\" \n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"ime-mode:inactive;\">\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td colspan=2 bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"write\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"reset\" value=\"reset\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"show list\" onclick=\"window.location='list.jsp'\">\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");

		}catch(Exception e){}
		
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}