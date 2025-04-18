// use japplet foe working of program
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Applet implements ActionListener {
    int firstNumber = 0;
    int secondNumber = 0;
    int result = 0;
    String operator = "";
    TextField textField;
    Button[] buttons;

    public void init() {
        setLayout(new BorderLayout());
        textField = new TextField("0", 10);
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4));
        buttons = new Button[16];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new Button(String.valueOf(i));
        }
        buttons[10] = new Button("+");
        buttons[11] = new Button("-");
        buttons[12] = new Button("*");
        buttons[13] = new Button("/");
        buttons[14] = new Button("=");
        buttons[15] = new Button("C");

        for (int i = 0; i < 16; i++) {
            buttons[i].setFont(new Font("Arial", Font.BOLD, 25));
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            textField.setText("0");
            firstNumber = 0;
            secondNumber = 0;
            result = 0;
            operator = "";
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            operator = command;
            firstNumber = Integer.parseInt(textField.getText());
            textField.setText("0");
        } else if (command.equals("=")) {
            secondNumber = Integer.parseInt(textField.getText());
            if (operator.equals("+")) {
                result = firstNumber + secondNumber;
            } else if (operator.equals("-")) {
                result = firstNumber - secondNumber;
            } else if (operator.equals("*")) {
                result = firstNumber * secondNumber;
            } else if (operator.equals("/")) {
                result = firstNumber / secondNumber;
            }
            textField.setText(String.valueOf(result));
        } else {
            if (textField.getText().equals("0")) {
                textField.setText(command);
            } else {
                textField.setText(textField.getText() + command);
            }
        }
    }
}
