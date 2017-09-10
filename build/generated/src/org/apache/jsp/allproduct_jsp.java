package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.sqldb;
import java.sql.ResultSet;

public final class allproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>FashPlus | All Products</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"authentication.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"product.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Images/images (15).jpg\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("     <div class=\"header\">\n");
      out.write("            <div class=\"title\">\n");
      out.write("               <a href=\"Homepage.jsp\">\n");
      out.write("               FashPlus\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subheader\">\n");
      out.write("                <div class=\"authbutton\">  \n");
      out.write("                    ");

                        if (session.getAttribute("username") == null || session.getAttribute("username") == "") {
                              
                        
                       
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("             \n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\" onclick=\"document.getElementById('id01').style.display='block'\">Login</a></li>\n");
      out.write("                    <li><a href=\"#\" onclick=\"document.getElementById('id02').style.display='block';\">Signup</a></li>\n");
      out.write("                </ul>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    ");

                    }
                      
                    else{
                    //program for loggedin user 
                       try{
                        ResultSet res;
                        String name = "SELECT image,name,email FROM userdetail where username= '"+session.getAttribute("username")+"'" ;
                        sqldb.connect();
                        res = sqldb.fetchdata(name);
                        while(res.next()){
                    
      out.write(" \n");
      out.write("                    \n");
      out.write("                    <script>\n");
      out.write("                       // alert('Login successful...');   \n");
      out.write("                    </script>\n");
      out.write("                    \n");
      out.write("                  <ul style=\"color:midnightblue\">\n");
      out.write("                        <li> Welcome ");
      out.print(res.getString("name"));
      out.write("</li>\n");
      out.write("                        <li>    \n");
      out.write("                        <div class=\"dropdown\">\n");
      out.write("                            <img class=\"dropbtn\" src=\"");
      out.print(res.getString("image"));
      out.write("\" width=\"40px\" height=\"40px\">\n");
      out.write("                          <div class=\"dropdown-content\">\n");
      out.write("                              <center><p>");
      out.print(res.getString("email"));
      out.write("</p></center><br>\n");
      out.write("                            <a href=\"#\">Your Cart</a>\n");
      out.write("                            <a href=\"#\">Edit </a>\n");
      out.write("                            <a href=\"logout.jsp\" style=\"float:right;\">Logout</a>\n");
      out.write("\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                        </li>\n");
      out.write("                </ul> \n");
      out.write("                    ");

                        }
                        sqldb.connclose();
                        }catch(Exception e){
                                    
                         }
                    }
                    
      out.write("\n");
      out.write("                \n");
      out.write("            </div>  \n");
      out.write("            <div class=\"navigation\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"allproductservlet?trend=0\">Home</a></li>\n");
      out.write("                    <li><a href=\"allproductservlet?trend=1\">Trending</a></li>\n");
      out.write("                    <li><div class=\"dropdownnav\">\n");
      out.write("                            <a class=\"dropbtnnav\">Designer</a>\n");
      out.write("                          <div class=\"dropdownnav-content\">\n");
      out.write("                            <a href=\"allproductservlet?pdesigner=K. Manoj&trend=0\">K. Manoj</a>\n");
      out.write("                            <a href=\"allproductservlet?pdesigner=KR Arora&trend=0\">KR Arora</a>\n");
      out.write("                            <a href=\"allproductservlet?pdesigner=MM Patel&trend=0\">MM Patel</a>\n");
      out.write("                            <a href=\"allproductservlet?pdesigner=Miss Mala&trend=0\">Miss Mala</a>\n");
      out.write("                            <a href=\"allproductservlet?pdesigner=VR Design&trend=0\">VR Design</a>\n");
      out.write("\n");
      out.write("                          </div>\n");
      out.write("                        </div></li>\n");
      out.write("                    <li><a href=\"#\">Contact us</a></li>\n");
      out.write("                    <li><a href=\"#\">About us</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      </div>    \n");
      out.write("    \n");
      out.write("                   \n");
      out.write("     <div class=\"allproductmain\">\n");
      out.write("      \n");
      out.write("         \n");
      out.write("        ");

            if((session.getAttribute("pdesigner")=="" || session.getAttribute("pdesigner")==null) && (session.getAttribute("trend")=="0")){
        
      out.write("\n");
      out.write("        <div class=\"trendingheading\"><i class=\"fa fa-yelp\"></i> All Products...</div>  \n");
      out.write("          \n");
      out.write("          <div class=\"trendingmaterial\">\n");
      out.write("        ");

                try{
                                int i = 0;
                                ResultSet res;
                                String id = "SELECT * FROM product" ;
                                
                                sqldb.connect();
                                res = sqldb.fetchdata(id);
                                while(res.next()){
                               // session.setAttribute("relatedproductdesigner", res.getString("p_designer"));
                               
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"allproductcard\">\n");
      out.write("        <a class=\"\" href=\"productservlet?p_id=");
      out.print(res.getString("p_id"));
      out.write("\">\n");
      out.write("                     <div class=\"allproductimage\"><img src=\"");
      out.print(res.getString("p_img"));
      out.write("\" alt=\"");
      out.print(res.getString("p_name"));
      out.write("\"></div>\n");
      out.write("                     <div class=\"trendproductname\">");
      out.print(res.getString("p_name"));
      out.write("</div>\n");
      out.write("                     <div class=\"trendproductdesigner\">");
      out.print(res.getString("p_designer"));
      out.write("</div>\n");
      out.write("                     <div class=\"trendproductprice\">");
      out.print(res.getString("p_price"));
      out.write("/-</div>\n");
      out.write("                     <div class=\"trendproductrate\">");
      out.print(res.getString("p_rate"));
      out.write(" <i class=\"fa fa-star\" style=\"color:green\"></i></div>\n");
      out.write("        </a>\n");
      out.write("        </div>     \n");
      out.write("        \n");
      out.write("          \n");
      out.write("           \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 
            }
            sqldb.connclose();
        }
        catch(Exception e){
            
        }
         
      out.write("\n");
      out.write("          </div>\n");
      out.write("         ");

        }else if(session.getAttribute("trend")=="1"){
         
      out.write("\n");
      out.write("         \n");
      out.write("          <div class=\"trendingheading\"><i class=\"fa fa-yelp\"></i> All Trending...</div>  \n");
      out.write("          \n");
      out.write("          <div class=\"trendingmaterial\">\n");
      out.write("         ");
   try{
                                int i = 0;
                                ResultSet res;
                                String id = "SELECT * FROM product where trend = "+ 1;
                                
                                sqldb.connect();
                                res = sqldb.fetchdata(id);
                                while(res.next()){
                               // session.setAttribute("relatedproductdesigner", res.getString("p_designer"));
                               
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"allproductcard\">\n");
      out.write("        <a class=\"\" href=\"productservlet?p_id=");
      out.print(res.getString("p_id"));
      out.write("\">\n");
      out.write("                     <div class=\"allproductimage\"><img src=\"");
      out.print(res.getString("p_img"));
      out.write("\" alt=\"");
      out.print(res.getString("p_name"));
      out.write("\"></div>\n");
      out.write("                     <div class=\"trendproductname\">");
      out.print(res.getString("p_name"));
      out.write("</div>\n");
      out.write("                     <div class=\"trendproductdesigner\">");
      out.print(res.getString("p_designer"));
      out.write("</div>\n");
      out.write("                     <div class=\"trendproductprice\">");
      out.print(res.getString("p_price"));
      out.write("/-</div>\n");
      out.write("                     <div class=\"trendproductrate\">");
      out.print(res.getString("p_rate"));
      out.write(" <i class=\"fa fa-star\" style=\"color:green\"></i></div>\n");
      out.write("        </a>\n");
      out.write("        </div>     \n");
      out.write("        \n");
      out.write("          \n");
      out.write("           \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 
            }
            sqldb.connclose();
        }
        catch(Exception e){
            
        }

      out.write("\n");
      out.write("        \n");
      out.write("          </div>\n");
      out.write("         \n");
      out.write("         ");
    
        }else{
            
      out.write("\n");
      out.write("            \n");
      out.write("          <div class=\"trendingheading\"><i class=\"fa fa-yelp\"></i> ");
      out.print(session.getAttribute("pdesigner"));
      out.write("</div>  \n");
      out.write("          <div class=\"trendingmaterial\">  \n");
      out.write("            ");

            
          try{
                                int i = 0;
                                ResultSet res;
                                String id = "SELECT * FROM product where p_designer = '"+ session.getAttribute("pdesigner") +"'";
                                
                                sqldb.connect();
                                res = sqldb.fetchdata(id);
                                while(res.next()){
                               // session.setAttribute("relatedproductdesigner", res.getString("p_designer"));
                               
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"allproductcard\">\n");
      out.write("        <a class=\"\" href=\"productservlet?p_id=");
      out.print(res.getString("p_id"));
      out.write("\">\n");
      out.write("                     <div class=\"allproductimage\"><img src=\"");
      out.print(res.getString("p_img"));
      out.write("\" alt=\"");
      out.print(res.getString("p_name"));
      out.write("\"></div>\n");
      out.write("                     <div class=\"trendproductname\">");
      out.print(res.getString("p_name"));
      out.write("</div>\n");
      out.write("                     <div class=\"trendproductdesigner\">");
      out.print(res.getString("p_designer"));
      out.write("</div>\n");
      out.write("                     <div class=\"trendproductprice\">");
      out.print(res.getString("p_price"));
      out.write("/-</div>\n");
      out.write("                     <div class=\"trendproductrate\">");
      out.print(res.getString("p_rate"));
      out.write(" <i class=\"fa fa-star\" style=\"color:green\"></i></div>\n");
      out.write("        </a>\n");
      out.write("        </div>     \n");
      out.write("        \n");
      out.write("          \n");
      out.write("           \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 
            }
            sqldb.connclose();
        }
        catch(Exception e){
            
        }
         
         
         
        
        }
            
        
      out.write("\n");
      out.write("          </div>\n");
      out.write("     </div>\n");
      out.write("        \n");
      out.write("<!-- Log in -->  \n");
      out.write("<div id=\"id01\" class=\"modal\">\n");
      out.write("  <form class=\"modal-content animate\" action=\"loginservlet?page=2\" method=\"post\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("\t<span onclick=\"document.getElementById('id01').style.display='none'\" \n");
      out.write("class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required autocomplete=\"off\">\n");
      out.write("\n");
      out.write("      <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n");
      out.write("\n");
      out.write("      <input type=\"submit\" name=\"submit\" value=\"Login\" clicked=\"Logging In..\">\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\t\n");
      out.write("    <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
      out.write("      <button type=\"button\" onclick=\"document.getElementById('id01').style.display='none';document.getElementById('id02').style.display='block';\"  class=\"signupbtn\">Signup</button>\n");
      out.write("      <span class=\"psw\">Forgot <a href=\"#\" onclick=\"document.getElementById('id03').style.display='block';document.getElementById('id01').style.display='none';\">password?</a></span>\n");
      out.write("    </div>  \n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("<!-- Form -->\n");
      out.write("<div id=\"id02\" class=\"modal\">\n");
      out.write("  \n");
      out.write("  <!-- Modal Content -->\n");
      out.write("  <form class=\"modal-content animate\" action=\"signupservlet\" method=\"post\" >\n");
      out.write("  <div class=\"container\">\n");
      out.write("\t<span onclick=\"document.getElementById('id02').style.display='none'\" \n");
      out.write("class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Name\" name=\"name\" pattern=\"[a-zA-Z]*\">\n");
      out.write("\t\n");
      out.write("      <input type=\"email\" placeholder=\"Enter E-mail\" name=\"email\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$\">\n");
      out.write("      \n");
      out.write("      \n");
      out.write("\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" pattern=\"\">\n");
      out.write("\n");
      out.write("      <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" pattern=\"\">\n");
      out.write("      \n");
      out.write("      <select name=\"ques\" required>\n");
      out.write("          <option value=\"Which is your favorite book?\">Which is your favorite book?</option>\n");
      out.write("          <option value=\"Which is your favourite subject\">Which is your favourite subject</option>\n");
      out.write("          <option value=\"Enter unique password..\">Enter unique password..</option>\n");
      out.write("      </select>\n");
      out.write("      \n");
      out.write("      <input type=\"text\" placeholder=\"Enter answer\" name=\"answer\" pattern=\"\">\n");
      out.write("\t  \n");
      out.write("   \n");
      out.write("       <input type=\"submit\" name=\"submit\" value=\"Signup\">\n");
      out.write("\t  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
      out.write("        <button type=\"button\" onclick=\"document.getElementById('id01').style.display='none';document.getElementById('id02').style.display='none';\"  class=\"signupbtn\">Cancle</button>\n");
      out.write("      <span class=\"psw\">Already connected? <a href=\"#\" onclick=\"document.getElementById('id02').style.display='none';document.getElementById('id01').style.display='block';\" >LogIn</a></span>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Forgot Password -->\n");
      out.write("<div id=\"id03\" class=\"modal\">\n");
      out.write("  <form class=\"modal-content animate\" action=\"forgotservlet\" method=\"post\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("\t<span onclick=\"document.getElementById('id03').style.display='none'\" \n");
      out.write("class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n");
      out.write("\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\t\n");
      out.write("    <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
      out.write("      <button type=\"button\" onclick=\"document.getElementById('id03').style.display='none'\"  class=\"signupbtn\">Cancle</button>\n");
      out.write("      \n");
      out.write("    </div>  \n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
