package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A25 extends JFrame {
    private JPanel mainPanel;
    private JTextField eingabe;
    private JButton OKButton;
    private JLabel headerLabel;
    private JLabel textLabel;

    public A25() {
        setContentPane(mainPanel);
        setTitle("A25");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setBounds(10, 10, 400, 20);
        textLabel.setBounds(10, 60, 100, 20);
        eingabe.setBounds(120, 60, 300, 20);
        OKButton.setBounds(180, 110, 60, 20);

        JDialog fenster = new JDialog();
        fenster.setTitle("Das erste Wort");
        fenster.setBounds(0, 0, 450, 150);
        fenster.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        fenster.setVisible(false);
        fenster.setLayout(null);
        fenster.setResizable(false);

        JLabel ausgabe = new JLabel("", SwingConstants.CENTER);
        ausgabe.setBounds(10, 10, 400, 20);

        JButton okDialog = new JButton("OK");
        okDialog.setBounds(180, 60, 60, 20);

        fenster.add(ausgabe);
        fenster.add(okDialog);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = eingabe.getText();
                String sub = new String(input);
                int position = input.indexOf(" ");

                ausgabe.setText(sub.substring(0, position));

                fenster.setVisible(true);

                okDialog.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ausgabe.setText("");
                        fenster.setVisible(false);
                    }
                });
            }
        });
    }

    public static void main(String[] args) {
        A25 myFrame = new A25();
    }
}
