<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>CarPool4You</title>
	
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
<style>
  body
{
	margin:0;
	font-family: sans-serif;
        background-image: url('bc.jpg');
        position: absolute;
        background-attachment: fixed;
        background-size: 2000px;
        background-repeat: no-repeat;

}
    .div2
{
    width: 1200px;
    height: 18px;  
}
.div1{
    background-image: url(n.jpg);
    color:whitesmoke;
    text-align: center;
}
.div2 a
{
    float: left;
    text-decoration: none;
    color:whitesmoke;
    font-size: 18px;
    text-align: center;
    padding:40px 85px;
}
.div2 a:hover{color:red;}
</style>
</head>
<body>
    
    <%
            String email=request.getParameter("username");
           String ques=request.getParameter("pass");
           try
           {
	
               String myUrl="jdbc:mysql://localhost/acadview";
		//step 1:
		Class.forName("com.mysql.jdbc.Driver");
      		//step 2:
		Connection conn=DriverManager.getConnection(myUrl,"root","");
                String query="Select username,password,sques from signup where username= '"+email+"' and sques='"+ques+"'";
                
		//step 3:
		Statement st=conn.createStatement();
		//step 4:
		ResultSet rs =st.executeQuery(query);
		if(rs.next())
                {
                    %>

    <header>
	 <div class="div1">
           <h1>CarPool4You</h1>
       </div>
     <div class="div2">
               <nav>
                <a class="active" href="index.html">Home</a>
		<a href="find.html">Find a Ride</a>
		<a href="index.html#c1">About Us</a>
                <a href="signup.html">Sign Up</a>
		<a href="login.html">Log in</a>

               </nav>
     </div>
</header>
         <br><br><br><br>           
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-110 p-r-110 p-t-62 p-b-33">
				<form class="login100-form validate-form flex-sb flex-w" action="forgot.jsp">
					<span class="login100-form-title p-b-53">
						Forgot Password
					</span>

					
					
					<div class="p-t-31 p-b-9">
						<span class="txt1">
                                                    Password is <%out.println(rs.getString("password")); %>
						</span>
					</div>
					
					
					
					
				</form>
			</div>
		</div>
	</div>
	
<%
	}  
                
                else
                {   
                    %>
                    
	   <header>
	 <div class="div1">
           <h1>CarPool4You</h1>
       </div>
     <div class="div2">
               <nav>
                <a class="active" href="index.html">Home</a>
		<a href="find.html">Find a Ride</a>
		<a href="index.html#c1">About Us</a>
                <a href="signup.html">Sign Up</a>
		<a href="login.html">Log in</a>

               </nav>
     </div>
</header>
	<br><br><br><br>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-110 p-r-110 p-t-62 p-b-33">
				<form class="login100-form validate-form flex-sb flex-w" action="forgot.jsp">
					<span class="login100-form-title p-b-53">
						Forgot Password
					</span>

					
					
					<div class="p-t-31 p-b-9">
						<span class="txt1">
                                                  Answer to Security Question is incorrect!
						</span>
					</div>
					
					
					<div class="w-full text-center p-t-55">
                                            <span class="txt2">
                                                    <a href="forgot.html">try again?</a>
						</span>


					</div>
				</form>
			</div>
		</div>
	</div>
	 <%
                        }
                                                                            

		//step 5
		st.close();
}
		catch(Exception e)
                {
			System.out.println("Got an exception! ");
			System.out.println(e.getMessage());
		}
           

        %> 
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>