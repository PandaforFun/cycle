import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JFrame;

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("D Junction aaja, ladai ho gayi!", 20, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Applet Example");
        SimpleApplet applet = new SimpleApplet();
        frame.add(applet);
        frame.setSize(300, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        applet.init();
        applet.start();
    }
}