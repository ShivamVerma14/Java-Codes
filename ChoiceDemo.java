package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ItemListener {
    Choice os, browser;
    String msg = "";

    public ChoiceDemo() {
        setLayout(new FlowLayout());

        os = new Choice();
        browser = new Choice();

        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("Mac OS");

        browser.add("Google Chrome");
        browser.add("Mozilla Firefox");
        browser.add("Microsoft Edge");

        add(os);
        add(browser);

        os.addItemListener(this);
        browser.addItemListener(this);

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
        msg = "Current OS: ";
        msg += os.getSelectedItem();
        G.drawString(msg, 20, 120);
        msg = "Current Browser: ";
        msg += browser.getSelectedItem();
        G.drawString(msg, 20, 140);
    }

    public static void main(String[] args) {
        ChoiceDemo appwin = new ChoiceDemo();
        appwin.setSize(new Dimension(240, 180));
        appwin.setVisible(true);
        appwin.setTitle("Choice Demo");
    }
}