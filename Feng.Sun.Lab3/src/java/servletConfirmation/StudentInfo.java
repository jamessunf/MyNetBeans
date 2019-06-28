/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Lab3
 * Project Purpose: Registration Application using Servlets.
 * 
 * File Name: StudentInfo.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jun/27/2019
 */
package servletConfirmation;

/**
 * class to transfer student data between different layer
 * @author feng
 * @version 1.0.0
 * 
 */
public class StudentInfo {
    
    private String firstName;
    private String lastName;
    private String studentNumber;
    private String birthDate;
   
     /**
     * 
     * the default constructor of StudentInfo
     */
    public StudentInfo(){}
     /**
     * 
     * the constructor of StudentInfo
     * @param fn String accepts first name from clients
     * @param ln String accepts last name from clients
     * @param sn String accepts student number from clients
     * @param bd String accepts student birth date from clients
     * 
     */
    public StudentInfo(String fn, String ln, String sn,String bd){
        this.firstName = fn;
        this.lastName = ln;
        this.studentNumber = sn;
        this.birthDate = bd;
    }
    /**
     * the setter of student first name
     * @param firstName String value for setting the student first name
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * the setter of student last name
     * 
     * @param lastName String value for setting the student last name
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * the setter of student number
     * @param studentNumber String value for setting the student number
     */

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    /**
     * the setter of student birth date
     * @param birthDate String value for setting the date of birth of student
     */

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
     /**
     * the getter of student first name
     * @return String of the student first name
     */
    public String getFirstName() {
        return firstName;
    }
    
     /**
     * the getter of student last name
     * @return String of the student last name
     */

    public String getLastName() {
        return lastName;
    }
    
     /**
     * the getter of student number
     * @return String of the student number
     */

    public String getStudentNumber() {
        return studentNumber;
    }
    
     /**
     * the getter of student birth date
     * @return String of the birth date of student
     */

    public String getBirthDate() {
        return birthDate;
    }
    
    
    
}
