import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class JButtonDemo extends JPanel implements ActionListener {

    protected static JButton jbnLeft, jbnMiddle, jbnRight;

    public JButtonDemo() {
	
    	//Create Icons that can be used with the jButtons

        ImageIcon leftButtonIcon = createImageIcon("rightarrow.JPG");
        ImageIcon middleButtonIcon = createImageIcon("java-swing-tutorial.JPG");
        ImageIcon rightButtonIcon = createImageIcon("leftarrow.JPG");

        jbnLeft = new JButton("Disable centre button", leftButtonIcon);
        jbnLeft.setVerticalTextPosition(AbstractButton.CENTER);
        jbnLeft.setHorizontalTextPosition(AbstractButton.LEADING); //left-to-right
        jbnLeft.setMnemonic(KeyEvent.VK_D);
		// Alt-D clicks the button    
	jbnLeft.setActionCommand("disable");
        jbnLeft.setToolTipText("disable the Centre button.");
		//Adding Tooltips
        jbnMiddle = new JButton("Centre button", middleButtonIcon);
        jbnMiddle.setVerticalTextPosition(AbstractButton.BOTTOM);
        jbnMiddle.setHorizontalTextPosition(AbstractButton.CENTER);
        jbnMiddle.setMnemonic(KeyEvent.VK_M);
		// Alt-M clicks the button
        jbnMiddle.setToolTipText("Centre button");
        jbnRight = new JButton("Enable centre button", rightButtonIcon);
        	//Use the default text position of CENTER, TRAILING (RIGHT).
        jbnRight.setMnemonic(KeyEvent.VK_E);
		// Alt-E clicks the button
        jbnRight.setActionCommand("enable");
        jbnRight.setEnabled(false);
		// Disable the Button at creation time
        	//Listen for actions on Left and Roght Buttons
        jbnLeft.addActionListener(this);
        jbnRight.addActionListener(this);
        jbnRight.setToolTipText("Enable the Centre button.");
        //Add Components to the frame, using the default FlowLayout.
        add(jbnLeft);
        add(jbnMiddle);
        add(jbnRight);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("disable".equals(e.getActionCommand())) {
            jbnMiddle.setEnabled(false);
            jbnLeft.setEnabled(false);
            jbnRight.setEnabled(true);
        } else {
            jbnMiddle.setEnabled(true);
            jbnLeft.setEnabled(true);
            jbnRight.setEnabled(false);
        }
    }
	   // Returns an ImageIcon, or null if the path was invalid.
    protected static ImageIcon createImageIcon(String path) {
        URL imgURL = JButtonDemo.class.getResource(path);
	//import java.net.URL;
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find image in system: " + path);
            return null;
        }
    }
	    //Create the GUI and show it.
    	private static void createGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
	        //Have nice window decorations.
	        //Create and set up the frame.
        JFrame frame = new JFrame("jButton usage demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Create and set up the content pane.
       JButtonDemo buttonContentPane = new JButtonDemo();
        buttonContentPane.setOpaque(true);					
	//content panes must be opaque
       frame.getRootPane().setDefaultButton(jbnLeft);    
        frame.setContentPane(buttonContentPane); 
        //Display the window.
	  frame.pack();
        frame.setVisible(true);
   }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI(); 
            }
       });
   }
}
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

