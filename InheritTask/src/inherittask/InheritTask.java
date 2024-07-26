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
public class InheritTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Person pObj = new Person("Rayan","Miller");
               Student sObj = new Student("Jacob","Smith",1,"1 - B","Roma");
               Teacher tObj = new Teacher("Daniel","Martin","English",6000,"Primary Teacher");
               System.out.println("Person :");
               pObj.Display();
               System.out.println("");
               System.out.println("Student :");
               sObj.Display();
               System.out.println("");
               System.out.println("Teacher :");
               tObj.Display();
               
               
    
    
    
    }
    
}
