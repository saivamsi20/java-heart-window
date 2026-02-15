import javax.swing.*;
import java.awt.*;

public class HeartWindow extends JPanel {



    public HeartWindow() {
        setBackground(Color.BLACK);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("Consolas", Font.BOLD, 16));
        g.setColor(Color.RED); // Purple color

        int startX = 50;
        int startY = 80;

        for (double y = 1.5; y > -1.5; y -= 0.1) {
            int xPos = startX;

            for (double x = -1.5; x < 1.5; x += 0.05) {
                double a = x * x + y * y - 1;
                double eq = a * a * a - x * x * y * y * y;

                if (eq <= 0) {
                    g.drawString("♥", xPos, startY);
                }

                xPos += 10; // horizontal spacing
            }
            startY += 18; // vertical spacing
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Heart Shape");
        HeartWindow panel = new HeartWindow();

        frame.setSize(900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setVisible(true);
    }
}