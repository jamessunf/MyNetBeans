/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Lab3
 * Project Purpose: Registration Application using Servlets.
 * 
 * File Name: ServletUtilities.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jun/27/2019
 */
package servletConfirmation;

/**
 *the Utilities class to per-write HTML context
 * @author feng
 */
public class ServletUtilities {
    /**
     * a head of HTML
     */
    public static final String DOCTYPE = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " + "Transitional//EN\">\n"; 
    /**
     * the title and head of the HTML context
     * @param title String value accepts form clients for the title of the Html context
     * @return String that the html context
     */
    public static String headWithTitle(String title){
        
         return (DOCTYPE + "\n" +
                    "<HTML>\n" + 
                    "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n");
    
    }
    
  
    
}
