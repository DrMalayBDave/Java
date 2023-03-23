package SwingandEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuExample extends JFrame implements ActionListener {

    MenuExample() {
        setTitle("Menu System");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenu submenu = new JMenu("Print");
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Exit");
        JMenuItem i4 = new JMenuItem("All Pages");
        JMenuItem i5 = new JMenuItem("Selected Pages");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        i3.addActionListener(this);
        setJMenuBar(mb);
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
// Setting text to field
                System.exit(0);
            }

    public static void main(String[] arg) {
        new MenuExample();
    }

}
