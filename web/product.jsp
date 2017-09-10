<%-- 
    Document   : product
    Created on : May 26, 2017, 6:56:44 PM
    Author     : Vicky
--%>

<%@page import="db.sqldb"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FashPlus | Product Page</title>
        
        <link rel="stylesheet" type="text/css" href="homepage.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="authentication.css">
        <link rel="stylesheet" type="text/css" href="product.css">
        <link rel="shortcut icon" href="Images/images (15).jpg">
    </head>
    <body>
        <div class="header">
            <div class="title">
               <a href="Homepage.jsp">
               FashPlus
                </a>
            </div>
            <div class="subheader">
                <div class="authbutton">  
                    <%
                        if (session.getAttribute("username") == null || session.getAttribute("username") == "") {
                              
                        
                       
                    %>
                    
                
             
                <ul>
                    <li><a href="#" onclick="document.getElementById('id01').style.display='block'">Login</a></li>
                    <li><a href="#" onclick="document.getElementById('id02').style.display='block';">Signup</a></li>
                </ul>
                    
                    
                    <%
                    }
                      
                    else{
                    //program for loggedin user 
                       try{
                        ResultSet res;
                        String name = "SELECT image,name,email FROM userdetail where username= '"+session.getAttribute("username")+"'" ;
                        sqldb.connect();
                        res = sqldb.fetchdata(name);
                        while(res.next()){
                    %> 
                    
                    <script>
                        //alert('Login successful...');   
                    </script>
                    
                  <ul style="color:midnightblue">
                        <li> Welcome <%=res.getString("name")%></li>
                        <li>    
                        <div class="dropdown">
                            <img class="dropbtn" src="<%=res.getString("image")%>" width="40px" height="40px">
                          <div class="dropdown-content">
                              <center><p><%=res.getString("email")%></p></center><br>
                            <a href="#">Your Cart</a>
                            <a href="#">Edit </a>
                            <a href="logout.jsp" style="float:right;">Logout</a>

                          </div>
                        </div>
                        </li>
                </ul> 
                    <%
                        }
                        sqldb.connclose();
                        }catch(Exception e){
                                    
                         }
                    }
                    %>
                
            </div>  
            <div class="navigation">
                <ul>
                    <li><a href="allproductservlet?trend=0">Home</a></li>
                    <li><a href="allproductservlet?trend=1">Trending</a></li>
                    <li><div class="dropdownnav">
                            <a class="dropbtnnav">Designer</a>
                          <div class="dropdownnav-content">
                            <a href="allproductservlet?pdesigner=K. Manoj&trend=0">K. Manoj</a>
                            <a href="allproductservlet?pdesigner=KR Arora&trend=0">KR Arora</a>
                            <a href="allproductservlet?pdesigner=MM Patel&trend=0">MM Patel</a>
                            <a href="allproductservlet?pdesigner=Miss Mala&trend=0">Miss Mala</a>
                            <a href="allproductservlet?pdesigner=VR Design&trend=0">VR Design</a>

                          </div>
                        </div></li>
                    <li><a href="#">Contact us</a></li>
                    <li><a href="#">About us</a></li>
                </ul>
            </div>
        </div>
      </div> 
      
      <div class="productdetailmain">
          <div class="productdetail">
              
              
            <div class="productimage">
                <%  
                    try{
                                ResultSet res;
                                String id = "SELECT * FROM product where p_id= "+session.getAttribute("p_id") ;
                                
                                sqldb.connect();
                                res = sqldb.fetchdata(id);
                                if(res.next()){
                                session.setAttribute("relatedproductdesigner", res.getString("p_designer"));
                                session.setAttribute("relatedrating", res.getString("p_rate"));
                                
                %>
                <center><img src="<%=res.getString("p_img")%>" alt="<%=res.getString("p_name")%>" ></center>


                
            </div>
                <div class="productdescription">
                    <table cellpadding="5px">
                        <tr>
                        
                            <td>
                                <h1 class="productname"><%=res.getString("p_name")%></h1>
                            </td>
                        
                        </tr>
                        <tr>
                            <td>
                                <table>
                                    <tr>
                                    <td>
                                        Designer
                                    </td>
                                    <td>
                                        <%=res.getString("p_designer")%>
                                    </td>

                                    </tr>
                                    <tr>
                                    <td>
                                        Available&nbsp;&nbsp;
                                    </td>
                                    <td>
                                        <%=res.getString("p_stock")%>
                                    </td>
                                    </tr>
                                    <tr>

                                    <td>
                                        Price
                                    </td>
                                    <td>
                                        <%=res.getString("p_price")%>
                                    </td>
                                    </tr>
                                    <tr>
                                    <td>
                                        Ratings 
                                    </td>
                                    <td>
                                        <%=res.getString("p_rate")%> <i class="fa fa-star-o" style="color:gold"></i>
                                    </td>
                                    </tr>

                                </table>
                        
                        
                        
                           </td>
                        </tr> 
                    </table>
                    <button name="Buy">Buy</button>
                        
                        
                        <%
                        if (session.getAttribute("username") != null && session.getAttribute("username") != "") {
                        %>
                        <a href="addcartservlet?p_id=<%=res.getString("p_id")%>"> <button name="Cart">Add to Cart</button></a>
                        
                        <%}%>
                        
                    
                </div>    
            
                
                <%
                  }
                 sqldb.connclose();
                 }catch(Exception e){

                 }
                %>
            
            
        </div>
        
        </div>
                
     <div class="relatedproductmain">       
        <div class="relatedproductheading">
               <p><i class="fa fa-yelp"></i> Related items...</p>
        </div>        
       <div class="relatedproductmaterial">
           
          
               
         
             <%
             try{
                        int i=0;
                        ResultSet res;
                        String name = "SELECT * FROM product where (p_designer = '"+ session.getAttribute("relatedproductdesigner") +"' or p_rate = " + session.getAttribute("relatedrating")+ ") and  (p_id <> "+ session.getAttribute("p_id") + ")";
                        sqldb.connect();
                       // session.setAttribute("p_id", "");
                        res = sqldb.fetchdata(name);
                        while(res.next()){
                        i++;
             %>
        <div class="allproductcard">
             <a class="" href="productservlet?p_id=<%=res.getString("p_id")%>">
                     <div class="allproductimage"><img src="<%=res.getString("p_img")%>" alt="<%=res.getString("p_name")%>" ></div>
                     <div class="trendproductname"><%=res.getString("p_name")%></div>
                     <div class="trendproductdesigner"><%=res.getString("p_designer")%></div>
                     <div class="trendproductprice"><%=res.getString("p_price")%>/-</div>
                     <div class="trendproductrate"><%=res.getString("p_rate")%> <i class="fa fa-star-o" style="color:gold"></i></div>
            </a>
             
        </div>
               
             
                    
             <%
              }
             sqldb.connclose();
             }catch(Exception e){
                 
             }
             %>
             
             
              
     
     
     
           
    </div>
         </div>     
 
