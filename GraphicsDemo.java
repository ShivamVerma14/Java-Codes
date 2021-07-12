package JavaPackage;

import java.awt.event.*;
import java.awt.*;

public class GraphicsDemo extends Frame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    final int inc = 25;
    int max = 500;
    int min = 200;
    Dimension d;

    // Constructor to register Window and MOuse Listener
    public GraphicsDemo() {
        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent E) {
                int w = (d.width + inc) > max ? min : (d.width + inc);
                int h = (d.height + inc) > max ? min : (d.height + inc);
                setSize(new Dimension(w, h));
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
    }

    // Overriding paint() 
    public void paint(Graphics G) {
        Insets i = getInsets();
        d = getSize();
        G.drawLine(i.left, i.top, d.width - i.right, d.height - i.bottom);
        G.drawLine(i.left, d.height - i.bottom, d.width - i.right, i.top);
    }

    public static void main(String[] args) {
        GraphicsDemo appwin = new GraphicsDemo();
        appwin.setSize(new Dimension(200, 200));
        appwin.setVisible(true);
        appwin.setTitle("Graphics Resize");
    }
}