import java.applet.Applet;
import java.awt.Graphics;

public class HelloJavaApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello Java", 50, 100);
    }
}

