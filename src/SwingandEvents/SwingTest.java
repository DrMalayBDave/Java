package SwingandEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingTest extends JFrame implements ActionListener {
    
    JTextField txt1;
    JButton but,but1;
    JLabel lbl1;
    
    SwingTest(){
        txt1 = new JTextField();
        txt1.setBounds(130, 50, 200, 30);
        add(txt1);
        lbl1=new JLabel();
        lbl1.setBounds(130, 100, 200, 30);
        add(lbl1);
        but=new JButton("Click");
        but.setBounds(130, 200, 100, 40);
        add(but);
        but1=new JButton("Close");
        but1.setBounds(250, 200, 100, 40);
        add(but1);
        but.addActionListener(this);
        but1.addActionListener(this);
        setTitle("Swing Application");
        setSize(600, 400);
        setLayout(null); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="Click")
            lbl1.setText(txt1.getText());
        if(e.getActionCommand()=="Close")
            System.exit(0);
    }
    public static void main(String[] arg) {
          new SwingTest();
    }
}
