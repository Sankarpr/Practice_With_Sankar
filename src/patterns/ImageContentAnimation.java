package patterns;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageContentAnimation {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image Content Animation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.add(new AnimatedImagePanel());
            frame.setVisible(true);
        });
    }
}

class AnimatedImagePanel extends JPanel implements ActionListener {
    private BufferedImage image;
    private int[][] offsets; // Stores the offset for animation
    private Timer timer;

    public AnimatedImagePanel() {
        try {
            // Load the image
            image = ImageIO.read(new File("/Users/vn57hyx/Desktop/Practice_With_Sankar/image1.jpg"));
            offsets = new int[image.getWidth()][image.getHeight()];
            initializeOffsets();
        } catch (IOException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }

        // Timer for animation (60 FPS)
        timer = new Timer(16, this);
        timer.start();
    }

    private void initializeOffsets() {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                offsets[x][y] = 0;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Clear the screen
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Scale the image to fit the panel
        Image scaledImage = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        BufferedImage scaledBufferedImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D scaledGraphics = scaledBufferedImage.createGraphics();
        scaledGraphics.drawImage(scaledImage, 0, 0, null);
        scaledGraphics.dispose();

        // Draw the animated pixels
        for (int x = 0; x < scaledBufferedImage.getWidth(); x++) {
            for (int y = 0; y < scaledBufferedImage.getHeight(); y++) {
                int pixel = scaledBufferedImage.getRGB(x, y);
                g2d.setColor(new Color(pixel, true));

                // Draw each pixel with its offset
                int offsetX = offsets[x % image.getWidth()][y % image.getHeight()] % getWidth();
                int offsetY = offsets[x % image.getWidth()][y % image.getHeight()] % getHeight();
                g2d.fillRect(x + offsetX, y + offsetY, 1, 1);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update offsets to create motion
        for (int x = 0; x < offsets.length; x++) {
            for (int y = 0; y < offsets[0].length; y++) {
                offsets[x][y] += (int) (Math.random() * 3) - 1; // Random motion
            }
        }
        repaint();
    }
}