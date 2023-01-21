
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class swing_Q11 extends JFrame {
    JTextField b1;
    JLabel b2, b3;
    public swing_Q11() {
        setLayout(new FlowLayout());
        b1 = new JTextField(" ");
        b2 = new JLabel("Joy");
        add(b2);
        add(b1);
        b1.addCaretListener(new CaretListener() {
            public void caretUpdate(CaretEvent e) {
                b2.setText(b1.getText());
            }
        });
        setSize(200, 200);
        setVisible(true);
        setTitle("char_at");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        swing_Q11 ms = new swing_Q11();
    }
}
