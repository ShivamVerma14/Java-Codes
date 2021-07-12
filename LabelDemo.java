package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class LabelDemo extends Frame {
    public LabelDemo() {
        setLayout(new FlowLayout());

        Label one = new Label("One");
        Label two = new Label("Two");
        Label three = new Label("Three");

        add(one);
        add(two);
        add(three);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        LabelDemo appwin = new LabelDemo();

        appwin.setSize(new Dimension(300, 300));
        appwin.setVisible(true);
        appwin.setTitle("LabelDemo");
    }
}