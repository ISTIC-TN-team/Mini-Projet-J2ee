
package servlet;

import beans.Client;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import database.ClientDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import panier.Panier;
/**
 **@Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** @Date :2018 - 2019
 **/
public class RegistrationServlet extends HttpServlet {

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
        String login =(String)request.getParameter("email");
        String password =(String)request.getParameter("password");
        String name =(String)request.getParameter("name");
        String lastname =(String)request.getParameter("lastname");
   
         
       
       ClientDao s = new ClientDao();
       Client cl = new Client(login,password,name,lastname,null);
       boolean test= s.addClient(cl);
       String er = "your already registered or an error " ;

       if(test==false){
     response.sendRedirect("signup.jsp?msg="+er);
     }
     else{
     request.getSession().setAttribute("client",cl);
     request.getSession().setAttribute("panier", new Panier());
     response.sendRedirect("index.jsp");
     }
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
