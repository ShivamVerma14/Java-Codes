package JavaPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo {
    JLabel label;

    public EventDemo() {
        JFrame frame = new JFrame("An Event Example");
        frame.setLayout(new FlowLayout());
        frame.setSize(220, 90);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton alphab = new JButton("Alpha");
        JButton betab = new JButton("Beta");

        alphab.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent E) {
                label.setText("Alpha was Pressed");
            }
        });

        betab.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent E) {
                label.setText("Beta was Pressed");
            }
        });

        frame.add(alphab);
        frame.add(betab);

        label = new JLabel("Press a button");
        frame.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EventDemo();
            }
        });
    }
}