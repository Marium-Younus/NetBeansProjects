
package collection_java;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList_C1 {
    ArrayList std = new ArrayList();
 
    public void AddItem()
    {
        std.add("Ali");
        std.add("Faizan");
        std.add("Hamza");
        std.add("Owais");
        for (Object item : std) {
            System.out.println("Student name is :"+item);
        }
        System.out.println("--------------------------------------------\n");
        for(int i =0; i<std.size();i++)
        {
            System.out.println("Student is :---->"+std);
        }
    }
    
    
}
