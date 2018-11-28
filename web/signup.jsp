<%-- 
    Document   : signup
    Created on : Nov 16, 2018, 3:04:14 PM
    Author     : Denny
--%>


<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <%
           String uname=request.getParameter("uname");
           String pwd=request.getParameter("pwd");
           String email=request.getParameter("email");
           String add=request.getParameter("add");
           String tel=request.getParameter("tel");
           String ques=request.getParameter("sques");
           Connection conn=null;
           PreparedStatement st=null;
           
           ResultSet rs=null;
           
           
           
           try
             {
                String myUrl="jdbc:mysql://localhost/acadview";
		Class.forName("com.mysql.jdbc.Driver");      		
		conn=DriverManager.getConnection(myUrl,"root","");
                String sql="insert into signup values(?,?,?,?,?,?)";
                st=conn.prepareStatement(sql);
                st.setString(1,uname);
                st.setString(2,pwd);
                st.setString(3,email);
                st.setString(4,add);
                st.setString(5,tel);
                st.setString(6,ques);
                st.executeUpdate();
                out.println("<script>window.location.href='index.html';</script>");
            }
            catch(Exception e)
            {                
                out.println(e);   
            }
        %>
   
  </body>
</html>
