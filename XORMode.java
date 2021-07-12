package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class XORMode extends Frame {
    int chsX = 100, chsY = 100;

    public XORMode() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent E) {
                int x = E.getX();
                int y = E.getY();
                chsX = x - 10;
                chsY = y - 10;
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                 System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(20, 40, 60, 70);
        g.setColor(Color.blue);
        g.fillRect(110, 40, 60, 70);

        g.setColor(Color.black);
        g.fillRect(200, 40, 60, 70);
        g.setColor(Color.red);
        g.fillRect(60, 120, 160, 110);

        g.setXORMode(Color.black);
        g.drawLine(chsX - 10, chsY, chsX + 10, chsY);
        g.drawLine(chsX, chsY - 10, chsX, chsY + 10);
        g.setPaintMode();
    }

    public static void main(String[] args) {
        XORMode appwin = new XORMode();
        appwin.setSize(new Dimension(100, 260));
        appwin.setTitle("XOR Demo");
        appwin.setVisible(true);
    }
}