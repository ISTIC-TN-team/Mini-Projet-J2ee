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
 **@Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** @Date :2018 - 2019
 **/
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
      {
        if(request.getSession().getAttribute("panier") == null)
        { request.getSession().setAttribute("panier", new Panier());}
        
        Panier p = (Panier)request.getSession().getAttribute("panier");
            
        ArticleDao dao = new ArticleDao();
        int id = Integer.parseInt(request.getParameter("id"));
        Article a = dao.getArticle(id);
        
        if(request.getParameter("op") == null || a == null)
        {
            response.sendRedirect(request.getParameter("sender") + "?id="+id+"&failed");
            return ;
        }
        
        
        if(request.getParameter("op").equals("add"))
        {
            p.addArticle(a);
            request.getSession().setAttribute("panier",p);
            response.sendRedirect(request.getParameter("sender") + "?id="+id+"&succes");
        }
        
        if(request.getParameter("op").equals("sous"))
        {
            p.sousArticle(a);
            request.getSession().setAttribute("panier",p);
            response.sendRedirect(request.getParameter("sender") + "?id="+id+"&succes");
        }
        
        if(request.getParameter("op").equals("rem"))
        {
            p.removeArticle(a);
            request.getSession().setAttribute("panier",p);
            response.sendRedirect(request.getParameter("sender") + "?id="+id+"&succes");
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
