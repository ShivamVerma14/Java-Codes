package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class FrameDemo extends Frame implements ActionListener {
    TextField tf;
    Button b;
    
    FrameDemo() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        b = new Button("Click Me!!!");
        b.setBounds(100, 120, 80, 30);
        b.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent E) {
        tf.setText("Welcome" + this);
    }
    
    public static void main(String[] args) {
        new FrameDemo();
    }
}
