import java.awt.*;
import java.applet.*;

//<applet code="Temple" width="500" height="500"></applet>
public class Temple extends Applet {

    boolean flag;

    public void init() {
        flag = false;
    }

    public void paint(Graphics g) {
        // Main temple structure
        g.drawRect(100, 100, 200, 200); // Main temple
        g.drawLine(160, 70, 200, 100); // Right line of dome
        g.drawLine(190, 100, 150, 70); // Left line of dome
        g.drawLine(156, 70, 150, 40); // Straight line of dome


        // Door
        g.setColor(Color.black); // Door color
        g.drawLine(140, 200, 160, 200); // Door base
        g.drawLine(140, 150, 160, 150); // Door top
        g.drawLine(140, 200, 140, 150); // Left side of door
        g.drawLine(160, 200, 160, 150); // Right side of door
    }

    public void stop() {
        flag = true;
    }
}
