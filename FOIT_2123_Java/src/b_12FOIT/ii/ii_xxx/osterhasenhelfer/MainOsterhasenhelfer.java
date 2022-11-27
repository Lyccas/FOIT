package b_12FOIT.ii.ii_xxx.osterhasenhelfer;

import java.util.Scanner;

public class MainOsterhasenhelfer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Osterhasenhelfer helfer = new Osterhasenhelfer();
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        helfer.setName(input.next());
        System.out.print("Bitte geben Sie ihren Grundlohn ein (€): ");
        helfer.setGrundlohn(input.nextInt());
        System.out.print("Sind Sie Osterfan? ");
        helfer.setIsOsterfan(input.nextBoolean());
        System.out.print("Wie viele Eier haben Sie gefärbt? ");
        helfer.setGefaerbteEier(input.nextInt());

        System.out.println("Hallo " + helfer.getName() + "! Hier ein Überblick über deinen Verdienst:");
        System.out.println("Grundlohn: " + helfer.getGrundlohnFormatiert());
        System.out.println(helfer.getIsOsterfanBonusFormatiert());
        System.out.println("Du hast " + helfer.getGefaerbteEier() + " Eier gefärbt :-) Färbe-Zuschlag: " + helfer.getGefaerbteEierBonus() + " Euro");
        System.out.println("Grundlohn: " + helfer.getGesamtlohnFormatiert());
    }
}
