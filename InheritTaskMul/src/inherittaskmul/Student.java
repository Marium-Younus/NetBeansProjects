/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inherittaskmul;

/**
 *
 * @author mariumyounus
 */
public class Student {
      int sno;
        protected String sname="samra";
        public void setstud(int no,String name)
        {
                sno = no;
                sname = name;
        }
        public void putstud()
        {
                System.out.println("Student No : " + sno);
                System.out.println("Student Name : " + sname);
        }
}
