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
public class StudentInfo {
    
    private String firstName;
    private String lastName;
    private String studentNumber;
    private String birthDate;
    
    public StudentInfo(){}
    
    public StudentInfo(String fn, String ln, String sn,String bd){
        this.firstName = fn;
        this.lastName = ln;
        this.studentNumber = sn;
        this.birthDate = bd;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }
    
    
    
}
