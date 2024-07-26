/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;



/**
 *
 * @author Faisal
 */
public class HospitalManagement {
    public static DefaultComboBoxModel getData()
    {
        DefaultComboBoxModel com = new DefaultComboBoxModel();
        try{
            
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

              Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Management;username=faisal;password=kiru");
              PreparedStatement ps = con.prepareStatement("select * from Doctor");
              
              ResultSet rs = ps.executeQuery();
              while(rs.next())
              {
                  com.addElement(rs.getString("first_name"));
              }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return com;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
               
    }
    
}


    
       