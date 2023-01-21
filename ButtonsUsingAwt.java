
import java.awt.*;
import java.awt.event.*;

class Q12 extends Frame implements ActionListener {
    Button a;
    Button b;
    String msg;
    Q12() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setSize(500, 500);
        setLayout(null);
        a = new Button("A");
        a.setBounds(200, 15, 90, 30);
        b = new Button("B");
        b.setBounds(200, 200, 90, 30);
        setVisible(true);
        add(a);
        add(b);
        a.addActionListener(this);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "A") {
            msg = "Name: X, Course: BSc (H) Computer Science, Roll No.: 123456, College: KMV";
            repaint();
        } else {
            msg = "CGPA: 9";
            repaint();
        }
    }
    public void paint(Graphics g) {
        g.drawString(msg, 50, 300);
    }
    public static void main(String args[]) {
        Q12 a1 = new Q12();
    }
}
