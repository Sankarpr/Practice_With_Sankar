package patterns;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageToAnimation {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image to Animation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.add(new AnimationPanel());
            frame.setVisible(true);
        });
    }
}

class AnimationPanel extends JPanel implements ActionListener {
    private Image image;
    private Timer timer;
    private int x, y; // Position of the image
    private int dx = 2, dy = 2; // Movement direction

    public AnimationPanel() {
        // Load the image
        image = new ImageIcon("/Users/vn57hyx/Desktop/Practice_With_Sankar/ani.jpg").getImage();

        // Initialize timer for animation (60 FPS)
        timer = new Timer(16, this);
        timer.start();

        // Initial position
        x = 50;
        y = 50;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Clear the screen
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Draw the image at the current position
        g2d.drawImage(image, x, y, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the position of the image
        x += dx;
        y += dy;

        // Bounce off walls
        if (x < 0 || x + image.getWidth(this) > getWidth()) {
            dx = -dx;
        }
        if (y < 0 || y + image.getHeight(this) > getHeight()) {
            dy = -dy;
        }

        // Repaint the panel
        repaint();
    }
}
