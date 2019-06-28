/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Lab3
 * Project Purpose: Registration Application using Servlets.
 * 
 * File Name: RegConfirmed.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jun/27/2019
 */
package servletConfirmation;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.DataFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *a Servlet deal with student register form information
 * @author feng
 * @version 1.0.0
 */
public class RegConfirmed extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
        
      if (request.getParameter("firstName") == null || 
              request.getParameter("lastName") ==null ||
              request.getParameter("studentNumber") == null ||
              request.getParameter("birthYear") == null ||
              request.getParameter("birthMonth") == null ||
              request.getParameter("birthDay") == null
              ){
          
                String title = "Oops, that's a problem";
                out.println(ServletUtilities.headWithTitle(title) +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H4>" + title + "</H4>\n" +
                 "<p>Note: please fill all information</p>" +
               "<a href='registration.html'>Back to Registation Form</a>" +
                      
                "</BODY></HTML>");
      
      
      
      } else{ 
       
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String studentNumber = request.getParameter("studentNumber");
        String birthDateStr = request.getParameter("birthYear") + "-" + request.getParameter("birthMonth") + "-" + request.getParameter("birthDay");
        
        
        
        SimpleDateFormat sdf =new SimpleDateFormat("yyyyMMdd");  
        Date birthDate = null;
        Calendar cal = null;
        Date cmpDate = null;
        try {
            birthDate = sdf.parse(birthDateStr);
            
           
            
        } catch (ParseException ex) {
            Logger.getLogger(RegConfirmed.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
         cal = Calendar.getInstance();
            
            cal.add(Calendar.YEAR, -18);
            cmpDate = cal.getTime();
            
            if (cmpDate.before(birthDate)){
            
                String title = "Oops, that's a problem";
                out.println(ServletUtilities.headWithTitle(title) +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H4>" + title + "</H4>\n" +
                 "<p>Note: The system user at least 18 years old, Please make sure your information is right, and try again.</p>" +
               "<a href='registration.html'>Back to Registation Form</a>" +
                      
                "</BODY></HTML>");
            }else{
            
                StudentInfo st = new StudentInfo(firstName,lastName,studentNumber,birthDateStr);
                request.getSession().setAttribute("st", st);
        
                response.sendRedirect("courseselection.html");
            
            }
      }  
      
        
    }
 /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param req servlet request
     * @param resp servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
    
    


}
