import javax.swing.*;
import java.awt.*;

public class AnimatedGifPanel {
    private static JLabel label;

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Animated GIF Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);  // Center on screen
        ImageIcon imgIcon = new ImageIcon("src/sweaty-speedrunner.gif");  // Adjust path to your GIF
        label = new JLabel(imgIcon);

        // Create a panel and set its layout
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Custom background painting
                g.setColor(Color.RED);
                g.fillRect(0, 0, getWidth(), getHeight());  // Fill the entire panel
            }
        };
        panel.setLayout(new BorderLayout());

        // Add the animated GIF label to the center of the panel
        panel.add(label, BorderLayout.CENTER);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
