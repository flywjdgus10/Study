/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2017-02-16 06:09:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch14shop.manager.productProcess;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Timestamp;
import ch14.bookshop.master.*;

public final class bookUpdateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/ch14shop/manager/productProcess/../../etc/color.jspf", Long.valueOf(1441865104000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("ch14.bookshop.master");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Timestamp");
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
      out.write('\n');
      out.write('\n');
 
  String bodyback_c="#e0ffff";
  String back_c="#8fbc8f";
  String title_c="#5f9ea0";
  String value_c="#b0e0e6";
  String bar="#778899";

      out.write('\n');
      out.write('\n');

String managerId="";
try{
	managerId=(String)session.getAttribute("managerId");
	if(managerId=="" || managerId.equals(""))
		response.sendRedirect("../logon/managerLoginForm.jsp");
	else{
		int book_id=Integer.parseInt(request.getParameter("book_id"));
		String book_kind=request.getParameter("book_kind");
		try{
			ShopBookDBBean bookProcess=ShopBookDBBean.getInstance();
			ShopBookDataBean book = bookProcess.getBook(book_id);
		
      out.write("\n");
      out.write("\t\t\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<link href=\"../../etc/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../../etc/script.js\"></script>\n");
      out.write("\t\t<title>modify book information</title>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<p>modify book information</p>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t\n");
      out.write("\t\t<form method=\"post\" name=\"writeform\" action=\"bookUpdatePro.jsp\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\" colspan=\"2\">\n");
      out.write("\t\t\t\t\t\t<a href=\"../managerMain.jsp\">back to managerMain</a>\n");
      out.write("\t\t\t\t\t\t&nbsp;\n");
      out.write("\t\t\t\t\t\t<a href=\"bookList.jsp?book_kind=");
      out.print(book_kind);
      out.write("\">go to bookList</a>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td width=\"100\">select categorize</td>\n");
      out.write("\t\t\t\t\t<td width=\"400\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t<select name=\"book_kind\">\n");
      out.write("\t\t\t\t\t\t\t<option value=\"100\" ");
if(book.getBook_kind().equals("100")){
      out.write("selected");
}
      out.write(">\n");
      out.write("\t\t\t\t\t\t\t\tliterature</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"200\" ");
if(book.getBook_kind().equals("200")){
      out.write("selected");
}
      out.write(">\n");
      out.write("\t\t\t\t\t\t\t\tforeign language</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"300\" ");
if(book.getBook_kind().equals("300")){
      out.write("selected");
}
      out.write(">\n");
      out.write("\t\t\t\t\t\t\t\tcomputer</option>\t\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td width=\"100\">title</td>\n");
      out.write("\t\t\t\t\t<td width=\"400\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" size=\"50\" maxlength=\"50\" \n");
      out.write("\t\t\t\t\t\t\tname=\"book_title\" value=\"");
      out.print(book.getBook_title());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"book_id\" value=\"");
      out.print(book_id);
      out.write("\">\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td width=\"100\">price</td>\n");
      out.write("\t\t\t\t\t<td width=\"400\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" size=\"10\" maxlength=\"9\" \n");
      out.write("\t\t\t\t\t\t\tname=\"book_price\" value=\"");
      out.print(book.getBook_price());
      out.write("\">won\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td width=\"100\">count</td>\n");
      out.write("\t\t\t\t\t<td width=\"400\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" size=\"10\" maxlength=\"5\"\n");
      out.write("\t\t\t\t\t\t\tname=\"book_count\" value=\"");
      out.print(book.getBook_count());
      out.write("\">books\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td width=\"100\">author</td>\n");
      out.write("\t\t\t\t\t<td width=\"400\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" size=\"10\" maxlength=\"5\"\n");
      out.write("\t\t\t\t\t\t\tname=\"author\" value=\"");
      out.print(book.getAuthor());
      out.write("\">\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td width=\"100\">publishing_com</td>\n");
      out.write("\t\t\t\t\t<td width=\"400\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" size=\"20\" maxlength=\"30\"\n");
      out.write("\t\t\t\t\t\t\tname=\"publishing_com\" value=\"");
      out.print(book.getPublishing_com());
      out.write("\">\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td width=\"100\">publishing_date</td>\n");
      out.write("\t\t\t\t\t<td width=\"400\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t<select name=\"publishing_year\">\n");
      out.write("\t\t\t\t\t\t\t");

							Timestamp nowTime = new Timestamp(System.currentTimeMillis());
							int lastYear=Integer.parseInt(nowTime.toString().substring(0,4));
							for(int i=lastYear;i>=2010;i++){
								
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(i);
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\t");
if(Integer.parseInt(book.getPublishing_date().substring(0,4))==i)
										{
      out.write("selected");
} 
      out.write('>');
      out.print(i );
      out.write("</option>\n");
      out.write("\t\t\t\t\t\t\t\t");

							}
							
      out.write("\n");
      out.write("\t\t\t\t\t\t</select>year\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<select name=\"publishing_month\">\n");
      out.write("\t\t\t\t\t\t\t");

							for(int i=1;i<=12;i++){
								
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(i);
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\t");
if(Integer.parseInt(book.getPublishing_date().substring(5,7))==i)
										{
      out.write("selected");
} 
      out.write('>');
      out.print(i );
      out.write("</option>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t");

							}
							
      out.write("\n");
      out.write("\t\t\t\t\t\t</select>month\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<select name=\"publishing_day\">\n");
      out.write("\t\t\t\t\t\t\t");

							for(int i=1;i<=31;i++){
								
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(i);
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\t");
if(Integer.parseInt(book.getPublishing_date().substring(8))==i)
										{
      out.write("selected");
}
      out.write('>');
      out.print(i );
      out.write("</option>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t");

							}
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</select>day\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td width=\"100\">image</td>\n");
      out.write("\t\t\t\t\t<td width=\"400\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" name=\"book_image\">");
      out.print(book.getBook_image() );
      out.write("\n");
      out.write("\t\t\t\t\t</td>\t\t\t\t\t\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td width=\"100\">content</td>\n");
      out.write("\t\t\t\t\t<td width=\"400\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t<textarea name=\"book_content\" rows=\"13\" cols=\"40\">\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(book.getBook_content() );
      out.write("\n");
      out.write("\t\t\t\t\t\t</textarea>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td width=\"100\">discount_rate</td>\n");
      out.write("\t\t\t\t\t<td width=\"400\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" size=\"5\" maxlength=\"5\" name=\"discount_rate\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(book.getDiscount_rate());
      out.write("\">\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"modify\" \n");
      out.write("\t\t\t\t\t\t\tonclick=\"updateCheckForm(this.form)\">\n");
      out.write("\t\t\t\t\t\t<input type=\"reset\" value=\"reset\">\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</form>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\t\t");
	
		}catch(Exception e){
			e.printStackTrace();
		}
		
      out.write('\n');
      out.write('	');
      out.write('	');

	}
}catch(Exception e){
	e.printStackTrace();
}

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
