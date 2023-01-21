
import java.awt.*;
import java.awt.event.*;

class Q9 extends Frame {
    String msg = "This is a string on pink background.";
    Q9() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setBackground(Color.pink);
    }
    public void paint(Graphics g) {
        g.drawString(msg, 100, 200);
    }
    public static void main(String args[]) {
        Q9 a1 = new Q9();
    }
}
