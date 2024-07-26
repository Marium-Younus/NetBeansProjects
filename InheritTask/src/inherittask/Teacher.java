/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inherittask;

/**
 *
 * @author mariumyounus
 */
public class Teacher extends Person {
    
    String mainSubject;
      int salary;
      String type; // Primary or Secondary School teacher
 
     Teacher(String fName, String lName, String sub, int slry, String sType)
     {
          super(fName,lName);
          mainSubject = sub;
          salary = slry;
          type = sType;         
      }
     public void Display()
     {
            super.Display();

            System.out.println("Main Subject : " + mainSubject);
            System.out.println("Salary : " + salary);
            System.out.println("Type : " + type);
     }
    
    
    
    
    
    
    
}
