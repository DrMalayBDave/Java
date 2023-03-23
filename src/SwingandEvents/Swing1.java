package SwingandEvents;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
public class Swing1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();//creating instance of JFrame  
        JButton b = new JButton("Click");//creating instance of JButton  
        b.setBounds(130, 100, 100, 40);//x axis, y axis, width, height  
        f.add(b);//adding button in JFrame  
        f.setSize(600, 400);
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
    }
}
