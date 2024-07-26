/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulation;
import java.util.Scanner;

/**
 *
 * @author mariumyounus
 */
public class taskforencap {
    Scanner s1=new Scanner(System.in);
    
/*    String a="Ahmed";
   private void abc()
    { int a=5,b=5;
    int sum=a+b;
        System.out.println("my sum is"+sum);
    
    }
   public void f()
   { abc();
   }*/

   private String name;
   private String idNum;
   private int age;
   public int getAge(){
      return age;   }
   public String getName(){
      return name;   }
   public String getIdNum(){
      return idNum;   }
   
   
public void setAge( int newAge){
    System.out.println("enter your age");
    int age=s1.nextInt();
     newAge=age;
    System.out.println("my age is"+age);}
   public void setName(String newName){
      name = newName;
   }

   public void setIdNum( String newId){
      idNum = newId;
   }
}



