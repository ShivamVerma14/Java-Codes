package JavaPackage;

import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo extends Frame implements ActionListener {
    TextField name, pass;

    public TextFieldDemo() {
        setLayout(new FlowLayout());

        Label namep = new Label("Name: ", Label.RIGHT);
        Label passp = new Label("Password: ", Label.RIGHT);
        name = new TextField(12);
        pass = new TextField(8);
        pass.setEchoChar('*');

        add(namep);
        add(name);
        add(passp);
        add(pass);

        name.addActionListener(this);
        pass.addActionListener(this);

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
        G.drawString("Name: " + name.getText(), 20, 100);
        G.drawString("Selected text in Name: " + name.getSelectedText(), 20, 120);
        G.drawString("Password: " + pass.getText(), 20, 140);
    }

    public static void main(String[] args) {
        TextFieldDemo appwin = new TextFieldDemo();
        appwin.setSize(new Dimension(480, 180));
        appwin.setVisible(true);
        appwin.setTitle("TextField");
    }
}