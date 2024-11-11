import javax.swing.*;
import java.awt.event.*;

public class Swing extends JFrame implements ActionListener {
    JLabel label;
    JTextField textField;
    JButton button;
    
    public Swing() {
        label = new JLabel("Enter your name: ");
        label.setBounds(50, 50, 150, 30);
        textField = new JTextField();
        textField.setBounds(50, 100, 200, 30);
        button = new JButton("Submit");
        button.setBounds(50, 150, 80, 30);
        button.addActionListener(this);
        
        add(label);
        add(textField);
        add(button);
        setSize(300, 250);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        label.setText("Hello, " + name + "!");
    }
    
    public static void main(String[] args) {
        new Swing();
    }
}
