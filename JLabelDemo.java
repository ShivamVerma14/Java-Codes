package JavaPackage;

import java.awt.*;
import javax.swing.*;

public class JLabelDemo {

    public JLabelDemo() {
        JFrame frame = new JFrame("JLabelDemo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(260, 210));

        ImageIcon icon = new ImageIcon("Leaves.jpg");

        JLabel label = new JLabel("Leaves", icon, JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JLabelDemo();
            }
        });
    }
}