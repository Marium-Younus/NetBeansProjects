/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plymorphism;
import java.util.Scanner;

/**
 *
 * @author mariumyounus
 */
public class overloading {
    Scanner s1=new Scanner (System.in);
    
    public void overload()
            
    {
    
        System.out.println("enter any number");
        int a=s1.nextInt();
    int b=s1.nextInt();
    int sum=a+b;
        System.out.println("My sum result is"+sum);
    }
    
    public void overload(int p ,float q)
            
    { 
        System.out.println("enter any number");
        int d=s1.nextInt();
    float c=s1.nextFloat();
    float  sub=d-c;
        System.out.println("My sub result is"+sub);
    }
    void triangleArea(float base, float height) 
         { 
               float area; 
               area = base * height / 2.0f; 
               System.out.println("Area = " + area);
         }
    
    int overload(int a ,int b)
    {
    
    return a+b;
    
    
    }
}
