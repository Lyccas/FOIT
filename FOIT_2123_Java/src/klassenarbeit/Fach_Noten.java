package klassenarbeit;

import java.util.ArrayList;
import java.util.Scanner;

public class Fach_Noten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> fach = new ArrayList<String>();
        ArrayList<Integer> note = new ArrayList<Integer>();
        int eingabeMenu;
        String eingabeFach;
        int eingabeNote;
        int eingabeDelete;

        System.out.println("1: Hinzufügen");
        System.out.println("2: Löschen");
        System.out.println("3: Überblick");
        System.out.println("4: Durchschnitt");
        System.out.println("5: Beenden");
        System.out.print("Bitte geben Sie eine Zahl an: ");
        eingabeMenu = input.nextInt();

        while (eingabeMenu != 5) {
            if (eingabeMenu == 1) {
                System.out.print("Bitte geben Sie ein Fach an: ");
                fach.add(eingabeFach = input.next());
                System.out.print("Bitte geben Sie eine dazugehörige Note an: ");
                note.add(eingabeNote = input.nextInt());
            } else if (eingabeMenu == 2) {
                System.out.print("Bitte geben Sie den Index an, von dem zulöschenden Fach und ihrer Note: ");
                eingabeDelete = input.nextInt();
                fach.remove(eingabeDelete);
                note.remove(eingabeDelete);
            } else if (eingabeMenu == 3) {
                for (int i = 0; i != fach.size(); i++) {
                    System.out.println(fach.get(i));
                    System.out.println(note.get(i));
                }
            } else if (eingabeMenu == 4) {
                double durchschnitt = 0;
                for (int i = 0; i != fach.size(); i++) {
                    durchschnitt = durchschnitt + note.get(i);
                }
                durchschnitt = durchschnitt / note.size();
                System.out.println("Durchschnitt: " + durchschnitt);
            }
            System.out.println("1: Hinzufügen");
            System.out.println("2: Löschen");
            System.out.println("3: Überblick");
            System.out.println("4: Durchschnitt");
            System.out.println("5: Beenden");
            System.out.print("Bitte geben Sie eine Zahl an: ");
            eingabeMenu = input.nextInt();
        }
    }
}
