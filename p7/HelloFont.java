import java.awt.*;
import java.awt.event.*;

public class HelloFont extends Frame {

    Label lblMsg;

    HelloFont() {
        lblMsg = new Label("Hello Java");
        Font font = new Font("Georgia", Font.PLAIN, 32);
        lblMsg.setFont(font);
        lblMsg.setAlignment(Label.CENTER);
        lblMsg.setBackground(Color.blue);
        lblMsg.setForeground(Color.red);

        add(lblMsg);

        setVisible(true);
        setSize(500, 500);

        addWindowListener(new MyWindowAdapter());
    }

    public static void main(String args[]) {
        new HelloFont();
    }

    class MyWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
