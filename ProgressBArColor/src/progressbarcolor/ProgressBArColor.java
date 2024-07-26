/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package progressbarcolor;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author mariumyounus
 */
public class ProgressBArColor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       UIManager.put("ProgressBar.background", Color.WHITE);
//        UIManager.put("ProgressBar.foreground", Color.BLACK);
//        UIManager.put("ProgressBar.selectionBackground", Color.YELLOW);

//        UIManager.put("ProgressBar.selectionForeground", Color.RED);
        UIManager.put("ProgressBar.shadow", Color.GREEN);
        UIManager.put("ProgressBar.highlight", Color.BLUE);
 
 
        JFrame f = new JFrame("Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JProgressBar pb1 = new JProgressBar();
        pb1.setStringPainted(true);
        pb1.setValue(50);
        JProgressBar pb2 = new JProgressBar();
        pb2.setIndeterminate(true);
        Container cp = f.getContentPane();
        cp.add(pb1, BorderLayout.NORTH);
        cp.add(pb2, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }
    
}
