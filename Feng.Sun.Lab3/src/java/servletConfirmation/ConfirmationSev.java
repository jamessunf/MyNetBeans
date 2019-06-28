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
            
            String title = "Oops, that's a problem";
                out.println(ServletUtilities.headWithTitle(title) +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H4>" + title + "</H4>\n" +
                 "<p>Note: You must select at least 1 course. Please click back link, try again.</p>" +
               "<a href='courseselection.html'>Back >>></a>" +
                      
                "</BODY></HTML>");
        }else{
            
            int records = request.getParameterValues("course").length;
            
                       if(records > 3){

                             String title = "Oops, that's a problem";
                               out.println(ServletUtilities.headWithTitle(title) +
                               "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                               "<H4>" + title + "</H4>\n" +
                                "<p>Note: Student are permitted to select a maximum of 3 courses, Please click back link, try again.</p>" +
                              "<a href='courseselection.html'>Back >>></a>" +

                               "</BODY></HTML>");
                               
                       }else{
                              
                                String[] courses = request.getParameterValues("course");
                               StudentInfo st = (StudentInfo) request.getSession().getAttribute("st");
                               
                               out.println(
                               "<html><head><title>Lab 3 by Feng Sun</title><meta charset=\"utf-8\">" +
                               "<link rel=\"stylesheet\" type=\"text/css\" href=\"css\\style.css\"></head>");

                               
                               out.println("<body><div id=\"wrapper\"><header><h1>Registration Information</h1></header><div id=\"content\">" +
                                "<fieldset><legend>Student's Information</legend>" +
                                "<table border = \"1\" class=\"center\">" +
                               
                               
                               "<tr><td>First Name</td><td>" + st.getFirstName() + "</td></tr>" +
                               "<tr><td>Last Name</td><td>" + st.getLastName() + "</td></tr>" +
                               "<tr><td>Student Number</td><td>" + st.getStudentNumber() + "</td></tr>" +
                               "<tr><td>student Birth Date</td><td>" + st.getBirthDate() + "</td></tr>" +
                               "</table></fieldset>");
                               
                               out.println(
                               
                               "<fieldset><legend>Courses Information</legend><table class=\"center\">"
                                    
                               
                               
                               );
                               
                               int n =1;

                               for(String cst: courses){                
                                   out.println("<tr><td>" + n + "</td><td>"  + cst + "</td></tr>");
                                   n++;
                               }                             
                               out.println("</table></fieldset> </div><footer><p>&copy;2019 CST8288. All rights reserved.</p></footer></div></body></html>");

                       }
            
            
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
    
    


}
