package a_11FOIT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A33 extends JFrame {
    JPanel mainPanel = new JPanel();
    JButton start = new JButton("Ein");
    JButton stop = new JButton("Aus");
    JButton change = new JButton("Schalten");

    static boolean red;
    static boolean yellow;
    static boolean green;

    public A33() {
        setContentPane(mainPanel);
        setTitle("Ampel");
        setSize(450, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);

        start.setBounds(300, 220, 100, 40);
        stop.setBounds(300, 220, 100, 40);
        stop.setVisible(false);
        change.setBounds(300, 50, 100, 40);
        change.setVisible(false);

        mainPanel.add(start);
        mainPanel.add(stop);
        mainPanel.add(change);
        mainPanel.add(new ampel());

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setVisible(false);
                stop.setVisible(true);
                change.setVisible(true);
            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                stop.setVisible(false);
                change.setVisible(false);
            }
        });

        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (red) {
                    red = false;
                    yellow = true;
                } else if (yellow) {
                    yellow = false;
                    green = true;
                } else if (green) {
                    green = false;
                    red = true;
                }
            }
        });
    }

    static class ampel extends Canvas {
        public ampel() {
            setSize(300, 300);
        }

        public void paint(Graphics graphics) {
            Graphics2D graphics2D;
            graphics2D = (Graphics2D) graphics;
            graphics2D.setColor(Color.GRAY);
            graphics2D.fillRect(150, 50, 60, 150);
            graphics2D.setColor(Color.BLACK);
            graphics2D.fillRect(170, 200, 20, 100);
            graphics2D.setColor(Color.RED);
            graphics2D.fillOval(160, 55, 40, 40);
            graphics2D.setColor(Color.YELLOW);
            graphics2D.fillOval(160, 105, 40, 40);
            graphics2D.setColor(Color.GREEN);
            graphics2D.fillOval(160, 155, 40, 40);
        }
    }

    public static void main(String[] args) {
        A33 myFrame = new A33();
    }
}
