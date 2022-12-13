package a_11FOIT.x_einstieg;

import java.util.Scanner;

public class StringCases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String eingabe;
        int auswahl;


        System.out.println("Bitte geben Sie einen Satz ein:");
        eingabe = input.nextLine();

        System.out.println("---------------------------------------");
        System.out.println("1: Nur das erste Wort");
        System.out.println("2: Vokale tauschen");
        System.out.println("3: Länge des Satzes");
        System.out.println("4: Alles klein schreiben");
        System.out.println("5: Alles groß schreiben");
        System.out.println("6: Wörter trennen");
        System.out.println("Bitte geben Sie einen Index ein:");
        auswahl = input.nextInt();

        switch (auswahl) {
            case 1:
                String sub = eingabe;
                int position = eingabe.indexOf(" ");

                System.out.println(sub.substring(0, position));
                break;
            case 2:
                String vokal;
                String ausgabe = eingabe;

                System.out.println("Bitte geben Sie einen Vokal ein der mit allen erstezt werden soll:");
                vokal = input.next();

                switch (vokal) {
                    case "a":
                        ausgabe = ausgabe.replace("e", "a");
                        ausgabe = ausgabe.replace("i", "a");
                        ausgabe = ausgabe.replace("o", "a");
                        ausgabe = ausgabe.replace("u", "a");
                    case "A":
                        ausgabe = ausgabe.replace("E", "A");
                        ausgabe = ausgabe.replace("a_11FOIT", "A");
                        ausgabe = ausgabe.replace("O", "A");
                        ausgabe = ausgabe.replace("U", "A");

                        System.out.println(ausgabe);
                        break;
                    case "e":
                        ausgabe = ausgabe.replace("a", "e");
                        ausgabe = ausgabe.replace("i", "e");
                        ausgabe = ausgabe.replace("o", "e");
                        ausgabe = ausgabe.replace("u", "e");
                    case "E":
                        ausgabe = ausgabe.replace("A", "E");
                        ausgabe = ausgabe.replace("a_11FOIT", "E");
                        ausgabe = ausgabe.replace("O", "E");
                        ausgabe = ausgabe.replace("U", "E");

                        System.out.println(ausgabe);
                        break;
                    case "i":
                        ausgabe = ausgabe.replace("a", "i");
                        ausgabe = ausgabe.replace("e", "i");
                        ausgabe = ausgabe.replace("o", "i");
                        ausgabe = ausgabe.replace("u", "i");
                    case "a_11FOIT":
                        ausgabe = ausgabe.replace("A", "a_11FOIT");
                        ausgabe = ausgabe.replace("E", "a_11FOIT");
                        ausgabe = ausgabe.replace("O", "a_11FOIT");
                        ausgabe = ausgabe.replace("U", "a_11FOIT");

                        System.out.println(ausgabe);
                        break;
                    case "o":
                        ausgabe = ausgabe.replace("a", "o");
                        ausgabe = ausgabe.replace("e", "o");
                        ausgabe = ausgabe.replace("i", "o");
                        ausgabe = ausgabe.replace("u", "o");
                    case "O":
                        ausgabe = ausgabe.replace("A", "O");
                        ausgabe = ausgabe.replace("E", "O");
                        ausgabe = ausgabe.replace("a_11FOIT", "O");
                        ausgabe = ausgabe.replace("U", "O");

                        System.out.println(ausgabe);
                        break;
                    case "u":
                        ausgabe = ausgabe.replace("a", "u");
                        ausgabe = ausgabe.replace("e", "u");
                        ausgabe = ausgabe.replace("i", "u");
                        ausgabe = ausgabe.replace("o", "u");
                    case "U":
                        ausgabe = ausgabe.replace("A", "U");
                        ausgabe = ausgabe.replace("E", "U");
                        ausgabe = ausgabe.replace("a_11FOIT", "U");
                        ausgabe = ausgabe.replace("O", "U");

                        System.out.println(ausgabe);
                        break;
                    default:
                        System.out.println("Ungültiger Parmaneter");
                }
                break;
            case 3:
                System.out.println("Die Textlänge beträgt " + eingabe.length() + " Zeichen");
                break;
            case 4:
                System.out.println(eingabe.toLowerCase());
                break;
            case 5:
                System.out.println(eingabe.toUpperCase());
                break;
            case 6:
                String[] arrOfEingabe = eingabe.split(" ", eingabe.length());

                for (String a : arrOfEingabe) {
                    System.out.println(a);
                }
                break;
            case 7:
                break;
            default:
                System.out.println("Ungültiger Parmaneter");
        }
    }
}
