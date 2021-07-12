package JavaPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class PaintPanel extends JPanel {
    Insets ins;
    Random rand;

    PaintPanel() {
        setBorder(BorderFactory.createLineBorder(Color.RED, 5));

        rand = new Random();
    }

    protected void paintComponent(Graphics G) {
        super.paintComponent(G);

        int x, y, x2, y2;
        int height = getHeight();
        int width = getWidth();
        
        ins = getInsets();

        for(int random = 0; random < 10; ++random) {
            x = rand.nextInt(width - ins.left);
            y = rand.nextInt(height - ins.bottom);
            x2 = rand.nextInt(width - ins.left);
            y2 = rand.nextInt(height - ins.bottom);

            G.drawLine(x, y, x2, y2);
        }
    }
}

public class PaintDemo {
    JLabel label;
    PaintPanel pp;

    PaintDemo() {
        JFrame frame  = new JFrame("Paint Demo");
        frame.setSize(200, 150);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pp = new PaintPanel();

        frame.add(pp);
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PaintDemo();
            }
        });
    }
}