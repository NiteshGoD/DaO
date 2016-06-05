/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obsnoob.Programs;

/**
 *
 * @author $$obs$$
 */
public class Automation {
  
    
    
  
    private String fName,lName , eMail, Salary , phoneNo ;

    public Automation(String fName, String lName, String eMail, String Salary, String phoneNo) {
        this.fName = fName;
        this.lName = lName;
        this.eMail = eMail;
        this.Salary = Salary;
        this.phoneNo = phoneNo;
    }

    

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
}


  



