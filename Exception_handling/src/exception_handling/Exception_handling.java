/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exception_handling;

/**
 *
 * @author hina
 */
public class Exception_handling {

    /**
     * @param args the command line arguments
     */
//    static void validate(int age)
//    {
//       if(age<18)
//           throw new ArithmeticException("not valid");
//       else
//            System.out.println(" welcome to vote");
//    }
//    
//     static void info(String name)
//    {
//       if(name==null)
//           throw new NullPointerException("not valid string");
//       else
//            System.out.println(" welcome to user");
//    }
    
     
     
    
    
    
    public static void main(String[] args) {
        
//        validate(20);
//        info("taha");
//        info(null);
//        
        throws_class tc=new throws_class();
        tc.p();
        
        
        
        System.out.println("rest of the code");
       
//         1.arithmetic exception
//        int a=50/0;
//        
//        System.out.println("value of a is"+a);
//        System.out.println("hello class");
        
//    2.Null Pointer
//        String b=null;      
//              
//        System.out.println("string is"+b.length());
        
         
    
//      String d="9";
//      int i=Integer.parseInt(d);
//      System.out.println("parse value"+i);
        
    //3. NumberFormatException:   

      
//        String s="abc";
//        int z=Integer.parseInt(s);
//        System.out.println("parse value"+z);
      
    
    // 4.g.ArrayIndexOutOfBoundsException: 10
      try
      {
      int a1[]=new int[5];  
       a1[10]=50; 
    
       System.out.println("array [10] value is"+a1[10]);
        
      }
      
      catch(ArrayIndexOutOfBoundsException e)
      {
         
          System.out.println(e);
          System.out.println("this error is handle");
      }
      
      finally
      {
          System.out.println("clean up the code ");
      }
      
      
        System.out.println("bye class");
              
    }
    
}
