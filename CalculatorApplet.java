import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApplet extends Applet implements ActionListener {
    // Declare components
    TextField num1Field, num2Field, resultField;
    Button addButton, subtractButton, multiplyButton, divideButton;
    Label resultLabel;
    
    // Initialize components
    public void init() {
        setLayout(new FlowLayout());

        // Create input fields and buttons
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        resultField = new TextField(20);
        resultField.setEditable(false);
        
        addButton = new Button("Add");
        subtractButton = new Button("Subtract");
        multiplyButton = new Button("Multiply");
        divideButton = new Button("Divide");
        
        resultLabel = new Label("Result:");

        // Add components to the applet
        add(new Label("Enter first number:"));
        add(num1Field);
        add(new Label("Enter second number:"));
        add(num2Field);
        
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        
        add(resultLabel);
        add(resultField);
        
        // Register action listeners for buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
    }
    
    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        try {
            // Get input values
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = 0;
            
            // Perform the corresponding operation
            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
            } else if (e.getSource() == multiplyButton) {
                result = num1 * num2;
            } else if (e.getSource() == divideButton) {
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    resultField.setText("Cannot divide by zero");
                    return;
                }
            }
            
            // Display the result
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }
}
//How to run?
// 1.Save your applet code in a file named CalculatorSwing.java.
// 2.Create an HTML File: Applets need an HTML file to run. Create an HTML file (CalculatorSwing.html) to load the applet.
// 3.
// <html>
//     <body>
//         <applet code="CalculatorApplet.class" width="300" height="250">
//         </applet>
//     </body>
// </html>
// 4. javac CalculatorApplet.java
// 5. appletviewer CalculatorApplet.html
