package AppletDemo;

import java.applet.Applet;
import java.awt.Graphics;

public class HelloApplet extends Applet {

    public void init() {
        resize(600,400);
    }
    public void paint(Graphics g) {
        g.drawString("Hello World", 10, 150);
    }
}

/*
<applet code="HelloApplet.class" width="300" height="300">  
        <param name="msg" value="Welcome to applet">  
</applet>

*/
