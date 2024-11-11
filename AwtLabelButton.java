import java.awt.*;
import java.awt.event.*;

public class AwtLabelButton extends Frame implements ActionListener {
    Label label1;
    Button button;
    
    public AwtLabelButton() {
        label1 = new Label("Click the button:");
        label1.setBounds(50, 50, 100, 30);
        button = new Button("Click Me");
        button.setBounds(50, 100, 80, 30);
        button.addActionListener(this);
        
        add(label1);
        add(button);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    public void actionPerformed(ActionEvent e) {
        label1.setText("Button Clicked!");
    }
    
    public static void main(String[] args) {
        new AwtLabelButton();
    }
}
