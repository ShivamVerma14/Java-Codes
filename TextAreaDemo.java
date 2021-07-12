package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo extends Frame {
    public TextAreaDemo() {
        setLayout(new FlowLayout());

        String val = "Java 9 is the latest version of the most \n" + 
                     "widely used computer language for Internet Programming. \n" +
                     "Building on a rich-heritage, Java has advanced both \n" +
                     "the art and the science of computer language design. ";
        
        TextArea text = new TextArea(val, 4, 30);
        add(text);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        TextAreaDemo appwin = new TextAreaDemo();
        appwin.setSize(new Dimension(300, 220));
        appwin.setVisible(true);
        appwin.setTitle("TextArea");
    }
}