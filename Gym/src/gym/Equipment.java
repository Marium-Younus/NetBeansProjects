/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

/**
 *
 * @author Madina
 */
public class Equipment extends javax.swing.JFrame {

    /**
     * Creates new form Equipment
     */
    public Equipment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        eqback = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        msoption = new javax.swing.JMenuItem();
        addmember = new javax.swing.JMenuItem();
        viewmember = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        addplan = new javax.swing.JMenuItem();
        viewplan = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        addinstructor = new javax.swing.JMenuItem();
        viewinstructor = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        addequipment = new javax.swing.JMenuItem();
        viewequipment = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        transaction = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        contents = new javax.swing.JMenuItem();
        aboutus = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 625));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setText("    Equipment :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 0, 290, 60);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Instruments");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 110, 170, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Name Of Instrument");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 170, 160, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Company");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 230, 160, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Total Quantity");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 290, 160, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Price Per Quantity");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 350, 150, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Total Price");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 410, 160, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Date");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 470, 160, 30);

        img.setIcon(new javax.swing.ImageIcon("D:\\Pictures\\Dp\\IMAGE (216).jpg")); // NOI18N
        img.setText("Img");
        getContentPane().add(img);
        img.setBounds(490, 110, 230, 280);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 170, 170, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 230, 170, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(300, 290, 170, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(300, 350, 170, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(300, 410, 170, 30);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(300, 110, 170, 30);

        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(300, 470, 170, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 520, 100, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Update");
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 520, 100, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Delete");
        getContentPane().add(jButton3);
        jButton3.setBounds(370, 520, 100, 30);
        getContentPane().add(eqback);
        eqback.setBounds(0, 0, 730, 580);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(466, 28));

        jMenu1.setText("Home");

        jMenuItem1.setText("Quit/Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Membership");

        msoption.setText("Membership Options");
        msoption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msoptionActionPerformed(evt);
            }
        });
        jMenu5.add(msoption);

        addmember.setText("Add Member");
        addmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmemberActionPerformed(evt);
            }
        });
        jMenu5.add(addmember);

        viewmember.setText("View All");
        viewmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewmemberActionPerformed(evt);
            }
        });
        jMenu5.add(viewmember);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Plan/Course");

        addplan.setText("Add");
        addplan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addplanActionPerformed(evt);
            }
        });
        jMenu6.add(addplan);

        viewplan.setText("View All");
        viewplan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewplanActionPerformed(evt);
            }
        });
        jMenu6.add(viewplan);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Instructor");

        addinstructor.setText("Add");
        addinstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addinstructorActionPerformed(evt);
            }
        });
        jMenu7.add(addinstructor);

        viewinstructor.setText("View All");
        viewinstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewinstructorActionPerformed(evt);
            }
        });
        jMenu7.add(viewinstructor);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Equipment");

        addequipment.setText("Add");
        addequipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addequipmentActionPerformed(evt);
            }
        });
        jMenu8.add(addequipment);

        viewequipment.setText("View All");
        viewequipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewequipmentActionPerformed(evt);
            }
        });
        jMenu8.add(viewequipment);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Transaction");

        transaction.setText("Membership Fees");
        transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionActionPerformed(evt);
            }
        });
        jMenu9.add(transaction);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("History");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu10);

        jMenu11.setText("Help");

        contents.setText("Contents");
        contents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsActionPerformed(evt);
            }
        });
        jMenu11.add(contents);

        aboutus.setText("About us");
        aboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutusActionPerformed(evt);
            }
        });
        jMenu11.add(aboutus);

        jMenuBar1.add(jMenu11);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.hide();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void msoptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msoptionActionPerformed
        msoption msdetail=new msoption();
        msdetail.show();
        this.hide();
    }//GEN-LAST:event_msoptionActionPerformed

    private void addmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmemberActionPerformed
        Membership addmem=new Membership();
        addmem.show();
        this.hide();
    }//GEN-LAST:event_addmemberActionPerformed

    private void viewmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewmemberActionPerformed
        Memberview mview=new Memberview();
        mview.show();
        this.hide();
    }//GEN-LAST:event_viewmemberActionPerformed

    private void addplanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addplanActionPerformed
        plancourse addpplan=new plancourse();
        addpplan.show();
        this.hide();
    }//GEN-LAST:event_addplanActionPerformed

    private void viewplanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewplanActionPerformed
        Planview pview=new Planview();
        pview.show();
        this.hide();
    }//GEN-LAST:event_viewplanActionPerformed

    private void addinstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addinstructorActionPerformed
        Instructor addins=new Instructor();
        addins.show();
        this.hide();

    }//GEN-LAST:event_addinstructorActionPerformed

    private void viewinstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewinstructorActionPerformed
        Instructorview viewins=new Instructorview();
        viewins.show();
        this.hide();
    }//GEN-LAST:event_viewinstructorActionPerformed

    private void addequipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addequipmentActionPerformed
        Equipment addequi=new Equipment();
        addequi.show();
        this.hide();
    }//GEN-LAST:event_addequipmentActionPerformed

    private void viewequipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewequipmentActionPerformed
        Equipmentview viewequip=new Equipmentview();
        viewequip.show();
        this.hide();
    }//GEN-LAST:event_viewequipmentActionPerformed

    private void transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionActionPerformed
        Transaction trans=new Transaction();
        trans.show();
        this.hide();
    }//GEN-LAST:event_transactionActionPerformed

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        History hist=new History();
        hist.show();
        this.hide();
    }//GEN-LAST:event_jMenu10MouseClicked

    private void contentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsActionPerformed
        Contents cont=new Contents();
        cont.show();
        this.hide();
    }//GEN-LAST:event_contentsActionPerformed

    private void aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusActionPerformed
        About about=new About();
        about.show();
        this.hide();
    }//GEN-LAST:event_aboutusActionPerformed

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
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutus;
    private javax.swing.JMenuItem addequipment;
    private javax.swing.JMenuItem addinstructor;
    private javax.swing.JMenuItem addmember;
    private javax.swing.JMenuItem addplan;
    private javax.swing.JMenuItem contents;
    private javax.swing.JLabel eqback;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JMenuItem msoption;
    private javax.swing.JMenuItem transaction;
    private javax.swing.JMenuItem viewequipment;
    private javax.swing.JMenuItem viewinstructor;
    private javax.swing.JMenuItem viewmember;
    private javax.swing.JMenuItem viewplan;
    // End of variables declaration//GEN-END:variables
}
