package SwingandEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestSwing extends JFrame implements ActionListener{
    
    JTextField jtf;
    JButton btn,btn2;
    
    TestSwing() {
        setTitle("Swing Application");
        jtf = new JTextField();
        jtf.setBounds(30,50,200,30);
        add(jtf);
        btn=new JButton("Click");
        btn.setBounds(30,100,100,30);
        add(btn);
        btn2=new JButton("Close");
        btn2.setBounds(150, 100, 100, 30);
        add(btn2);
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                setTitle("Button2");
            }
        });
        btn.addActionListener(this);
        setSize(600, 400);
        setLayout(null); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        setTitle(jtf.getText());
    }
    public static void main(String[] arg) {
            new TestSwing();
    }
}
