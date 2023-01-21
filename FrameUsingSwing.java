
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Swing8 extends JFrame {
    Swing8() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setTitle("Ques8 With Swing");
        Dimension d = getSize();
        int w = d.width;
        int h = d.height;
        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                setSize(3 * w, 3 * h);
            }
            public void mouseClicked(MouseEvent e) {
                setSize(w, h);
            }
            public void mouseExited(MouseEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(
                new Runnable() {
            public void run() {
                Swing8 s = new Swing8();
            }
        });
    }
}
