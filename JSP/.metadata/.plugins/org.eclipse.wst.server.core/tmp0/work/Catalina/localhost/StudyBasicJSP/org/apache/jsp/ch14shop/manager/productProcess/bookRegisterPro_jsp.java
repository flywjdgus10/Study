/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2017-02-15 17:01:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch14shop.manager.productProcess;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ch14.bookshop.master.ShopBookDBBean;
import java.sql.Timestamp;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.util.*;
import java.io.*;

public final class bookRegisterPro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.oreilly.servlet.multipart.DefaultFileRenamePolicy");
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("ch14.bookshop.master.ShopBookDBBean");
    _jspx_imports_classes.add("com.oreilly.servlet.MultipartRequest");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 request.setCharacterEncoding("utf-8"); 
      out.write('\n');
      out.write('\n');

String realFolder="";
String filename="";
MultipartRequest imageUp=null;

String saveFolder="/imageFile";
String ecnType="utf-8";
int maxSize=2*1024*1024;
ServletContext context = getServletContext();
realFolder=context.getRealPath(saveFolder);

try{
	imageUp = new MultipartRequest(request,realFolder,maxSize,ecnType,new DefaultFileRenamePolicy());
	
	Enumeration<?> files=imageUp.getFileNames();
	while(files.hasMoreElements()){
		String name = (String)files.nextElement();
		filename=imageUp.getFilesystemName(name);
	}
}catch(Exception e){
	e.printStackTrace();
}

      out.write('\n');
      out.write('\n');
      ch14.bookshop.master.ShopBookDataBean book = null;
      book = (ch14.bookshop.master.ShopBookDataBean) _jspx_page_context.getAttribute("book", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (book == null){
        book = new ch14.bookshop.master.ShopBookDataBean();
        _jspx_page_context.setAttribute("book", book, javax.servlet.jsp.PageContext.PAGE_SCOPE);
        out.write('\n');
      }
      out.write('\n');
      out.write('\n');

String book_kind=imageUp.getParameter("book_kind");
String book_title=imageUp.getParameter("book_title");
String book_price=imageUp.getParameter("book_price");
String book_count=imageUp.getParameter("book_count");
String author=imageUp.getParameter("author");
String publishing_com=imageUp.getParameter("publishing_com");
String book_content=imageUp.getParameter("book_content");
String discount_rate=imageUp.getParameter("discount_rate");

String year=imageUp.getParameter("publishing_year");
String month=(imageUp.getParameter("publishing_month").length() == 1)?
			"0"+imageUp.getParameter("publishing_month"):
			imageUp.getParameter("publishing_month");
String day=(imageUp.getParameter("publishing_day").length() == 1)?
			"0"+imageUp.getParameter("publishing_day"):
				imageUp.getParameter("publishing_day");

book.setBook_kind(book_kind);
book.setBook_title(book_title);
book.setBook_price(Integer.parseInt(book_price));
book.setBook_count(Short.parseShort(book_count));
book.setAuthor(author);
book.setPublishing_com(publishing_com);
book.setPublishing_date(year+"-"+month+"-"+day);
book.setBook_image(filename);
book.setBook_content(book_content);
book.setDiscount_rate(Byte.parseByte(discount_rate));
book.setReg_date(new Timestamp(System.currentTimeMillis()));

ShopBookDBBean bookProcess = ShopBookDBBean.getInstance();
bookProcess.insertBook(book);

response.sendRedirect("bookList.jsp?book_kind="+book_kind);
			



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
      out.write("\n");
      out.write("\n");
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
