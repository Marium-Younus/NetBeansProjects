/*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


    public class NewJFrame1 {
    	JFrame jtfMainFrame;
    	JButton jbnButton1, jbnButton2;
    	JTextField jtfInput; 
    	JPanel jplPanel;
    	
    	public NewJFrame1() {
        		
        	jtfMainFrame = new JFrame("Which Button Demo"); 
        	jtfMainFrame.setSize(50, 50);
    		jbnButton1 = new JButton("Button 1"); 
    		jbnButton2 = new JButton("Button 2");
    		jtfInput = new JTextField(20);
    		jplPanel = new JPanel();
    		
    		jbnButton1.setMnemonic(KeyEvent.VK_I);	//Set ShortCut Keys

            jbnButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	jtfInput.setText("Button 1!");
                }

            });

        	jbnButton2.setMnemonic(KeyEvent.VK_I);
            jbnButton2.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		jtfInput.setText("Button 2!");
            	}
            });

    		jplPanel.setLayout(new FlowLayout());
    		jplPanel.add(jtfInput);
    		jplPanel.add(jbnButton1); 
    		jplPanel.add(jbnButton2);
        		
        	jtfMainFrame.getContentPane().add(jplPanel, BorderLayout.CENTER);

        	jtfMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        	jtfMainFrame.pack();
        	jtfMainFrame.setVisible(true);
    }


        public static void main(String[] args) {
        	// Set the look and feel to Java Swing Look
            	try {
            		UIManager.setLookAndFeel(
            						UIManager.getCrossPlatformLookAndFeelClassName()); 
            	} catch(Exception e) {}
            	NewJFrame1 application = new NewJFrame1(); 
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

