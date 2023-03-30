package x_2022_HT_A;

import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame {
    public MainGUI() {
        JPanel mainPanel = new JPanel();
        setContentPane(mainPanel);
        setTitle("Pflegeheim");
        setSize(1000, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        JLabel header = new JLabel("Pflegeheim");
        header.setFont(new Font("Serif", Font.BOLD, 30));

        mainPanel.add(header);
    }

    public static void main(String[] args) {
        MainGUI myFrame = new MainGUI();
    }
}
