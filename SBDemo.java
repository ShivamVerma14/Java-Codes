package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class SBDemo extends Frame implements AdjustmentListener {
    String msg = "";
    Scrollbar vertS, horiS;

    public SBDemo() {
        setLayout(new FlowLayout());

        vertS = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 200);
        horiS = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 200);

        vertS.setPreferredSize(new Dimension(20, 100));
        horiS.setPreferredSize(new Dimension(100, 20));

        add(vertS);
        add(horiS);

        vertS.addAdjustmentListener(this);
        horiS.addAdjustmentListener(this);

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent E) {
                int x = E.getX();
                int y = E.getY();
                vertS.setValue(y);
                horiS.setValue(x);
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
    }

    public void adjustmentValueChanged(AdjustmentEvent E) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Vertical: " + vertS.getValue();
        msg += ", Horizontal: " + horiS.getValue();
        g.drawString(msg, 20, 160);

        g.drawString("*", horiS.getValue(), vertS.getValue());
    }

    public static void main(String[] args) {
        SBDemo appwin = new SBDemo();
        appwin.setSize(new Dimension(300, 180));
        appwin.setVisible(true);
        appwin.setTitle("SBDemo");
    }
}