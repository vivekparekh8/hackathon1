/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
//import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vivek Parekh
 */
public class credithistory extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static int randInt(int min, int max)
    {
        Random rand = new Random();
         return (rand.nextInt(max - min + 1) + min);
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session= request.getSession();
        int min = 300, max = 850, figo = 0;
        String category ="";
        float home, car;
        figo = randInt(min, max);
        PrintWriter out = response.getWriter();
        if(figo >= 750)
        {
            category = "Excellent"; 
            home = 10;
            car = 7;
        }
        else if(figo <750 && figo >= 700 )
        {
             category = "Good"; 
             home = 12;
             car = 9;
        }
        else if( figo < 700 && figo >= 650 )
        {
            category = "Fair"; 
            car = 11;
            home = 14;
        }
        else if( figo < 650 && figo >= 600)
        {
            category = "Poor"; 
            home = 16;
            car = 13;
        }
        else
        {
            category = "Bad"; 
            home = 18;
            car = 15;
        }
        try {
            /* TODO output your page here. You may use following sample code. */
            ArrayList list = new ArrayList();
            list.add(category);
            list.add(home);
            list.add(car);
            list.add(figo);
            session.setAttribute("credithist",list);
            response.sendRedirect("advise.jsp");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
