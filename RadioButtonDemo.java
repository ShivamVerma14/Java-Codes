package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, solaris, mac;
    CheckboxGroup cbg;

    public RadioButtonDemo() {
        setLayout(new FlowLayout());

        cbg = new CheckboxGroup();

        windows = new Checkbox("Windows", cbg, true);
        android = new Checkbox("Android", cbg, false);
        solaris = new Checkbox("Solaris", cbg, false);
        mac = new Checkbox("Mac OS", cbg, false);

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
        msg = "Current Selection: ";
        msg += cbg.getSelectedCheckbox().getLabel();
        G.drawString(msg, 20, 140);
    }

    public static void main(String[] args) {
        RadioButtonDemo appwin = new RadioButtonDemo();
        appwin.setSize(new Dimension(240, 180));
        appwin.setVisible(true);
        appwin.setTitle("Check Box");
    }
} 