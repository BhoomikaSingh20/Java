
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Swing12 extends JFrame {
    JButton a;
    JButton b;
    Swing12() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        a = new JButton("A");
        a.setBounds(200, 150, 90, 30);
        add(a);
        b = new JButton("B");
        b.setBounds(200, 200, 90, 30);
        add(b);
        JLabel l = new JLabel("");
        Font f = new Font("sans serif", Font.BOLD, 10);
        l.setFont(f);
        l.setBounds(50, 250, 400, 100);
        add(l);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("CGPA: 9");
            }
        });
        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Name: X, Course: BSc (H) Computer Science, Roll No.: 123456, College: KMV");
            }
        });
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(
                new Runnable() {
            public void run() {
                Swing12 s = new Swing12();
            }
        });
    }
}
