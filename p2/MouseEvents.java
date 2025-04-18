// PROGRAM 2
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends JPanel implements MouseListener, MouseMotionListener {
    String msg = "";
    int x = 0, y = 0;

    public MouseEvents() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "Mouse clicked at (" + x + ", " + y + ")";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        x = 0;
        y = 10;
        msg = "Mouse entered";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        x = 0;
        y = 10;
        msg = "Mouse exited";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        x = 0;
        y = 10;
        msg = "Mouse down";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        x = 0;
        y = 10;
        msg = "Mouse up";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        msg = "Mouse dragged";
        x = me.getX();
        y = me.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        msg = "Mouse moved";
        x = me.getX();
        y = me.getY();
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(msg, x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Events");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new MouseEvents());
        frame.setVisible(true);
    }
}
