package SwingandEvents;
// Java program to demonstrate the
// event handling by the anonymous class
import java.awt.*;
import java.awt.event.*;
class EventHandling2 extends Frame {
    TextField textField;
    EventHandling2() {
        textField = new TextField();
        textField.setBounds(60, 50, 180, 25);
        Button button = new Button("click Here");
        button.setBounds(100, 120, 80, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Anonymous");
            }
        });
        add(textField);
        add(button);
        setSize(600,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EventHandling2();
    }
}
