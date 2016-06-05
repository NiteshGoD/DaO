/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obsnoob.Programs;
   import java.util.List;
/**
 *
 * @author $$obs$$
 */

 
   

public interface employeeDAO {
   public List<Automation> getAllEmployee();
    public Automation getEmployee(String fName, String lName, String eMail, String Salary, String phoneNo) ; 
   
   
     
   
  
   public void updateEmployee(Automation student);
   public void deleteStudent(Automation student);
}
   
  

