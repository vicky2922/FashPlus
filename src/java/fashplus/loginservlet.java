/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashplus;

import db.sqldb;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vicky
 */
public class loginservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            try{
                ResultSet res;
                HttpSession session = request.getSession();
              //  HttpSession session = request.getSession();
                String page = (String) request.getParameter("page");
                
                String query="SELECT * FROM userdetail where username='"+ 
                    request.getParameter("username")+ "' and password='" +
                    request.getParameter("password") + "'";
                sqldb.connect();
                res= sqldb.fetchdata(query);
                if (res.next()) {
                    sqldb.connclose();
                    session.setAttribute("username", request.getParameter("username"));
                    session.setAttribute("user_id", request.getParameter("user_id"));
                    
                    if(page.equals("1")){
                       response.sendRedirect("Homepage.jsp"); 
                    }
                    else if(page.equals("2")){
                        response.sendRedirect("allproduct.jsp");
                    }
                    else if(page.equals("3")){
                        response.sendRedirect("product.jsp");
                    }
                    
                    
                } 
                else {
                    sqldb.connclose();
                 response.sendRedirect("Homepage.jsp");
                }           
            
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
