package AppletDemo;

import java.awt.*;
import java.applet.*;

public class DisplayImage extends Applet {

    Image picture;
    MediaTracker tr;

    @Override
    public void init() {
        resize(800,600);
        picture = getImage(this.getDocumentBase(), "img.jpg");
    }

    @Override
    public void paint(Graphics g) {        
        g.drawImage(picture, 10, 10, this);
    }
}