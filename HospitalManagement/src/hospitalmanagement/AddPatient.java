/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalmanagement;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Faisal
 */
public class AddPatient extends javax.swing.JFrame {
    public static int count;

    /**
     * Creates new form AddPatient
     */
    public AddPatient() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btg = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pfn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pln = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prd = new javax.swing.JTextField();
        pg = new javax.swing.JLabel();
        m = new javax.swing.JRadioButton();
        fe = new javax.swing.JRadioButton();
        page = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pbg = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ppa = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pe = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pr = new javax.swing.JComboBox();
        pcn = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        pajtable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("INSERT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PATIENT DETAILS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 24), new java.awt.Color(51, 102, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("FIRST NAME:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("LAST NAME:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("REG DATE");

        pg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pg.setText("GENDER:");

        btg.add(m);
        m.setText("MALE");

        btg.add(fe);
        fe.setText("FEMALE");

        age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        age.setText("AGE:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("BLOOD GROUP:");

        pbg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "B+", "C+" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(age)
                                    .addComponent(jLabel3))
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(pg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pln, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(m)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fe))
                                .addComponent(pbg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(prd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m)
                        .addComponent(fe))
                    .addComponent(pg))
                .addGap(27, 27, 27))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTACT DETAILS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 24), new java.awt.Color(51, 102, 255))); // NOI18N

        ppa.setColumns(20);
        ppa.setRows(5);
        jScrollPane1.setViewportView(ppa);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PRESENT ADDRESS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("EMAIL ADDRESS:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CONTACT");

        pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pe, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HOSPITALS DETAILS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 24), new java.awt.Color(51, 102, 255))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("CONSULTANT NAME:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("ROOM NO:");

        pr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Room_no_01", "Room_no_02", "Room_no_03", "Room_no_04", "Room_no_05", "Room_no_06" }));
        pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pr, 0, 170, Short.MAX_VALUE)
                    .addComponent(pcn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pcn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pajtable.setBackground(new java.awt.Color(51, 102, 255));
        pajtable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pajtable.setForeground(new java.awt.Color(255, 255, 255));
        pajtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FIRST NAME", "LAST NAME", "REGISTRATION", "AGE", "BLOOD GROUP", "GENDER", "PRESENT ADDRESS", "EMAIL ADD", "CONTACT", "DOCTOR NAME", "ROOM NO"
            }
        ));
        jScrollPane2.setViewportView(pajtable);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Stencil Std", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 255));
        jButton4.setText("Log Out");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        String i,f,l,rd,ag,bg,g,pa,e,c,cn,rn;
                i = pid.getText();
                f = pfn.getText();
                l = pln.getText();
                rd = prd.getText();
                ag = page.getText();
                bg = pbg.getSelectedItem().toString();
                if(m.isSelected())
                {
                    g = "Male";
                }
                else{
                    g= "Female";
                }
                pa = ppa.getText();
                e = pe.getText();
                c = pc.getText();
                cn = pcn.getSelectedItem().toString();
                rn = pr.getSelectedItem().toString();
                
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Management;username=faisal;password=kiru");
            String fk = "insert into Patient values('"+i+"','"+f+"','"+l+"','"+rd+"','"+ag+"','"+bg+"','"+g+"','"+pa+"','"+e+"','"+c+"','"+cn+"','"+rn+"')";
            String fk2 = null;
            if(pr.getSelectedIndex()==0)
            {
               fk2 = "insert into Room_no_01 values('"+i+"','"+f+"','"+rd+"','"+cn+"','"+"Not-Avialable"+"')";
            }
            if(pr.getSelectedIndex()==1)
            {
                fk2 = "insert into Room_no_02 values('"+i+"','"+f+"','"+rd+"','"+cn+"','"+"Not-Avialable"+"')";
            }
            if(pr.getSelectedIndex()==2)
            {
//                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
//                ResultSet srs = stmt.executeQuery("SELECT name  FROM r1");
//                while (srs.next()) {
//                String name1 = srs.getString("name");
//                if(name1.equals("res"))
//                {
//                    System.out.println("Already");
//                }
//                }
                fk2 = "insert into Room_no_03 values('"+i+"','"+f+"','"+rd+"','"+cn+"','"+"Not-Avialable"+"')";
                
            }
            if(pr.getSelectedIndex()==3)
            {
                
                fk2 = "insert into Room_no_04 values('"+i+"','"+f+"','"+rd+"','"+cn+"','"+"Not-Avialable"+"')";
                count = 1;
            }
             if(pr.getSelectedIndex()==4)
            {
                fk2 = "insert into Room_no_05 values('"+i+"','"+f+"','"+rd+"','"+cn+"','"+"Not-Avialable"+"')";
            }
              if(pr.getSelectedIndex()==5)
            {
                fk2 = "insert into Room_no_06 values('"+i+"','"+f+"','"+rd+"','"+cn+"','"+"Not-Avialable"+"')";
            }
