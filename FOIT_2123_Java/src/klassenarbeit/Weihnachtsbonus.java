package klassenarbeit;

import java.util.Scanner;
import java.text.NumberFormat;

public class Weihnachtsbonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int päckchen;
        double weihnachtsgeld = 100.0;
        String weihnachtsgeld_formatiert = NumberFormat.getCurrencyInstance().format(weihnachtsgeld);
        int prozent;
        double bonus;
        double weihnachtsgeld_gesamt;
        String weihnachtsgeld_gesamt_formatiert;

        System.out.print("Bitte Namen eingeben: ");
        name = input.next();
        System.out.print("Wie viele Päckchen hast du heute verpackt? ");
        päckchen = input.nextInt();

        if (päckchen >= 200) {
            bonus = weihnachtsgeld * 0.2;
            prozent = 20;
        }
        else if (päckchen >= 100) {
            bonus = weihnachtsgeld * 0.08;
            prozent = 8;
        }
        else {
            bonus = 0;
            prozent = 0;
        }

        weihnachtsgeld_gesamt = weihnachtsgeld + bonus;
        weihnachtsgeld_gesamt_formatiert = NumberFormat.getCurrencyInstance().format(weihnachtsgeld_gesamt);

        System.out.println();
        System.out.println("Hallo Weihnachtselfe " + name + ", zu deinem regulären Wheinachtsgeld von " + weihnachtsgeld_formatiert + " hat dir");
        System.out.println("der Weihnachtsmann heute einen Bonus von " + prozent + " Prozent zugesichert.");
        System.out.println("Das heißt du erhälst " + weihnachtsgeld_gesamt_formatiert + " Weihnachtsgeld!!!");
    }
}
