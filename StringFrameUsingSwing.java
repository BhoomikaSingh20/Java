
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Swing9 extends JFrame {
    Swing9() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.pink);
        JLabel l = new JLabel("This is a string on pink background.");
        Font f = new Font("sans serif", Font.BOLD, 20);
        l.setFont(f);
        l.setBounds(20, 80, 400, 200);
        add(l);
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(
                new Runnable() {
            public void run() {
                Swing9 s = new Swing9();
            }
        });
    }
}