//            String fk2 = "insert into Doctor2 values('"+pid.getText()+"','"+pfn.getText()+"','"+pln.getText()+"','"+prd.getText()+"','"+pc.getText()+"','"+Dt.getText()+"')";
            Statement st = con.createStatement();
            st.execute(fk);
            st.execute(fk2);
            JOptionPane.showMessageDialog(null,"Insert Successfully");

            DefaultTableModel dtm = (DefaultTableModel) pajtable.getModel();
            dtm.addRow(new Object[]{i,f,l,rd,ag,bg,g,pa,e,c,cn,rn});
            
            

        }
        catch(Exception k){
            System.out.println(k);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcActionPerformed

    private void prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prActionPerformed
        // TODO add your handling code here:
       try{
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Management;username=faisal;password=kiru");
      Statement st = con.createStatement();
      if(pr.getSelectedIndex()==0)
            {
                ResultSet srs=st.executeQuery("Select status from Room_no_01");
      while(srs.next())
      {
      String stat=srs.getString("status");
      if(stat.equals("Not-Avialable"))
      {
      JOptionPane.showMessageDialog(null,"Room Full Please Select Empty Room");
      }
      }
            }
            if(pr.getSelectedIndex()==1)
            {
              ResultSet srs=st.executeQuery("Select status from Room_no_02");
      while(srs.next())
      {
      String stat=srs.getString("status");
      if(stat.equals("Not-Avialable"))
      {
      JOptionPane.showMessageDialog(null,"Room Full Please Select Empty Room");
      }
      }   
            }
            if(pr.getSelectedIndex()==2)
            {
              ResultSet srs=st.executeQuery("Select status from Room_no_03");
      while(srs.next())
      {
      String stat=srs.getString("status");
      if(stat.equals("Not-Avialable"))
      {
      JOptionPane.showMessageDialog(null,"Room Full Please Select Empty Room");
      }
      }   
            }
            if(pr.getSelectedIndex()==3)
            {
              ResultSet srs=st.executeQuery("Select status from Room_no_04");
      while(srs.next())
      {
      String stat=srs.getString("status");
      if(stat.equals("Not-Avialable"))
      {
      JOptionPane.showMessageDialog(null,"Room Full Please Select Empty Room");
      }
      }   
            }
     if(pr.getSelectedIndex()==4)
            {
              ResultSet srs=st.executeQuery("Select status from Room_no_05");
      while(srs.next())
      {
      String stat=srs.getString("status");
      if(stat.equals("Not-Avialable"))
      {
      JOptionPane.showMessageDialog(null,"Room Full Please Select Empty Room");
      }
      }   
            }
     if(pr.getSelectedIndex()==5)
            {
              ResultSet srs=st.executeQuery("Select status from Room_no_06");
      while(srs.next())
      {
      String stat=srs.getString("status");
      if(stat.equals("Not-Avialable"))
      {
      JOptionPane.showMessageDialog(null,"Room Full Please Select Empty Room");
      }
      }   
            }
      //  String str = dsid.getText();
        
//        ps.setString(1, str);
//        
//        ResultSet rs = ps.executeQuery();
//        while(rs.next()){
//                String id , fn , ln, cont , ad , em , sp ;
//                
//                id= rs.getString(1);
//                fn = rs.getString(2);
//                ln = rs.getString(3);
//                cont = rs.getString(4);
//                ad = rs.getString(5);
//                em = rs.getString(6);
//                sp = rs.getString(7);
//                
//                 
//                dui.setText(id);
//                dufn.setText(fn);
//                duln.setText(ln);
//                duc.setText(cont);
//                dua.setText(ad);
//                due.setText(em);
//                dus.setText(sp);
//                
//                DefaultTableModel dtm = (DefaultTableModel) dsjtable.getModel();
//                dtm.addRow(new Object[]{id,fn,ln,cont,ad,em,sp});
        }
//         }
       catch(Exception e)       {
           System.out.println(e);
       }
//       
    }//GEN-LAST:event_prActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        DefaultComboBoxModel dcom = (DefaultComboBoxModel) HospitalManagement.getData();
        pcn.setModel(dcom);
    }//GEN-LAST:event_formWindowActivated

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        this.hide();
        new LoginPage().show();
    }//GEN-LAST:event_jButton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.ButtonGroup btg;
    private javax.swing.JRadioButton fe;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton m;
    private javax.swing.JTextField page;
    private javax.swing.JTable pajtable;
    private javax.swing.JComboBox pbg;
    private javax.swing.JTextField pc;
    private javax.swing.JComboBox pcn;
    private javax.swing.JTextField pe;
    private javax.swing.JTextField pfn;
    private javax.swing.JLabel pg;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pln;
    private javax.swing.JTextArea ppa;
    private javax.swing.JComboBox pr;
    private javax.swing.JTextField prd;
    // End of variables declaration//GEN-END:variables
}
