package program;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class Q11 extends Frame {
    JTextField b1;
    Label b2, b3;
    public Q11() {
        setLayout(new FlowLayout());
        b1 = new JTextField("   ");
        b2 = new Label("Joy");
        add(b2);
        add(b1);
        b1.addCaretListener(new CaretListener() {
            public void caretUpdate(CaretEvent e) {
                b2.setText(b1.getText());
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setSize(200, 200);
        setVisible(true);
        setTitle("char_at");
    }
    public static void main(String[] args) {
        Q11 a = new Q11();
    }
}
