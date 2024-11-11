import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSwing {
    
    // Declare components
    private JFrame frame;
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    private JLabel resultLabel;
    
    public CalculatorSwing() {
        // Create frame
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(new FlowLayout());
        
        // Create input fields and buttons
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(20);
        resultField.setEditable(false);
        
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");
        
        resultLabel = new JLabel("Result:");
        
        // Add components to the frame
        frame.add(new JLabel("Enter first number:"));
        frame.add(num1Field);
        frame.add(new JLabel("Enter second number:"));
        frame.add(num2Field);
        
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        
        frame.add(resultLabel);
        frame.add(resultField);
        
        // Register action listeners for buttons
        addButton.addActionListener(this::performOperation);
        subtractButton.addActionListener(this::performOperation);
        multiplyButton.addActionListener(this::performOperation);
        divideButton.addActionListener(this::performOperation);
        
        frame.setVisible(true);
    }
    
    // Handle button clicks
    private void performOperation(ActionEvent e) {
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
    
    public static void main(String[] args) {
        // Create and show the calculator
        SwingUtilities.invokeLater(CalculatorSwing::new);
    }
}
