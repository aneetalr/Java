import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;
import java.awt.Window.*;

public class KeyEventsMain implements KeyListener {
    Label lb1, lbl2, lb;
    TextField tf1;
    Frame fr;
    String s;

    KeyEventsMain() {
        fr = new Frame("KeyEventListener Example");
        lb1 = new Label(" Key Events will be displayed based on the actions", Label.CENTER);
        lbl2 = new Label();
        lb = new Label();
        tf1 = new TextField(20);
        fr.add(lb1);
        fr.add(tf1);
        fr.add(lbl2);
        fr.setLayout(new FlowLayout());
        tf1.addKeyListener(this);
        fr.setSize(460, 250);
        fr.setVisible(true);
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }
    public void keyPressed(KeyEvent ev) {
        lbl2.setText("Pressed Key");
    }
    public void keyReleased(KeyEvent ev) {
        lbl2.setText("Released key");
    }
    public void keyTyped(KeyEvent ev) {
        lbl2.setText("Key is typed");
        fr.setVisible(true);
    }

    public static void main(String args[]) {
        new KeyEventsMain();
    }
}