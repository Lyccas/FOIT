package b_12FOIT.ii.ii_xxx.osterhasenhelferGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainOsterhasenhelfer extends JFrame {
    private JPanel osterhasenhelfer;
    private JLabel heading;
    private JLabel labelName;
    private JTextField inputName;
    private JLabel labelGrundgehalt;
    private JTextField inputGrundgehalt;
    private JCheckBox inputOsterfan;
    private JLabel labelOsterfan;
    private JLabel labelEier;
    private JTextField inputEier;
    private JButton berechnenButton;

    public MainOsterhasenhelfer() {
        setContentPane(osterhasenhelfer);
        setTitle("Osterhasenhelfer");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setBounds(10, 10, 400, 20);
        labelName.setBounds(10, 50, 100, 20);
        inputName.setBounds(100, 50, 320, 20);
        labelGrundgehalt.setBounds(10, 90, 100, 20);
        inputGrundgehalt.setBounds(100, 90, 320, 20);
        labelOsterfan.setBounds(10, 130, 100, 20);
        inputOsterfan.setBounds(100, 130, 320, 20);
        labelEier.setBounds(10, 170, 100, 20);
        inputEier.setBounds(100, 170, 320, 20);
        berechnenButton.setBounds(165 ,210, 120, 20);

        berechnenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel outputPanel = new JPanel();
                setContentPane(outputPanel);
                setTitle("Osterhasenhelfer");
                setSize(450, 300);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setVisible(true);
                setLayout(null);

                Osterhasenhelfer helfer = new Osterhasenhelfer();
                helfer.setName(inputName.getText());
                helfer.setGrundlohn(Integer.parseInt(inputGrundgehalt.getText()));
                helfer.setIsOsterfan(inputOsterfan.isSelected());
                helfer.setGefaerbteEier(Integer.parseInt(inputEier.getText()));

                JLabel outputHeading = new JLabel();
                outputHeading.setHorizontalAlignment(SwingConstants.CENTER);
                outputHeading.setBounds(10, 10, 400, 20);
                outputHeading.setText("Zusammenfassung");

                JLabel outputName = new JLabel();
                outputName.setBounds(10, 50, 400, 20);
                outputName.setText("Hallo " + helfer.getName() + "! Hier ein Überblick über deinen Verdienst:");

                JLabel outputGrundlohn = new JLabel();
                outputGrundlohn.setBounds(10, 90, 400, 20);
                outputGrundlohn.setText("Grundlohn: " + helfer.getGrundlohnFormatiert());

                JLabel outputOsterfan = new JLabel();
                outputOsterfan.setBounds(10, 130, 400, 20);
                outputOsterfan.setText(helfer.getIsOsterfanBonusFormatiert());

                JLabel outputEier = new JLabel();
                outputEier.setBounds(10, 170, 400, 20);
                outputEier.setText("Du hast " + helfer.getGefaerbteEier() + " Eier gefärbt :-) Färbe-Zuschlag: " + helfer.getGefaerbteEierBonus() + " Euro");

                JLabel outputGesamtlohn = new JLabel();
                outputGesamtlohn.setBounds(10, 210, 200, 20);
                outputGesamtlohn.setText("Gesamtlohn: " + helfer.getGesamtlohnFormatiert());

                JButton outputBack = new JButton();
                outputBack.setBounds(270, 210, 120, 20);
                outputBack.setText("Zurück");

                outputPanel.add(outputHeading);
                outputPanel.add(outputName);
                outputPanel.add(outputGrundlohn);
                outputPanel.add(outputOsterfan);
                outputPanel.add(outputEier);
                outputPanel.add(outputGesamtlohn);
                outputPanel.add(outputBack);

                outputBack.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setContentPane(osterhasenhelfer);
                    }
                });
            }
        });
    }

    public static void main(String[] args) {
        MainOsterhasenhelfer myFrame = new MainOsterhasenhelfer();
    }
}
