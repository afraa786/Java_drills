import javax.swing.*;
public class SwingDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name:", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your name is:" +name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null,"Your age is:"+age, "Input Dialog", JOptionPane.INFORMATION_MESSAGE);
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
        JOptionPane.showMessageDialog(null,"Your height is: "+height);
    }
}