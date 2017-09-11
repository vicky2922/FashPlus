<%-- 
    Document   : myCart
    Created on : Sep 11, 2017, 10:37:02 PM
    Author     : Vicky
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="db.sqldb"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FashPlus | All Products</title>
        
        
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="homepage.css">
        <link rel="stylesheet" type="text/css" href="authentication.css">
        <link rel="stylesheet" type="text/css" href="product.css">
        <link rel="shortcut icon" href="Images/images (15).jpg">
       
    </head>
    <body>
        
        <%  
                    try{
                                ResultSet res;
                                String id = "SELECT * FROM orders where user_id= "+session.getAttribute("user_id") ;
                                
                                sqldb.connect();
                                res = sqldb.fetchdata(id);
                                while(res.next()){
                                
        %>
                <div class="panel panel-primary">
                    <!-- Default panel contents -->
                    <div class="panel-heading">Order_id : <%=res.getString("order_id")%></div>

                    <!-- Table -->
                    <table>
                        <tr>
                            
                            <%
                             try{
                                ResultSet res2;
                                String id2 = "SELECT * FROM product where p_id= "+ res.getString("p_id") ;
                                
                                sqldb.connect();
                                res2 = sqldb.fetchdata(id2);
                                if(res2.next()){
                            %>
                            
                            <td>
                                <img src="<%=res2.getString("p_img")%>" alt="<%=res2.getString("p_name")%>">
                            </td>
                            
                            <td>
                                <div>
                                    <table cellpadding="5px">
                                        <tr>

                                            <td>
                                                <h1 class="productname"><%=res2.getString("p_name")%></h1>
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
                                                        <%=res2.getString("p_designer")%>
                                                    </td>

                                                    </tr>
                                                    <tr>
                                                    <td>
                                                        Available&nbsp;&nbsp;
                                                    </td>
                                                    <td>
                                                        <%=res2.getString("p_stock")%>
                                                    </td>
                                                    </tr>
                                                    <tr>

                                                    <td>
                                                        Price
                                                    </td>
                                                    <td>
                                                        <%=res2.getString("p_price")%>
                                                    </td>
                                                    </tr>
                                                    <tr>
                                                    <td>
                                                        Ratings 
                                                    </td>
                                                    <td>
                                                        <%=res2.getString("p_rate")%> <i class="fa fa-star-o" style="color:gold"></i>
                                                    </td>
                                                    </tr>

                                                </table>



                                           </td>
                                        </tr> 
                                    </table>
                                    <button name="Buy">Buy</button>
                    
                                </div>
                            </td>
                            
                            <%
                            }
                            sqldb.connclose();
                            }catch(Exception e){

                            }
                            %>
                            
                        </tr>
                    </table>
                </div>
        
                <%
                 }
             sqldb.connclose();
             }catch(Exception e){
                 
             }
                %>
        
    </body>
</html>
