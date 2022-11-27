package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A24 extends JFrame {
    private JButton ok_button;
    private JButton new_button;
    private JTextField eingabe;
    private JPanel mainPanel;
    private JLabel ausgabe;

    public A24() {
        setContentPane(mainPanel);
        setTitle("A24");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        ok_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = eingabe.getText();
                ausgabe.setText("Die Textlänge beträgt " + input.length() + " Zeichen");
            }
        });

        new_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eingabe.setText("");
                ausgabe.setText("");
            }
        });
    }

    public static void main(String[] args) {
        A24 myFrame = new A24();
    }
}
