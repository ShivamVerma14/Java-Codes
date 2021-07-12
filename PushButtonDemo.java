package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class PushButtonDemo extends Frame implements ActionListener {
    String msg = "";
    Button yes, no, undecided;

    public PushButtonDemo() {
        yes = new Button("Yes");
        no = new Button("No");
        undecided = new Button("Undecided");

        setLayout(new FlowLayout());

        add(yes);
        add(no);
        add(undecided);

        yes.addActionListener(this);
        no.addActionListener(this);
        undecided.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent E) {
        String str = E.getActionCommand();
        if(str.equals("Yes"))
            msg = "You pressed Yes";
        else if(str.equals("No"))
            msg = "You pressed No";
        else
            msg = "You pressed Undecided";
        repaint();
    }

    public void paint(Graphics G) {
        G.drawString(msg, 20, 100);
    }

    public static void main(String[] args) {
        PushButtonDemo appwin = new PushButtonDemo();
        appwin.setSize(new Dimension(250, 150));
        appwin.setVisible(true);
        appwin.setTitle("Button Demo");
    }
}