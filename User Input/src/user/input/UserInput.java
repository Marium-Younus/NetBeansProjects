/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user.input;
import java.util.Scanner;

/**
 *
 * @author mariumyounus
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=s1.nextInt();
        System.out.println("enter the Second number");
        int b=s1.nextInt();
        
        int c=a+b;
        System.out.println("The sum result is"+c);
        
     
        System.out.println("enter any string");
    s1.nextLine();
           String str=s1.nextLine();
         
        System.out.println(str);
        
    }
    
}
