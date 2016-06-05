/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obsnoob.Programs;

    import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author $$obs$$
 */



public class EmployeeDaoImp implements employeeDAO {
	
   //list is working as a database
List<Automation> employeelist;
    public EmployeeDaoImp(){

  List<Automation> students;

   
     

    employeelist = new ArrayList<Automation>();
      Automation employee1 = new Automation("Robert",0);
      Student student2 = new Student("John",1);
      students.add(student1);
      students.add(student2);		
   }
   @Override
   public void deleteStudent(Student student) {
      students.remove(student.getRollNo());
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
   }

   //retrive list of students from the database
   @Override
   public List<Student> getAllStudents() {
      return students;
   }

   @Override
   public Student getStudent(int rollNo) {
      return students.get(rollNo);
   }

   @Override
   public void updateStudent(Student student) {
      students.get(student.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
   }
////before applying abstract merthods