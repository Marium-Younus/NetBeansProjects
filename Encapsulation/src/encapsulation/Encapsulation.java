/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulation;

/**
 *
 * @author mariumyounus
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*  NewClass c1= new NewClass();
       
       taskforencap c2=new taskforencap();
        System.out.println("string value is"+c2.a);
     c2.f();*/
  taskforencap g=new taskforencap();
        g.setName("abc");
    g.setAge(2);
      g.setIdNum("12343ms");

      System.out.println("Name : " + g.getName()+
                             " Age : "+ g.getAge()+"ID Num:"+g.getIdNum());

    }
   
}
