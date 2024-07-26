/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author mariumyounus
 */
public class Student {
    
    String name;
    int age;
    Boolean fullTimeCource = true;
    
    public  void Display()
    {
        System.out.println("Name:"+name);
        
    }
    public  Boolean ISFullTimeCource()
    {
    return  fullTimeCource;
    
    }
            
}
