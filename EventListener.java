import java.awt.*;
import java.awt.event.*;

public class EventListener extends Frame implements KeyListener, MouseListener {
    Label label;

    public EventListener() {
        label = new Label();
        label.setBounds(50, 100, 400, 30);
        add(label);
        setSize(500, 200);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        addKeyListener(this);
        addMouseListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void keyPressed(KeyEvent e) {
        String message = "Key Pressed: " + e.getKeyChar();
        label.setText(message);
        System.out.println(message);
    }

    public void keyReleased(KeyEvent e) {
        String message = "Key Released: " + e.getKeyChar();
        label.setText(message);
        System.out.println(message);
    }

    public void keyTyped(KeyEvent e) {
        String message = "Key Typed: " + e.getKeyChar();
        label.setText(message);
        System.out.println(message);
    }

    public void mouseClicked(MouseEvent e) {
        String message = "Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")";
        label.setText(message);
        System.out.println(message);
    }

    public void mouseEntered(MouseEvent e) {
        String message = "Mouse Entered";
        label.setText(message);
        System.out.println(message);
    }

    public void mouseExited(MouseEvent e) {
        String message = "Mouse Exited";
        label.setText(message);
        System.out.println(message);
    }

    public void mousePressed(MouseEvent e) {
        String message = "Mouse Pressed at: (" + e.getX() + "," + e.getY() + ")";
        label.setText(message);
        System.out.println(message);
    }

    public void mouseReleased(MouseEvent e) {
        String message = "Mouse Released at: (" + e.getX() + "," + e.getY() + ")";
        label.setText(message);
        System.out.println(message);
    }

    public static void main(String[] args) {
        new EventListener();
    }
}
