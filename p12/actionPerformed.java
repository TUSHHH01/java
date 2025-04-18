// not working
import java.awt.*;
import java.awt.event.*;

public class Login extends Applet implements ActionListener {
    String msg = "";
    int loginAttempts = 0;
    Label lblUser, lblPass;
    TextField txtUser, txtPass;
    Button btnLogin, btnClear;

    public void init() {
        lblUser = new Label("Username:");
        lblPass = new Label("Password:");
        txtUser = new TextField(15);
        txtPass = new TextField(15);
        btnLogin = new Button("LOGIN");
        btnClear = new Button("CLEAR");

        txtPass.setEchoChar('*');

        add(lblUser);
        add(txtUser);
        add(lblPass);
        add(txtPass);
        add(btnLogin);
        add(btnClear);

        btnLogin.addActionListener(this);
        btnClear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == btnLogin) {
                if (txtUser.getText().equalsIgnoreCase("Admin") && txtPass.getText().equals("secret")) {
                    msg = "Login successful";
                    loginAttempts = 0;
                } else {
                    loginAttempts++;
                    msg = "Wrong login. Attempts left: " + (3 - loginAttempts);
                    if (loginAttempts == 3) {
                        throw new IllegalAccessException("Exceeded login attempts.");
                    }
                }
            } else if (ae.getSource() == btnClear) {
                txtUser.setText("");
                txtPass.setText("");
                msg = "";
            }
            repaint();
        } catch (IllegalAccessException e) {
            msg = "Invalid login attempts. Please try again later.";
            repaint();
            setEnabled(false);
        }
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);
    }
}
