import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class calculatorr {
    public int multiplication(int a, int b) {
        return a * b;
    }
    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    public int addition(int a, int b) {
        return a + b;
    }
    public int subtraction(int a, int b) {
        return a - b;
    }
}
public class calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons = new JButton[10];
    private JButton addButton, subButton, mulButton, divButton, eqButton, clrButton;
    private JPanel panel;
    private int firstOperand, secondOperand;
    private char operator;
    private calculatorr calculator;
    public calculator() {
        calculator = new calculatorr();
        setLayout(new BorderLayout());
        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        add(textField, BorderLayout.NORTH);
        panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            panel.add(numberButtons[i]);
        }
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        clrButton = new JButton("CLEAR");
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(eqButton);
        panel.add(clrButton);
        add(panel, BorderLayout.CENTER);
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        eqButton.addActionListener(this);
        clrButton.addActionListener(this);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }
        if (e.getSource() == clrButton) {
            textField.setText("");
        }
        if (e.getSource() == addButton) {
            firstOperand = Integer.parseInt(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton) {
            firstOperand = Integer.parseInt(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mulButton) {
            firstOperand = Integer.parseInt(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            firstOperand = Integer.parseInt(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == eqButton) {
            secondOperand = Integer.parseInt(textField.getText());
            switch (operator) {
                case '+':
                    textField.setText(String.valueOf(calculator.addition(firstOperand, secondOperand)));
                    break;
                case '-':
                    textField.setText(String.valueOf(calculator.subtraction(firstOperand, secondOperand)));
                    break;
                case '*':
                    textField.setText(String.valueOf(calculator.multiplication(firstOperand, secondOperand)));
                    break;
                case '/':
                    try {
                        textField.setText(String.valueOf(calculator.division(firstOperand, secondOperand)));
                    } catch (ArithmeticException ex) {
                        textField.setText("Error");
                    } break;
            }
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new calculator());
    }
}