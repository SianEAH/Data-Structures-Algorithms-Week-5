/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentshashmapp;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author siane
 */
//Store student IDs and a grade
//Display all students using the iterator
//Store students who have failed and need to repeat and store in new HashMap
//Display all the repeating students
//Add 10 marks each to the repeating students using forEach()
//String & Integer
public class StudentsHashMapApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declare and create an instance of HashMap
        HashMap<String, Integer> students = new HashMap<>();
        
        //add some students IDS and their grades to the HashMap
        System.out.println("STUDENTS WHO HAVE PASSED");
        System.out.println("************************");
        students.put("x123456", 89);
        students.put("x7891011", 42);
        students.put("x1213115", 66);
        students.put("x16171819", 73);
        students.put("x2021222324", 92);
        
        //display all the students using the iterator
        Iterator<HashMap.Entry<String, Integer>> iter = students.entrySet().iterator();
        //while loop
        while(iter.hasNext()) {
            HashMap.Entry<String, Integer> temp = iter.next();
            System.out.println("Student ID: " + temp.getKey() + "\nGrade: " + temp.getValue());
        }
        
        //Create a new HashMap to store repeating students who have failed
        //declare and create an instance of HashMap
        HashMap<String, Integer> failedStudents = new HashMap<>();
        
        //add some student IDS and their grades to the HashMap
        System.out.println("\nSTUDENTS WHO HAVE FAILED AND NEED TO REPEAT");
        System.out.println("********************************************");
        failedStudents.put("x25262728", 22);
        failedStudents.put("x29303132", 36);
        failedStudents.put("x33343536", 19);
        failedStudents.put("x37383940", 0);
        failedStudents.put("x40414243", 12);
        
        //display all the repeating students, using iterator
        Iterator<HashMap.Entry<String, Integer>> iter2 = failedStudents.entrySet().iterator();
        //while loop
        while(iter2.hasNext()) {
            HashMap.Entry<String, Integer> tempS = iter2.next();
            System.out.println("Student ID: " + tempS.getKey() + "\nGrade: " + tempS.getValue());
        }
        
         // Add 10 marks to each failed student using forEach
         //use forEach to add 10 marks (the value) 
        //hashmap.forEach( (k, v) -> { do something here }
        failedStudents.replaceAll((k, v) -> v + 10); //lambda style expression

        // Display updated grades
        System.out.println("\nUPDATED GRADES AFTER ADDING 10 MARKS");
        System.out.println("**************************************");

        failedStudents.forEach((k, v) -> {
            System.out.println("Student ID: " + k);
            System.out.println("Updated Grade: " + v);
        });
    }
    
}
