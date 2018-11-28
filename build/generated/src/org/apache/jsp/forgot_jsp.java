package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>CarPool4You</title>\n");
      out.write("\t\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<style>\n");
      out.write("  body\n");
      out.write("{\n");
      out.write("\tmargin:0;\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("        background-image: url('bc.jpg');\n");
      out.write("        position: absolute;\n");
      out.write("        background-attachment: fixed;\n");
      out.write("        background-size: 2000px;\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("\n");
      out.write("}\n");
      out.write("    .div2\n");
      out.write("{\n");
      out.write("    width: 1200px;\n");
      out.write("    height: 18px;  \n");
      out.write("}\n");
      out.write(".div1{\n");
      out.write("    background-image: url(n.jpg);\n");
      out.write("    color:whitesmoke;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".div2 a\n");
      out.write("{\n");
      out.write("    float: left;\n");
      out.write("    text-decoration: none;\n");
      out.write("    color:whitesmoke;\n");
      out.write("    font-size: 18px;\n");
      out.write("    text-align: center;\n");
      out.write("    padding:40px 85px;\n");
      out.write("}\n");
      out.write(".div2 a:hover{color:red;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

            String email=request.getParameter("username");
           String ques=request.getParameter("pass");
           try
           {
	
               String myUrl="jdbc:mysql://localhost/acadview";
		//step 1:
		Class.forName("com.mysql.jdbc.Driver");
      		//step 2:
		Connection conn=DriverManager.getConnection(myUrl,"root","");
                String query="Select username,ques from signup where username= '"+email+"' and ques='"+ques+"'";
                
		//step 3:
		Statement st=conn.createStatement();
		//step 4:
		ResultSet rs =st.executeQuery(query);
		if(rs.next())
                {
                    
      out.write("\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("\t <div class=\"div1\">\n");
      out.write("           <h1>CarPool4You</h1>\n");
      out.write("       </div>\n");
      out.write("     \n");
      out.write("</header>\n");
      out.write("\t<br><br><br><br>\n");
      out.write("\t<div class=\"limiter\">\n");
      out.write("\t\t<div class=\"container-login100\">\n");
      out.write("\t\t\t<div class=\"wrap-login100 p-l-110 p-r-110 p-t-62 p-b-33\">\n");
      out.write("\t\t\t\t<form class=\"login100-form validate-form flex-sb flex-w\" action=\"forgot.jsp\">\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title p-b-53\">\n");
      out.write("\t\t\t\t\t\tForgot Password\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"p-t-31 p-b-9\">\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1\">\n");
      out.write("                                                    Password is ");
out.println(rs.getString("password")); 
      out.write("\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Username is required\">\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"username\" >\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"w-full text-center p-t-55\">\n");
      out.write("\t\t\t\t\t\t<span class=\"txt2\">\n");
      out.write("                                                    <a href=\"index.html\">HOME</a>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");

	}  
                
                else
                {   
                    
      out.write("\n");
      out.write("                    \n");
      out.write("\t    <header>\n");
      out.write("\t <div class=\"div1\">\n");
      out.write("           <h1>CarPool4You</h1>\n");
      out.write("       </div>\n");
      out.write("     \n");
      out.write("</header>\n");
      out.write("\t<br><br><br><br>\n");
      out.write("\t<div class=\"limiter\">\n");
      out.write("\t\t<div class=\"container-login100\">\n");
      out.write("\t\t\t<div class=\"wrap-login100 p-l-110 p-r-110 p-t-62 p-b-33\">\n");
      out.write("\t\t\t\t<form class=\"login100-form validate-form flex-sb flex-w\" action=\"forgot.jsp\">\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title p-b-53\">\n");
      out.write("\t\t\t\t\t\tForgot Password\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"p-t-31 p-b-9\">\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1\">\n");
      out.write("                                                  Answer to Security Question is incorrect!\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Username is required\">\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"username\" >\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"w-full text-center p-t-55\">\n");
      out.write("\t\t\t\t\t\t<span class=\"txt2\">\n");
      out.write("                                                    <a href=\"index.html\">HOME</a>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("                                            <span class=\"txt2\">\n");
      out.write("                                                    <a href=\"forgot.html\">try again?</a>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t ");

                        }
                                                                            

		//step 5
		st.close();
}
		catch(Exception e)
                {
			System.out.println("Got an exception! ");
			System.out.println(e.getMessage());
		}
           

        
      out.write(" \n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
