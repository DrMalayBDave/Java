package SwingandEvents;
// Java program to demonstrate the
// event handling within the class
import java.awt.*;
import java.awt.event.*;

class EventHandling1 extends Frame implements ActionListener {
    TextField textField;
    EventHandling1() {
        textField = new TextField();
        textField.setBounds(60, 50, 180, 25);
        Button button = new Button("click Here");
        button.setBounds(100, 120, 80, 30);
        button.addActionListener(this);
        add(textField);
        add(button);
        setSize(600,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        textField.setText("Java Events");
    }
    public static void main(String[] args) {
        new EventHandling1();
    }
}
