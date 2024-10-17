import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class login extends JFrame implements ActionListener {
    JTextField textFieldName;
    JPasswordField passwordField;
    JButton login, back;

    login() {
        setTitle("Login Portal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocation(500, 250);
        setLayout(null);
        getContentPane().setBackground(new Color(255, 182, 193));

        JLabel labelName = new JLabel("Username");
        labelName.setBounds(40, 20, 100, 20);
        add(labelName);

        textFieldName = new JTextField();
        textFieldName.setBounds(150, 20, 150, 20);
        add(textFieldName);

        JLabel labelPass = new JLabel("Password");
        labelPass.setBounds(40, 70, 100, 20);
        add(labelPass);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 70, 150, 20);
        add(passwordField);

        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.PINK);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);

        back = new JButton("Back");
        back.setBounds(180, 140, 120, 30);
        back.setBackground(Color.PINK);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        try {
            ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("icon/symbol.jpg"));
            Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel img = new JLabel(i3);
            img.setBounds(350, 20, 200, 200);
            add(img);
        } catch (Exception e) {
            System.out.println("Image not found: " + e.getMessage());
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            System.out.println("Login button is clicked");
        } else if (e.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
