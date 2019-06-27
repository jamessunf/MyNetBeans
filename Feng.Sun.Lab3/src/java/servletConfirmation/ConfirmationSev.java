/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletConfirmation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author feng
 */
public class ConfirmationSev extends HttpServlet {
    
      

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
        
        if (request.getParameterValues("course") == null){
            
            String title = "Student's courses verification:";
                out.println(ServletUtilities.headWithTitle(title) +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H4>" + title + "</H4>\n" +
                 "<p>Note: Please selected at least 1 course, Please select again.</p>" +
               "<a href='courseselection.html'>Back to Selection</a>" +
                      
                "</BODY></HTML>");
        }else{
            
            int records = request.getParameterValues("course").length;
            
                       if(records > 3){

                             String title = "Student's courses verification:";
                               out.println(ServletUtilities.headWithTitle(title) +
                               "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                               "<H4>" + title + "</H4>\n" +
                                "<p>Note: Student are permitted to select a maximum of 3 courses, Please select again.</p>" +
                              "<a href='courseselection.html'>Back to Selection</a>" +

                               "</BODY></HTML>");
                               
                       }else{
                              
                                String[] courses = request.getParameterValues("course");
                               StudentInfo st = (StudentInfo) request.getSession().getAttribute("st");
                               String title = "Student's Information:";

                               out.println(ServletUtilities.headWithTitle(title) +
                               "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                               "<H2>" + title + "</H2>\n" +
                               "<table class=\"center\">" +
                               "<tr><td>First Name:" + st.getFirstName() + "</td></tr>" +
                               "<tr><td>Last Name:" + st.getLastName() + "</td></tr>" +
                               "<tr><td>Student Number:" + st.getStudentNumber() + "</td></tr>" +
                               "<tr><td>student Birth Date:" + st.getBirthDate() + "</td></tr>" +
                               "<tr><td><b> Your courses:</b></td></tr>");

                               for(String cst: courses){                
                                   out.println("<tr><td>"  + cst + "</td></tr>");
                               }                             
                               out.println("</BODY></HTML>");

                       }
            
            
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
    
    


}
