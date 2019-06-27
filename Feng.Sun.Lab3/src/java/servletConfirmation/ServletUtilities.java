/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletConfirmation;

/**
 *
 * @author feng
 */
public class ServletUtilities {
    
    public static final String DOCTYPE = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " + "Transitional//EN\">\n"; 
    
    public static String headWithTitle(String title){
        
         return (DOCTYPE + "\n" +
                    "<HTML>\n" + 
                    "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n");
    
    }
    
}
