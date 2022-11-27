package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A26b extends JFrame {
    private JPanel mainPanel;
    private JLabel headerLabel;
    private JLabel inputLabel;
    private JLabel outputLabel;
    private JTextField input;
    private JTextField output;
    private JButton okButton;

    public A26b() {
        setContentPane(mainPanel);
        setTitle("A26b");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setBounds(10, 10, 400, 20);
        inputLabel.setBounds(10, 60, 100, 20);
        input.setBounds(120, 60, 300, 20);
        okButton.setBounds(175, 110, 80, 20);
        outputLabel.setBounds(10, 160, 100, 20);
        output.setBounds(120, 160, 300, 20);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eingabe = input.getText();
                eingabe = eingabe.toLowerCase();
                String ausgabe = input.getText();

                if (eingabe.contains("?")) {
                    if (eingabe.equals("no idea?")) {
                        ausgabe = "Aye!";
                    } else {
                        ausgabe = ausgabe + " No idea!";
                    }
                } else {
                    ausgabe = "";
                }
                output.setText(ausgabe);
            }
        });
    }

    public static void main(String[] args) {
        A26b myFrame = new A26b();
    }
}
