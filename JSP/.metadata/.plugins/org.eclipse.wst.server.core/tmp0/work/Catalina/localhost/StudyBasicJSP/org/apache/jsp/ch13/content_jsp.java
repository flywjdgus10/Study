/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2017-02-09 12:51:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch13;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ch13.board.BoardDBBean;
import ch13.board.BoardDataBean;
import java.text.SimpleDateFormat;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("ch13.board.BoardDBBean");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("ch13.board.BoardDataBean");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

   String bodyback_c="#FFF0B5";
   String value_c="#FFE271";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t");

		int num = Integer.parseInt(request.getParameter("num"));
		String pageNum = request.getParameter("pageNum");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		try{
			BoardDBBean dbPro = BoardDBBean.getInstance();
			BoardDataBean article = dbPro.getArticle(num);
			int ref = article.getRef();
			int re_step = article.getRe_step();
			int re_level = article.getRe_level();
			
			
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-info\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Top div -->\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t<h3 align=\"center\">\n");
      out.write("\t\t\t\t\t\t\tShow content\n");
      out.write("\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Main body -->\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<table class=\"table\">\n");
      out.write("\t\t\t\t\t\t\t\t<tr height=\"30\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"25\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"comment\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tarticle number\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"25\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(article.getNum() );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"25\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"comment\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tarticle view\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"25\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(article.getReadcount() );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr height=\"30\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"25\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"comment\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\twriter\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"25\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(article.getWriter() );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"25\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"comment\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcreate date\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"25\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(sdf.format(article.getReg_date()) );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr height=\"30\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"25\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"comment\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttitle\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"75\" colspan=\"3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(article.getSubject() );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr height=\"30\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"25\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"comment\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcontent\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"left\" width=\"75\" colspan=\"3\">\t\t\t\t\t\t\t\t\t\t\n");
      out.write("  \t\t\t\t\t\t\t\t\t\t<textarea class=\"form-control\" readonly=\"readonly\">");
      out.print(article.getContent() );
      out.write("</textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<!-- buttons to go other pages -->\n");
      out.write("\t\t\t\t\t\t\t\t<tr height=\"30\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"4\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"updateForm.jsp?\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tnum=");
      out.print(article.getNum() );
      out.write("&pageNum=");
      out.print(pageNum);
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-default btn-xs\" role=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tedit\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"deleteForm.jsp?\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tnum=");
      out.print(article.getNum() );
      out.write("&pageNum=");
      out.print(pageNum);
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-default btn-xs\" role=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdelete\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"writeForm.jsp?\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tnum=");
      out.print(article.getNum() );
      out.write("&ref=");
      out.print(ref);
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&re_step=");
      out.print(re_step);
      out.write("&re_level=");
      out.print(re_level);
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-default btn-xs\" role=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\treple\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"list.jsp?pageNum=");
      out.print(pageNum);
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-default btn-xs\" role=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tlist\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t");
}catch(Exception e){}
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
