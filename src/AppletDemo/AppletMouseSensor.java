package AppletDemo;

import java.applet.Applet;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class AppletMouseSensor extends JFrame implements MouseListener {

    Label l;

    AppletMouseSensor() {
        addMouseListener(this);
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

   public static void main(String[] arg) {
       new AppletMouseSensor();
   }

}
