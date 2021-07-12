package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class CheckBoxDemo extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, solaris, mac;

    public CheckBoxDemo() {
        setLayout(new FlowLayout());

        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        add(windows);
        add(android);
        add(solaris);
        add(mac);

        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent E) {
        repaint();
    }

    public void paint(Graphics G) {
        msg = "Current State: ";
        G.drawString(msg, 20, 120);
        msg = "  Windows: " + windows.getState();
        G.drawString(msg, 20, 140);
        msg = "  Android: " + android.getState();
        G.drawString(msg, 20, 160);
        msg = "  Solaris: " + solaris.getState();
        G.drawString(msg, 20, 180);
        msg = "  Mac OS: " + mac.getState();
        G.drawString(msg, 20, 200);
    }

    public static void main(String[] args) {
        CheckBoxDemo appwin = new CheckBoxDemo();
        appwin.setSize(new Dimension(240, 220));
        appwin.setVisible(true);
        appwin.setTitle("Check Box");
    }
} 