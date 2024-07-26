/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multilevelinherit;

/**
 *
 * @author mariumyounus
 */
public class Account {
    String cust_name;
	int acc_no;
	Account(String a, int b)
	{
		cust_name=a;
		acc_no=b;
	}
	void display()
	{
		System.out.println ("Customer Name: "+cust_name);
		System.out.println ("Account No: "+acc_no);
	}
    
}
