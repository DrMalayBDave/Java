package AppletDemo;

import java.applet.Applet;
import java.awt.Graphics;

public class ThreadinApplets extends Applet implements Runnable {

    private String display;
    private int x, y, flag;
    Thread t;

    public void init()
    {
        display = "Java Applet";
        x = 10;
        y = 20;
        flag = 1;
        t = new Thread(this, "MyThread");
        t.start();
    }
    public void update()
    {
        x = x + 10 * flag;
        if (x > 300)
            flag = -1;
        if (x < 100)
            flag = 1;
    }
    public void run()
    {
        while (true) {
              repaint();
            update();
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
  
    public void paint(Graphics g)
    {
        g.drawString(display, x, y);
    }
}
