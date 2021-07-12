package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class SampleFonts extends Frame {
    int next = 0;
    Font f;
    String msg;

    public SampleFonts() {
        f = new Font("Dialog", Font.PLAIN | Font.ITALIC, 12);
        msg = "Dialog";
        setFont(f);
        
        addMouseListener(new MyMouseAdapter(this));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics G) {
        G.drawString(msg, 10, 40);
    }

    public static void main(String[] args) {
        SampleFonts SF = new SampleFonts();
        SF.setSize(new Dimension(400, 400));
        SF.setTitle("Font Demo");
        SF.setVisible(true);
    }
}

class MyMouseAdapter extends MouseAdapter {
    SampleFonts samplefonts;

    MyMouseAdapter(SampleFonts obj) {
        samplefonts = obj;
    }

    public void mousePressed(MouseEvent E) {
        samplefonts.next++;

        switch(samplefonts.next) {
            case 0:
                samplefonts.f = new Font("Dialog", Font.PLAIN, 12);
                samplefonts.msg = "Dialog";
                break;
            case 1:
                samplefonts.f = new Font("DialogInput", Font.PLAIN, 12);
                samplefonts.msg = "DialogInput";
                break;
            case 2:
                samplefonts.f = new Font("SansSerif", Font.PLAIN, 12);
                samplefonts.msg = "SansSerif";
                break;
            case 3:
                samplefonts.f = new Font("Serif", Font.PLAIN, 12);
                samplefonts.msg = "Serif";
                break;
            case 4:
                samplefonts.f = new Font("Monospaced", Font.PLAIN, 12);
                samplefonts.msg = "Monospaced";
                break;
        }

        if(samplefonts.next == 4)
            samplefonts.next = -1;
        samplefonts.setFont(samplefonts.f);
        samplefonts.repaint();
    }
}