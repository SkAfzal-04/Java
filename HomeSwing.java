import javax.swing.*;
import java.awt.*;

public class HomeSwing extends JFrame {

    public HomeSwing() {
        setTitle("Swing Home Drawing");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add custom JPanel to draw the house
        add(new HomePanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new HomeSwing();
    }
}

class HomePanel extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the superclass's paint method

        // Draw the house body (rectangle)
        g.drawRect(50, 100, 200, 150);  // x, y, width, height

        // Draw the roof (triangle)
        g.drawLine(50, 100, 150, 50);   // Left side of the roof
        g.drawLine(150, 50, 250, 100);  // Right side of the roof

        // Draw the door (rectangle)
        g.drawRect(120, 180, 50, 70);   // x, y, width, height

        // Draw the window (square)
        g.drawRect(180, 130, 40, 40);   // x, y, width, height

        // Draw window panes (two lines)
        g.drawLine(180, 150, 220, 150); // Horizontal line
        g.drawLine(200, 130, 200, 170); // Vertical line
    }
}
