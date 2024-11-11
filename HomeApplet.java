import java.applet.Applet;
import java.awt.Graphics;

public class HomeApplet extends Applet {

    @Override
    public void paint(Graphics g) {
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


// How to run?
// 1.Save your applet code in a file named HomeApplet.java.
// 2.Create an HTML File: Applets need an HTML file to run. Create an HTML file (HomeApplet.html) to load the applet.
// 3.
// <html>
// <body>
//   <applet code="HomeApplet.class" width="300" height="300">
//   </applet>
// </body>
// </html>
// 4. javac HomeApplet.java
// 5. appletviewer HomeApplet.html