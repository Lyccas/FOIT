package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A26a extends JFrame {
    private JTextField input;
    private JTextField output;
    private JTextField vokal;
    private JButton OKButton;
    private JPanel mainPanel;
    private JLabel headerLabel;
    private JLabel textLabel;
    private JLabel vokalLabel;

    public A26a() {
        setContentPane(mainPanel);
        setTitle("A26a");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setBounds(10, 10, 400, 20);
        textLabel.setBounds(10, 60, 100, 20);
        input.setBounds(120, 60, 300, 20);
        vokalLabel.setBounds(10, 110, 100, 20);
        vokal.setBounds(120, 110, 60, 20);
        OKButton.setBounds(190, 110, 60, 20);
        output.setBounds(120, 160, 300, 20);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputString = input.getText().toLowerCase();
                String vokalString = vokal.getText().toLowerCase();
                String outputString = input.getText().toLowerCase();

                if (vokalString.equals("a") || vokalString.equals("e") || vokalString.equals("i") || vokalString.equals("o") || vokalString.equals("u")) {
                    if (vokalString.contains("a")) {
                        if (inputString.contains("e")) {
                            outputString = outputString.replace("e", "a");
                        }
                        if (inputString.contains("i")) {
                            outputString = outputString.replace("i", "a");
                        }
                        if (inputString.contains("o")) {
                            outputString = outputString.replace("o", "a");
                        }
                        if (inputString.contains("u")) {
                            outputString = outputString.replace("u", "a");
                        }
                    }
                    if (vokalString.contains("e")) {
                        if (inputString.contains("a")) {
                            outputString = outputString.replace("a", "e");
                        }
                        if (inputString.contains("i")) {
                            outputString = outputString.replace("i", "e");
                        }
                        if (inputString.contains("o")) {
                            outputString = outputString.replace("o", "e");
                        }
                        if (inputString.contains("u")) {
                            outputString = outputString.replace("u", "e");
                        }
                    }
                    if (vokalString.contains("i")) {
                        if (inputString.contains("a")) {
                            outputString = outputString.replace("a", "i");
                        }
                        if (inputString.contains("e")) {
                            outputString = outputString.replace("e", "i");
                        }
                        if (inputString.contains("o")) {
                            outputString = outputString.replace("o", "i");
                        }
                        if (inputString.contains("u")) {
                            outputString = outputString.replace("u", "i");
                        }
                    }
                    if (vokalString.contains("o")) {
                        if (inputString.contains("a")) {
                            outputString = outputString.replace("a", "o");
                        }
                        if (inputString.contains("i")) {
                            outputString = outputString.replace("i", "o");
                        }
                        if (inputString.contains("e")) {
                            outputString = outputString.replace("e", "o");
                        }
                        if (inputString.contains("u")) {
                            outputString = outputString.replace("u", "o");
                        }
                    }
                    if (vokalString.contains("u")) {
                        if (inputString.contains("a")) {
                            outputString = outputString.replace("a", "u");
                        }
                        if (inputString.contains("i")) {
                            outputString = outputString.replace("i", "u");
                        }
                        if (inputString.contains("o")) {
                            outputString = outputString.replace("o", "u");
                        }
                        if (inputString.contains("e")) {
                            outputString = outputString.replace("e", "u");
                        }
                    }

                    output.setText(outputString);
                } else {
                    output.setText("Bitte geben Sie einen reguleren Vokal ein");
                }
            }
        });
    }

    public static void main(String[] args) {
        A26a myFrame = new A26a();
    }
}
