import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class details extends JFrame {
    JTextField textName, textFather, textEmail, textPhone, textCourse, textDept, text10th, text12th;
    JLabel empText;
    Random ran = new Random();
    long empID = Math.abs((ran.nextLong() % 9000L) + 1000);
    
    details() {
        setTitle("Teacher Details Form");
        setSize(900, 800);
        setLocation(350, 50);
        setLayout(null);
        getContentPane().setBackground(new Color(166, 165, 252));
        
        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(250, 30, 500, 50);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Name");
        name.setBounds(50, 100, 100, 30);
        name.setFont(new Font("Serif", Font.BOLD, 20));
        add(name);
        
        textName = new JTextField();
        textName.setBounds(200, 100, 200, 30);
        add(textName);

        JLabel fatherName = new JLabel("Father's Name");
        fatherName.setBounds(50, 150, 150, 30);
        fatherName.setFont(new Font("Serif", Font.BOLD, 20));
        add(fatherName);
        
        textFather = new JTextField();
        textFather.setBounds(200, 150, 200, 30);
        add(textFather);
        
        JLabel email = new JLabel("Email");
        email.setBounds(50, 200, 100, 30);
        email.setFont(new Font("Serif", Font.BOLD, 20));
        add(email);
        
        textEmail = new JTextField();
        textEmail.setBounds(200, 200, 200, 30);
        add(textEmail);

        JLabel phone = new JLabel("Phone Number");
        phone.setBounds(50, 250, 150, 30);
        phone.setFont(new Font("Serif", Font.BOLD, 20));
        add(phone);
        
        textPhone = new JTextField();
        textPhone.setBounds(200, 250, 200, 30);
        add(textPhone);
        
        JLabel course = new JLabel("Course");
        course.setBounds(50, 300, 100, 30);
        course.setFont(new Font("Serif", Font.BOLD, 20));
        add(course);
        
        textCourse = new JTextField();
        textCourse.setBounds(200, 300, 200, 30);
        add(textCourse);
        
        JLabel dept = new JLabel("Department");
        dept.setBounds(50, 350, 150, 30);
        dept.setFont(new Font("Serif", Font.BOLD, 20));
        add(dept);
        
        textDept = new JTextField();
        textDept.setBounds(200, 350, 200, 30);
        add(textDept);

        JLabel tenth = new JLabel("10th Percentage");
        tenth.setBounds(50, 400, 200, 30);
        tenth.setFont(new Font("Serif", Font.BOLD, 20));
        add(tenth);
        
        text10th = new JTextField();
        text10th.setBounds(200, 400, 200, 30);
        add(text10th);

        JLabel twelfth = new JLabel("12th Percentage");
        twelfth.setBounds(50, 450, 200, 30);
        twelfth.setFont(new Font("Serif", Font.BOLD, 20));
        add(twelfth);
        
        text12th = new JTextField();
        text12th.setBounds(200, 450, 200, 30);
        add(text12th);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(50, 500, 200, 30);
        dob.setFont(new Font("Serif", Font.BOLD, 20));
        add(dob);

        JDatePicker datePicker = new JDatePicker();
        datePicker.setBounds(200, 500, 200, 30);
        add(datePicker);
        
        JLabel empIDLabel = new JLabel("Employee ID");
        empIDLabel.setBounds(50, 550, 150, 30);
        empIDLabel.setFont(new Font("Serif", Font.BOLD, 20));
        add(empIDLabel);
        
        empText = new JLabel("" + empID);
        empText.setBounds(200, 550, 200, 30);
        empText.setFont(new Font("Serif", Font.BOLD, 20));
        add(empText);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(200, 600, 100, 40);
        submitButton.setFont(new Font("Serif", Font.BOLD, 18));
        submitButton.setBackground(Color.GREEN);
        submitButton.setForeground(Color.WHITE);
        add(submitButton);
        
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(350, 600, 100, 40);
        cancelButton.setFont(new Font("Serif", Font.BOLD, 18));
        cancelButton.setBackground(Color.RED);
        cancelButton.setForeground(Color.WHITE);
        add(cancelButton);
        
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Details Submitted Successfully!");
                dispose(); // Close the form
            }
        });
        
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new details();
    }
}
