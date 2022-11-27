package projekt;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Memory extends JFrame{

    private JPanel mainPanel;

    int totalCells = 54;
    int totalRows = 6;
    int totalColumns = 9;
    JButton[] jButtons = new JButton[totalCells];

    String[] memory = new String[54];
    ArrayList<Integer> randomSaveMemory = new ArrayList<>();

    Random ra = new Random();

    int pressedButton1;
    int pressedButton2;

    public Memory() {
        GridLayout memoryLayout = new GridLayout(totalRows, totalColumns);
        setContentPane(mainPanel);
        setTitle("Memory");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLayout(memoryLayout);
        createButtons();
        createMemory();
        setVisible(true);
    }

    public void createButtons() {
        for (int i = 0; i <= 53; i++) {
            int pressedButton = i;

            jButtons[i] = new JButton();

            jButtons[i].setText("");

            jButtons[i].addActionListener(e -> {
                JButton clickedBtn = (JButton) e.getSource();
                clickedBtn.setText(memory[randomSaveMemory.get(pressedButton)]);
                clickedBtn.setEnabled(false);
            });

            add(jButtons[i]);
        }
    }

    public void createMemory() {
        memory[0] = "Affe";
        memory[1] = "Gorilla";
        memory[2] = "Panda";
        memory[3] = "Tiger";
        memory[4] = "Jaguar";
        memory[5] = "Leopard";
        memory[6] = "Gepard";
        memory[7] = "Pinguin";
        memory[8] = "Fisch";
        memory[9] = "Seekuh";
        memory[10] = "Kuh";
        memory[11] = "Rind";
        memory[12] = "Pferd";
        memory[13] = "Schwein";
        memory[14] = "Esel";
        memory[15] = "Giraffe";
        memory[16] = "Elefant";
        memory[17] = "Nashorn";
        memory[18] = "Taube";
        memory[19] = "Eule";
        memory[20] = "Pelikan";
        memory[21] = "Lama";
        memory[22] = "Kamel";
        memory[23] = "Schlange";
        memory[24] = "Spinne";
        memory[25] = "Dachs";
        memory[26] = "Hase";
        memory[27] = "Affe";
        memory[28] = "Gorilla";
        memory[29] = "Panda";
        memory[30] = "Tiger";
        memory[31] = "Jaguar";
        memory[32] = "Leopard";
        memory[33] = "Gepard";
        memory[34] = "Pinguin";
        memory[35] = "Fisch";
        memory[36] = "Seekuh";
        memory[37] = "Kuh";
        memory[38] = "Rind";
        memory[39] = "Pferd";
        memory[40] = "Schwein";
        memory[41] = "Esel";
        memory[42] = "Giraffe";
        memory[43] = "Elefant";
        memory[44] = "Nashorn";
        memory[45] = "Taube";
        memory[46] = "Eule";
        memory[47] = "Pelikan";
        memory[48] = "Lama";
        memory[49] = "Kamel";
        memory[50] = "Schlange";
        memory[51] = "Spinne";
        memory[52] = "Dachs";
        memory[53] = "Hase";

        for (int i = 0; i <= 53; i++) {
            int randomNumber = ra.nextInt(54);
            while (randomSaveMemory.contains(randomNumber)) {
                randomNumber = ra.nextInt(54);
            }
            randomSaveMemory.add(randomNumber);
        }
    }

    public static void main(String[] args) {
        Memory myFrame = new Memory();
    }
}
