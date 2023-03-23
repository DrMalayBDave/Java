package AppletDemo;

import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifeCycle extends Applet {
    StringBuffer strBuffer;
    public void init() {
        resize(600,400);
        strBuffer = new StringBuffer();
        addItem("initializing the apple ");
    }

    public void start() {
        addItem("starting the applet ");
    }

    public void stop() {
        addItem("stopping the applet ");
    }

    public void destroy() {
        addItem("unloading the applet");
    }

    void addItem(String word) {
        System.out.println(word);
        strBuffer.append(word);
        repaint();
    }

    public void paint(Graphics g) {
// Draw a Rectangle around the applet's display area.
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
// display the string inside the rectangle.
        g.drawString(strBuffer.toString(), 10, 20);
    }
}
