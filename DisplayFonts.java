package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class DisplayFonts extends Frame {
    String msg = "First Five Fonts";
    GraphicsEnvironment GE;

    public DisplayFonts() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });

        GE = GraphicsEnvironment.getLocalGraphicsEnvironment();

        String[] fontlist = GE.getAvailableFontFamilyNames();

        for(int index = 0; (index < 5) && (index < fontlist.length); ++index)
            msg += fontlist[index] + " ";
    }

    public void paint(Graphics G) {
        G.drawString(msg, 10, 40);
    }

    public static void main(String[] args) {
        DisplayFonts DF = new DisplayFonts();
        DF.setSize(new Dimension(200, 200));
        DF.setVisible(true);
        DF.setTitle("Fonts Display");
    }
}