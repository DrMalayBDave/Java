package AppletDemo;

import java.applet.Applet;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Graphics;

public class AppletMouseEvents extends Applet implements MouseListener {

    StringBuffer strBuffer;
    
    public void init() {
        addMouseListener(this);
    }

    void addItem(String word) {
        //System.out.println(word);
        strBuffer.append(word);
        repaint();
    }

    public void paint(Graphics g) {
        // display the string inside the rectangle.
        g.drawString(strBuffer.toString(), 10, 20);
    }

    public void mouseEntered(MouseEvent event) {
        addItem("mouse entered! ");
    }

    public void mouseExited(MouseEvent event) {
        addItem("mouse exit! ");
    }

    public void mousePressed(MouseEvent event) {
    }

    public void mouseReleased(MouseEvent event) {
    }

    public void mouseClicked(MouseEvent event) {
        addItem("mouse clicked! ");
    }
}
