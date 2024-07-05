import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAnimation extends JPanel implements ActionListener {
    private int x, y; // Coordinates of the moving object
    private int deltaX = 1; // Change in x-coordinate per frame
    private int deltaY = 1; // Change in y-coordinate per frame
    private Timer timer; // Timer to control animation

    public SimpleAnimation() {
        x = 0;
        y = 0;

        timer = new Timer(10, this); // 10 milliseconds delay between each frame
        timer.start(); // Start the timer to begin animation
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawAnimation(g);
    }

    private void drawAnimation(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 50, 50); // Draw a blue circle at (x, y) with diameter 50
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update coordinates
        x += deltaX;
        y += deltaY;

        // Bounce back when hitting the edges of the panel
        if (x <= 0 || x >= getWidth() - 50) {
            deltaX = -deltaX;
        }
        if (y <= 0 || y >= getHeight() - 50) {
            deltaY = -deltaY;
        }

        repaint(); // Request repaint to update the animation
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Inheritance Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new SimpleAnimation());
        frame.setVisible(true);
    }
}
