package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class MultiLine extends Frame {
    int curX = 20, curY = 40;

    public MultiLine() {
        Font f = new Font("SansSerif", Font.PLAIN, 12);
        setFont(f);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics G) {
        FontMetrics fm = G.getFontMetrics();

        nextLine("This is on line one", G);
        nextLine("This is on line two", G);
        sameLine(" This is on same line", G);
        sameLine(" This, too", G);
        nextLine("This is on third line", G);

        curX = 20;
        curY = 40;
    }

    void nextLine(String s, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        curY += fm.getHeight();
        curX = 20;
        g.drawString(s, curX,  curY);
        curX += fm.stringWidth(s);
    }

    void sameLine(String s, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        g.drawString(s, curX, curY);
        curX += fm.stringWidth(s);
    }

    public static void main(String[] args) {
        MultiLine appwin = new MultiLine();
        appwin.setSize(new Dimension(300, 300));
        appwin.setVisible(true);
        appwin.setTitle("MultiLine");
    }
}