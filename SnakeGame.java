import javax.swing.JFrame;

public class SnakeGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.setTitle("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
