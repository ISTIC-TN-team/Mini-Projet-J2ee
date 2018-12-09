/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.Article;
import database.ArticleDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import panier.Panier;

/**
 *
 * @author clickinformatique
 */
public class panier extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
        HttpSession session = request.getSession();
       if (session.getAttribute("client") == null){
           response.sendRedirect("login.jsp");
       }
       else
       {
          if(session.getAttribute("panier") == null)
          {
           Panier p = new Panier();
           String op = request.getParameter("op");
           if(op=="+")
            {
                ArticleDao a = new ArticleDao();
                int  id=Integer.parseInt(request.getParameter("id"));
                Article ar=a.getArticle(id); 
                int qte = Integer.parseInt(request.getParameter("qte"));
                    if(ar.getQte() < qte){
                      System.out.print("alert('la quantite nest pas disponible')");
                     }else{
                        p.addArticle(ar);
                session.setAttribute("panier",p); }
            }
            else if(op==("-"))
            {
              ArticleDao d = new ArticleDao();
              Panier a = (Panier) session.getAttribute("panier");
              int  id=Integer.parseInt(request.getParameter("id"));
              Article ar=d.getArticle(id);
              a.removeArticle(ar);
              session.setAttribute("panier",a);
            }
          }
       }
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
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
