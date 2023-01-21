
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Swing10 extends JFrame {
    JButton r;
    JButton b;
    Swing10() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        r = new JButton("Red");
        r.setBounds(80, 100, 80, 30);
        add(r);
        b = new JButton("Blue");
        b.setBounds(180, 100, 80, 30);
        add(b);
        r.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED);
            }
        });
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.BLUE);
            }
        });
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(
                new Runnable() {
            public void run() {
                Swing10 s = new Swing10();
            }
        });
    }
}
