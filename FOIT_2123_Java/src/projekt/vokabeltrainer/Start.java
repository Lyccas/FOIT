package projekt.vokabeltrainer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;

public class Start extends JFrame{
    private JPanel mainPanel;
    private JLabel headerLabel;
    private JLabel welcomeLabel;
    private JButton addButton;
    private JButton removeButton;
    private JButton showButton;
    private JButton questButton;

    public Start() {
        ArrayList<String> german = new ArrayList<>();
        ArrayList<String> english = new ArrayList<>();

        setContentPane(mainPanel);
        setTitle(Vokabeltrainer.TITEL);
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setBounds(10, 10, 400, 20);
        headerLabel.setText(Vokabeltrainer.TITEL);
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setBounds(10, 60, 400, 20);
        welcomeLabel.setText("Willkommen bei deinem persönlichen Vokabeltrainer");
        addButton.setBounds(10, 110, 200, 20);
        addButton.setText("Vokabel hinzufügen");
        removeButton.setBounds(225, 110, 200, 20);
        removeButton.setText("Vokabel löschen");
        showButton.setBounds(10, 160, 200, 20);
        showButton.setText("Vokabel auflisten");
        questButton.setBounds(225, 160, 200, 20);
        questButton.setText("Vokabel abfragen");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel addPanel = new JPanel();
                setContentPane(addPanel);
                setTitle("Vokabel hinzufügen");
                setSize(450, 300);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setVisible(true);
                setLayout(null);

                JLabel addHeaderLabel = new JLabel("Hier kannst du zu deinem Vokabeltrainer neue Wörter hinzufügen");
                addHeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
                addHeaderLabel.setBounds(10, 10, 400, 20);

                JLabel addGermanLabel = new JLabel("Deutsch:");
                addGermanLabel.setBounds(10, 60, 80, 20);

                JTextField addGermanField = new JTextField();
                addGermanField.setBounds(100, 60, 320, 20);

                JLabel addEnglishLabel = new JLabel("Englisch:");
                addEnglishLabel.setBounds(10, 110, 80, 20);

                JTextField addEnglishField = new JTextField();
                addEnglishField.setBounds(100, 110, 320, 20);

                JButton addBackButton = new JButton("Zurück");
                addBackButton.setBounds(10, 160, 80, 20);

                JButton addSaveButton = new JButton("Speichern");
                addSaveButton.setBounds(100, 160, 100, 20);

                JLabel addSaveLabel = new JLabel("");
                addSaveLabel.setHorizontalAlignment(SwingConstants.CENTER);
                addSaveLabel.setBounds(10, 210, 400, 20);

                addPanel.add(addHeaderLabel);
                addPanel.add(addGermanLabel);
                addPanel.add(addGermanField);
                addPanel.add(addEnglishLabel);
                addPanel.add(addEnglishField);
                addPanel.add(addBackButton);
                addPanel.add(addSaveButton);
                addPanel.add(addSaveLabel);

                addBackButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setContentPane(mainPanel);
                    }
                });

                addSaveButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String germanInput = addGermanField.getText();
                        String englishInput = addEnglishField.getText();

                        if (germanInput.isEmpty() || englishInput.isEmpty()) {
                            addSaveLabel.setText("Es wurden nicht alle notwendigen Parameter ausgefüllt!");

                            addGermanField.setText("");
                            addEnglishField.setText("");
                        } else if (german.contains(germanInput)) {
                            addSaveLabel.setText("Dieses Wort ist bereits in deinem Vokabeltrainer!");

                            addGermanField.setText("");
                            addEnglishField.setText("");
                        } else {
                            german.add(addGermanField.getText());
                            listGerman(german.toString());
                            english.add(addEnglishField.getText());
                            listEnglish(english.toString());

                            addSaveLabel.setText("Erfolgreich gespeichert");

                            addGermanField.setText("");
                            addEnglishField.setText("");
                        }
                    }
                });
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel removePanel = new JPanel();
                setContentPane(removePanel);
                setTitle("Vokabel hinzufügen");
                setSize(450, 300);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setVisible(true);
                setLayout(null);

                JLabel removeHeaderLabel = new JLabel("Hier kannst du aus deinem Vokabeltrainer Wörter löschen");
                removeHeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
                removeHeaderLabel.setBounds(10, 10, 400, 20);

                JLabel removeNameLabel = new JLabel("Wort:");
                removeNameLabel.setBounds(10, 60, 80, 20);

                JTextField removeNameField = new JTextField();
                removeNameField.setBounds(100, 60, 320, 20);

                JButton removeBackButton = new JButton("Zurück");
                removeBackButton.setBounds(10, 110, 80, 20);

                JButton removeSaveButton = new JButton("Löschen");
                removeSaveButton.setBounds(100, 110, 100, 20);

                JLabel removeSaveLabel = new JLabel("");
                removeSaveLabel.setHorizontalAlignment(SwingConstants.CENTER);
                removeSaveLabel.setBounds(10, 160, 400, 20);

                removePanel.add(removeHeaderLabel);
                removePanel.add(removeNameLabel);
                removePanel.add(removeNameField);
                removePanel.add(removeBackButton);
                removePanel.add(removeSaveButton);
                removePanel.add(removeSaveLabel);

                removeBackButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setContentPane(mainPanel);
                    }
                });

                removeSaveButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String nameInput = removeNameField.getText();

                        if (german.contains(nameInput)) {
                            int nameIndex = german.indexOf(nameInput);

                            german.remove(nameIndex);
                            listGerman(german.toString());
                            english.remove(nameIndex);
                            listEnglish(english.toString());

                            removeSaveLabel.setText("Erfolgreich gelöscht");

                            removeNameField.setText("");
                        } else {
                            removeSaveLabel.setText("Es wurde kein Wort mit dem Namen " + nameInput + " gefunden!");

                            removeNameField.setText("");
                        }
                    }
                });
            }
        });

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int heightArea = (german.size() + 1) * 16;
                int yArea = 110;

                JPanel showPanel = new JPanel();
                setContentPane(showPanel);
                setTitle("Vokabel auflisten");
                setSize(450, yArea + heightArea + 110);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setLayout(null);
                setVisible(true);

                JLabel showHeaderLabel = new JLabel("Hier werden aus deinem Vokabeltrainer alle Wörter aufgelistet");
                showHeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
                showHeaderLabel.setBounds(10, 10, 400, 20);

                JLabel showGermanLabel = new JLabel("Deutsch:");
                showGermanLabel.setHorizontalAlignment(SwingConstants.CENTER);
                showGermanLabel.setBounds(0, 60, 195, 20);

                JLabel showEnglishLabel = new JLabel("Englisch:");
                showEnglishLabel.setHorizontalAlignment(SwingConstants.CENTER);
                showEnglishLabel.setBounds(215, 60, 195, 20);

                JTextArea showGermanArea = new JTextArea(1, german.size());
                showGermanArea.setBounds(10, yArea, 195, heightArea);

                JTextArea showEnglishArea = new JTextArea(1, english.size());
                showEnglishArea.setBounds(225, yArea, 195, heightArea);

                if (german.isEmpty()) {
                    showGermanArea.setText("Es gibt noch keine Wörter");
                } else {
                    String showGermanList = "";
                    for (int i = 0; i != german.size(); i++) {
                        showGermanList = showGermanList + german.get(i) + System.getProperty("line.separator");
                        showGermanArea.setText(showGermanList);
                    }
                }

                if (english.isEmpty()) {
                    showEnglishArea.setText("Es gibt noch keine Wörter");
                } else {
                    String showEnglishList = "";
                    for (int i = 0; i != english.size(); i++) {
                        showEnglishList = showEnglishList + english.get(i) + System.getProperty("line.separator");
                        showEnglishArea.setText(showEnglishList);
                    }
                }

                JButton showBackButton = new JButton("Zurück");
                showBackButton.setBounds(10, yArea + heightArea + 30, 80, 20);

                showPanel.add(showHeaderLabel);
                showPanel.add(showGermanLabel);
                showPanel.add(showEnglishLabel);
                showPanel.add(showGermanArea);
                showPanel.add(showEnglishArea);
                showPanel.add(showBackButton);

                showBackButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setContentPane(mainPanel);
                    }
                });
            }
        });

        questButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel questPanel = new JPanel();
                setContentPane(questPanel);
                setTitle("Vokabel abfragen");
                setSize(450, 300);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setVisible(true);
                setLayout(null);

                JLabel questHeaderLabel = new JLabel("Hier kannst du deine Vokabel-Kenntnisse prüfen");
                questHeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
                questHeaderLabel.setBounds(10, 10, 400, 20);

                JLabel questGermanLabel = new JLabel("Deutsch:");
                questGermanLabel.setBounds(10, 60, 80, 20);

                JTextField questGermanField = new JTextField();
                questGermanField.setBounds(100, 60, 320, 20);

                JLabel questEnglishLabel = new JLabel("Englisch:");
                questEnglishLabel.setBounds(10, 110, 80, 20);

                JTextField questEnglishField = new JTextField();
                questEnglishField.setBounds(100, 110, 320, 20);

                JButton questBackButton = new JButton("Zurück");
                questBackButton.setBounds(10, 160, 80, 20);

                JButton questStartButton = new JButton("Starten");
                questStartButton.setBounds(100, 160, 100, 20);

                JButton questCheckButton = new JButton("Überprüfen");
                questCheckButton.setBounds(210, 160, 100, 20);

                JLabel questCheckLabel = new JLabel("Punkte: ");
                questCheckLabel.setBounds(320, 160, 80, 20);

                JLabel questSaveLabel = new JLabel("");
                questSaveLabel.setHorizontalAlignment(SwingConstants.CENTER);
                questSaveLabel.setBounds(10, 210, 400, 20);

                questPanel.add(questHeaderLabel);
                questPanel.add(questGermanLabel);
                questPanel.add(questGermanField);
                questPanel.add(questEnglishLabel);
                questPanel.add(questEnglishField);
                questPanel.add(questBackButton);
                questPanel.add(questStartButton);
                questPanel.add(questCheckButton);
                questPanel.add(questCheckLabel);
                questPanel.add(questSaveLabel);

                questBackButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setContentPane(mainPanel);
                    }
                });

                questStartButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Random questRandom = new Random();
                        int questNumber = questRandom.nextInt(german.size());
                        questGermanField.setText(german.get(questNumber));

                        questCheckButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                int questNumber2 = questRandom.nextInt(german.size());
                                int points = 0;

                                if (questEnglishField.getText().equals(english.get(questNumber)) || questEnglishField.getText().equals(english.get(questNumber2))) {
                                    questSaveLabel.setText("Richtig!");

                                    points++;
                                    questCheckLabel.setText("Punkte: " + points);

                                    questNumber2 = questRandom.nextInt(german.size());

                                    questGermanField.setText(german.get(questNumber2));
                                    questEnglishField.setText("");
                                } else {
                                    questSaveLabel.setText("Falsch! Richtig Wort wäre " + english.get(questNumber) + " gewesen");

                                    points--;
                                    questCheckLabel.setText("Punkte: " + points);

                                    questNumber2 = questRandom.nextInt(german.size());

                                    questGermanField.setText(german.get(questNumber2));
                                    questEnglishField.setText("");
                                }
                            }
                        });
                    }
                });
            }
        });
    }

    public static void main(String[] args) {
        Start myFrame = new Start();
    }

    private static void listGerman(String input){
        Path p = Path.of(Vokabeltrainer.DATEI_DEUTSCH);
        try {
            Path filePath = Files.writeString(p, input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void listEnglish(String input){
        Path p = Path.of(Vokabeltrainer.DATEI_ENGLISCH);
        try {
            Path filePath = Files.writeString(p, input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
