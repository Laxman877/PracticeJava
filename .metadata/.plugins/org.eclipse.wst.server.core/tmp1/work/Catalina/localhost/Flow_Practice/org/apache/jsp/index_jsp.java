/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-06-29 06:50:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Std_Reg</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function validation()\r\n");
      out.write("{\r\n");
      out.write("	var fname = document.getElementById(\"fname\").value;\r\n");
      out.write("	var lname = document.getElementById(\"lname\").value;\r\n");
      out.write("    var email = document.getElementById(\"email\").value;\r\n");
      out.write("    var mobile = document.getElementById(\"mobile\").value;\r\n");
      out.write("    var gender = document.getElementById(\"gender\").value;\r\n");
      out.write("    var pass = document.getElementById(\"pass\").value;\r\n");
      out.write("	var btn = document.getElementById(\"sbtn\");\r\n");
      out.write("	\r\n");
      out.write("    var fnameE = document.getElementById(\"fnameE\");\r\n");
      out.write("    var lnameE = document.getElementById(\"lnameE\");\r\n");
      out.write("    var emailE = document.getElementById(\"emailE\");\r\n");
      out.write("    var mobileE = document.getElementById(\"mobileE\");\r\n");
      out.write("    var genderE = document.getElementById(\"genderE\");\r\n");
      out.write("    var passE = document.getElementById(\"passE\");\r\n");
      out.write("	\r\n");
      out.write("    \r\n");
      out.write("    var fnameExp = /^[a-zA-Z]+$/;\r\n");
      out.write("    var emailExp = /^[A-Za-z0-9+_.-]+@(.+)$/;\r\n");
      out.write("    var passExp = /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8,20}$/;\r\n");
      out.write("    \r\n");
      out.write("    if(fname==\"\" || fname==null)\r\n");
      out.write("	{\r\n");
      out.write("		fnameE.innerHTML=\"First name Required!!!\"\r\n");
      out.write("		btn.disabled=true;\r\n");
      out.write("	}\r\n");
      out.write("    else if(!fnameExp.test(fname))\r\n");
      out.write("    {\r\n");
      out.write("    	fnameE.innerHTML=\"Only char. allowed\"\r\n");
      out.write("    	btn.disabled=true;\r\n");
      out.write("   	}\r\n");
      out.write("    else\r\n");
      out.write("    {\r\n");
      out.write("    	fnameE.innerHTML=\"\";\r\n");
      out.write("    	\r\n");
      out.write("    }\r\n");
      out.write("    if(lname==\"\" || lname==null)\r\n");
      out.write("	{\r\n");
      out.write("		lnameE.innerHTML=\"Last name Required!!!\"\r\n");
      out.write("		btn.disabled=true;\r\n");
      out.write("	}\r\n");
      out.write("    else if(!fnameExp.test(lname))\r\n");
      out.write("    {\r\n");
      out.write("    	lnameE.innerHTML=\"Only char. allowed\"\r\n");
      out.write("    	btn.disabled=true;\r\n");
      out.write("   	}\r\n");
      out.write("    else\r\n");
      out.write("    {\r\n");
      out.write("    	lnameE.innerHTML=\"\";\r\n");
      out.write("    	\r\n");
      out.write("    }\r\n");
      out.write("    if(email==\"\" || email==null)\r\n");
      out.write("	{\r\n");
      out.write("    	emailE.innerHTML=\"Email Required!!!\"\r\n");
      out.write("    		btn.disabled=true;\r\n");
      out.write("	}\r\n");
      out.write("    else if(!emailExp.test(email))\r\n");
      out.write("    {\r\n");
      out.write("    	emailE.innerHTML=\"Please enter valid email\"\r\n");
      out.write("    		btn.disabled=true;\r\n");
      out.write("    }\r\n");
      out.write("    else\r\n");
      out.write("    {\r\n");
      out.write("    	emailE.innerHTML=\"\";\r\n");
      out.write("    	\r\n");
      out.write("    }\r\n");
      out.write("    if(mobile==\"\" || mobile==null)\r\n");
      out.write("	{\r\n");
      out.write("    	mobileE.innerHTML=\"mobile Required!!!\"\r\n");
      out.write("    	btn.disabled=true;\r\n");
      out.write("	} \r\n");
      out.write("    else\r\n");
      out.write("    {\r\n");
      out.write("    	mobileE.innerHTML=\"\";\r\n");
      out.write("    	\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    if(gender==\"\" || gender==null)\r\n");
      out.write("	{\r\n");
      out.write("    	genderE.innerHTML=\"gender Required!!!\"\r\n");
      out.write("    	btn.disabled=true;\r\n");
      out.write("	}\r\n");
      out.write("    else if(!fnameExp.test(gender))\r\n");
      out.write("    {\r\n");
      out.write("    	genderE.innerHTML=\"Only char. allowed\"\r\n");
      out.write("    	btn.disabled=true;\r\n");
      out.write("   	}\r\n");
      out.write("    else\r\n");
      out.write("    {\r\n");
      out.write("    	genderE.innerHTML=\"\";\r\n");
      out.write("    	btn.disabled=false;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    if(pass==\"\" || pass==null)\r\n");
      out.write("	{\r\n");
      out.write("    	passE.innerHTML=\"Password Required!!!\"\r\n");
      out.write("    		btn.disabled=true;\r\n");
      out.write("	}\r\n");
      out.write("    else\r\n");
      out.write("    {\r\n");
      out.write("    	passE.innerHTML=\"\";\r\n");
      out.write("    	\r\n");
      out.write("    }	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    \r\n");
      out.write("    .err\r\n");
      out.write("    {\r\n");
      out.write("    	color: red;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-4\"></div>\r\n");
      out.write("			<div class=\"col-md-4\">\r\n");
      out.write("\r\n");
      out.write("				<h1 class=\"text-success\">Registration form</h1>\r\n");
      out.write("				<form action=\"reg\">\r\n");
      out.write("					<span class=\"text-success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label>First Name</label> <input type=\"text\" name=\"fname\"\r\n");
      out.write("							class=\"form-control\" id=\"fname\" onblur=\"validation()\"> <span\r\n");
      out.write("							id=\"fnameE\" class=\"text-danger\"></span>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label>Last Name</label> <input type=\"text\" name=\"lname\"\r\n");
      out.write("							class=\"form-control\" id=\"lname\" onblur=\"validation()\"> <span\r\n");
      out.write("							id=\"lnameE\" class=\"text-danger\"></span>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label>Email</label> <input type=\"text\" name=\"email\"\r\n");
      out.write("							class=\"form-control\" id=\"email\" onblur=\"validation()\"> <span\r\n");
      out.write("							id=\"emailE\" class=\"text-danger\"></span>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label>Mobile</label> <input type=\"text\" name=\"mobile\"\r\n");
      out.write("							class=\"form-control\" id=\"mobile\" onblur=\"validation()\"> <span\r\n");
      out.write("							id=\"mobileE\" class=\"text-danger\"></span>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label>Gender</label> <input type=\"text\" name=\"gender\"\r\n");
      out.write("							class=\"form-control\" id=\"gender\" onblur=\"validation()\"> <span\r\n");
      out.write("							id=\"genderE\" class=\"text-danger\"></span>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label>Password</label> <input type=\"text\" name=\"pass\"\r\n");
      out.write("							class=\"form-control\" id=\"pass\" onblur=\"validation()\"> <span\r\n");
      out.write("							id=\"passE\" class=\"text-danger\"></span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<br> <input type=\"submit\" class=\"btn btn-success\" id=\"sbtn\">\r\n");
      out.write("					<input type=\"reset\" class=\"btn btn-info\">\r\n");
      out.write("				</form>\r\n");
      out.write("				<h2>\r\n");
      out.write("					<a href=\"show\">Show Data</a>\r\n");
      out.write("				</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
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