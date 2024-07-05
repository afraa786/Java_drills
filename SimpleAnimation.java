import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleAnimation extends JPanel implements ActionListener {
    private int x, y; 
    private int deltaX = 1; 
    private int deltaY = 1; 
    private Timer timer; 
    public SimpleAnimation() {
        x = 0;
        y = 0;
        timer = new Timer(10, this); 
        timer.start(); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawAnimation(g);
    }
    private void drawAnimation(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 50, 50); 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        x += deltaX;
        y += deltaY;
        if (x <= 0 || x >= getWidth() - 50) {
            deltaX = -deltaX;
        }
        if (y <= 0 || y >= getHeight() - 50) {
            deltaY = -deltaY;
        }
        repaint(); 
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Inheritance Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new SimpleAnimation());
        frame.setVisible(true);
    }
}
