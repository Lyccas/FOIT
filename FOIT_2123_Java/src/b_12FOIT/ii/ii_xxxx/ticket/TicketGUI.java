package b_12FOIT.ii.ii_xxxx.ticket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketGUI extends JFrame {
    private JPanel mainPanel;
    private JLabel header;
    private JLabel footer;
    private JButton buttonRegulaer;
    private JButton buttonErmaessigt;
    private JLabel auswahlLabel;

    public TicketGUI() {
        setContentPane(mainPanel);
        setTitle("Fahrkartenautomat");
        setSize(600, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setBounds(0, 50, 580, 30);
        header.setText("Ticketautomat - " + Ticket.DESIGNATION);
        header.setFont(new Font("Serif", Font.BOLD, 30));
        auswahlLabel.setHorizontalAlignment(SwingConstants.CENTER);
        auswahlLabel.setBounds(0, 150, 580, 20);
        auswahlLabel.setText("Bitte wählen Sie ihren Tarif aus.");
        buttonRegulaer.setBounds(60, 220, 195, 50);
        buttonRegulaer.setText("Regulär");
        buttonErmaessigt.setBounds(320, 220, 195, 50);
        buttonErmaessigt.setText("Ermäßigt");
        footer.setBounds(5, 440, 600, 20);
        footer.setText(Ticket.DESIGNATION);
        footer.setFont(new Font("Serif", Font.ITALIC, 12));

        buttonRegulaer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel regulaerPanel = new JPanel();
                setContentPane(regulaerPanel);
                setTitle("Fahrkartenautomat - Regulären Tarif");
                setSize(600, 500);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setVisible(true);
                setLayout(null);

                regulaerPanel.add(header);
                regulaerPanel.add(footer);
            }
        });

        buttonErmaessigt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel ermaessigtPanel = new JPanel();
                setContentPane(ermaessigtPanel);
                setTitle("Fahrkartenautomat - Ermäßigten Tarif");
                setSize(600, 500);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setVisible(true);
                setLayout(null);

                ermaessigtPanel.add(header);
                ermaessigtPanel.add(footer);
            }
        });
    }

    public static void main(String[] args) {
        TicketGUI myFrame = new TicketGUI();
    }
}
