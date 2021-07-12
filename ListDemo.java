package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class ListDemo extends Frame implements ActionListener {
    List os, browser;
    String msg = "";

    public ListDemo() {
        setLayout(new FlowLayout());

        os = new List(4, true);
        browser = new List(4);

        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("Mac OS");

        browser.add("Google Chrome");
        browser.add("Mozilla Firefox");
        browser.add("Microsoft Edge");

        os.select(0);
        browser.select(0);

        add(os);
        add(browser);

        os.addActionListener(this);
        browser.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent E) {
        repaint();
    }

    public void paint(Graphics G) {
        int indexes[];
        
        msg = "Current OS: ";
        indexes = os.getSelectedIndexes();
        for(int index = 0; index < indexes.length; ++index)
            msg += os.getItem(indexes[index]);
        G.drawString(msg, 20, 120);
        msg = "Current Browser: ";
        msg += browser.getSelectedItem();
        G.drawString(msg, 20, 140);
    }

    public static void main(String[] args) {
        ListDemo appwin = new ListDemo();
        appwin.setSize(new Dimension(300, 180));
        appwin.setVisible(true);
        appwin.setTitle("List");
    }
}