<!-- Log in -->  
<div id="id01" class="modal">
  <form class="modal-content animate" action="loginservlet?page=3" method="post">
  <div class="container">
	<span onclick="document.getElementById('id01').style.display='none'" 
class="close" title="Close Modal">&times;</span>
	</div>
    <div class="container">
        <input type="text" placeholder="Enter Username" name="username" required autocomplete="off">

      <input type="password" placeholder="Enter Password" name="password" required>

      <input type="submit" name="submit" value="Login" clicked="Logging In..">
      
    </div>
	
    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none';document.getElementById('id02').style.display='block';"  class="signupbtn">Signup</button>
      <span class="psw">Forgot <a href="#" onclick="document.getElementById('id03').style.display='block';document.getElementById('id01').style.display='none';">password?</a></span>
    </div>  
  </form>
</div>
<!-- Form -->
<div id="id02" class="modal">
  
  <!-- Modal Content -->
  <form class="modal-content animate" action="signupservlet" method="post" >
  <div class="container">
	<span onclick="document.getElementById('id02').style.display='none'" 
class="close" title="Close Modal">&times;</span>
	</div>
    <div class="container">
      <input type="text" placeholder="Enter Name" name="name" required>
	
      <input type="email" placeholder="Enter E-mail" name="email" required>
      
      

      <input type="text" placeholder="Enter Username" name="uname" required>

      <input type="password" placeholder="Enter Password" name="psw" required>
      
      <select name="ques" required>
          <option value="Which is your favorite book?">Which is your favorite book?</option>
          <option value="Which is your favourite subject">Which is your favourite subject</option>
          <option value="Enter unique password..">Enter unique password..</option>
      </select>
      
      <input type="text" placeholder="Enter answer" name="answer" required>
	  
   
       <input type="submit" name="submit" value="Signup">
	  
    </div>

    <div class="container" style="background-color:#f1f1f1">
        <button type="button" onclick="document.getElementById('id01').style.display='none';document.getElementById('id02').style.display='none';"  class="signupbtn">Cancle</button>
      <span class="psw">Already connected? <a href="#" onclick="document.getElementById('id02').style.display='none';document.getElementById('id01').style.display='block';" >LogIn</a></span>
    </div>
  </form>
</div>

<!-- Forgot Password -->
<div id="id03" class="modal">
  <form class="modal-content animate" action="forgotservlet" method="post">
  <div class="container">
	<span onclick="document.getElementById('id03').style.display='none'" 
class="close" title="Close Modal">&times;</span>
	</div>
    <div class="container">
      <input type="text" placeholder="Enter Username" name="uname" required>

      
    </div>
	
    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id03').style.display='none'"  class="signupbtn">Cancle</button>
      
    </div>  
  </form>
</div>
    
    </body>
</html>
