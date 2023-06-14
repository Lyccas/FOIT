package a_11FOIT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class ZufallsrabattGUI extends JFrame {
    JPanel mainPanel = new JPanel();
    JLabel rechnungswertLabel = new JLabel("Rechnungswert");
    JTextField rechnungswert = new JTextField();
    JLabel gutscheinnummerLabel = new JLabel("Gutscheinnummer");
    JTextField gutscheinnummer = new JTextField();
    JButton go = new JButton("GO!");
    JTextArea ausgabe = new JTextArea();
    JButton back = new JButton("Zurück / Neu");

    public ZufallsrabattGUI() {
        setContentPane(mainPanel);
        setTitle("Zufallsrabatt");
        setSize(450, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);

        rechnungswertLabel.setBounds(10, 10, 400, 20);
        rechnungswert.setBounds(10, 40, 400, 20);
        gutscheinnummerLabel.setBounds(10, 70, 400, 20);
        gutscheinnummer.setBounds(10, 100, 400, 20);
        go.setBounds(10, 150, 100, 20);
        ausgabe.setBounds(10, 200, 400, 40);
        ausgabe.setLineWrap(true);
        ausgabe.setWrapStyleWord(true);
        ausgabe.setVisible(false);
        back.setBounds(10, 250, 200, 20);
        back.setVisible(false);

        mainPanel.add(rechnungswertLabel);
        mainPanel.add(rechnungswert);
        mainPanel.add(gutscheinnummerLabel);
        mainPanel.add(gutscheinnummer);
        mainPanel.add(go);
        mainPanel.add(ausgabe);
        mainPanel.add(back);

        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double rechnungswertInt = Double.parseDouble(rechnungswert.getText());
                int gutscheinnummerInt = Integer.parseInt(gutscheinnummer.getText());

                if (rechnungswertInt < 100) {
                    ausgabe.setText("Sie bekommen leider keinen Rabattcode, da Sie nicht für einen Mindestbetrag von 100€ eingekauft haben");
                    ausgabe.setVisible(true);
                    back.setVisible(true);
                } else {
                    if ((gutscheinnummerInt % 7) == 0) {
                        ausgabe.setText("Glückwunsch Sie haben einen Rabatt von 15% erhalten, ihr neuer Rechnungswert beträgt: " + NumberFormat.getCurrencyInstance().format(rechnungswertInt * 0.85));
                        ausgabe.setVisible(true);
                        back.setVisible(true);
                    } else {
                        ausgabe.setText("Leider hatten Sie keinen Glück bei ihrer Gutscheinnummer!");
                        ausgabe.setVisible(true);
                        back.setVisible(true);
                    }
                }
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rechnungswert.setText("");
                gutscheinnummer.setText("");
                ausgabe.setText("");
                ausgabe.setVisible(false);
                back.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        ZufallsrabattGUI myFrame = new ZufallsrabattGUI();
    }
}