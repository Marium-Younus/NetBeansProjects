/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatask;
import java.util.Scanner;

/**
 *
 * @author mariumyounus
 */
public class Task1 {
    Scanner s1=new Scanner(System.in);
    public void info()
    {
        
        for(int a=1;a<=10;a++)
        {
            System.out.println("Enter The Name");
            String str=s1.nextLine();
//            System.out.println("Enter the contact number");
//            
           int b =s1.nextInt();
            System.out.println("Student1 name is "+str+" "+b);
        } 
   }
    
}
