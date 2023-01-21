
import java.awt.*;
import java.awt.event.*;

class Q8 extends Frame {
    Q8() {
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
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
        Q8 a1 = new Q8();
    }
}
