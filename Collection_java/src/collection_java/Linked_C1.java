

package collection_java;

import java.util.LinkedList;

public class Linked_C1 {
    LinkedList ll = new LinkedList();
    
    public  void  Addlist()
    {
      
        ll.add("January");
        ll.add("Feburary");
        ll.add("March");
         ll.add("May");
        ll.addFirst("MonthsDisplay");
        ll.addLast("December");
        ll.add(4, "April");
        for (Object months : ll) {
            System.out.println("List of the month is :"+months);
        }
    }
    
}
