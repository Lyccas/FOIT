package x_2022_HT_B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Unternehmen callcenter = new Unternehmen();

        Personalverwaltung callcenterVerwaltung = new Personalverwaltung();

        Personal nr87987kb = new Personal("87987kb", 38.5, 2.12);
        Personal nr67898ve = new Personal("67898ve", 42.8, 2.45);
        Personal nr54565ma = new Personal("54565", 52.5, 2.55);

        callcenter.setPersonalverwaltung(callcenterVerwaltung);

        callcenter.addPersonalliste(nr87987kb);
        callcenter.addPersonalliste(nr67898ve);
        callcenter.addPersonalliste(nr54565ma);

        System.out.println("Bitte geben Sie die Ihnen vorliegenden Daten ein: ");
        System.out.println("~".repeat(50));
        System.out.print("Personalbestand zu Quartalbeginn: ");
        callcenterVerwaltung.setPersonalbestand(input.nextInt());
        System.out.print("Abgänge Ruhestand: ");
        callcenterVerwaltung.setAbgangRuhestand(input.nextInt());
        System.out.print("Abgänge Elternzeit: ");
        callcenterVerwaltung.setAbgangElternzeit(input.nextInt());
        System.out.print("Abgänge sonstige Gründe: ");
        callcenterVerwaltung.setAbgangSonstig(input.nextInt());
        System.out.print("Rückkehr aus Elternzeit: ");
        callcenterVerwaltung.setZugangElternzeit(input.nextInt());
        System.out.print("Übernahme aus Ausbildungsverhältnis: ");
        callcenterVerwaltung.setZugangUebernahme(input.nextInt());
        System.out.print("Zugänge sonstige Gründe: ");
        callcenterVerwaltung.setZugangSonstig(input.nextInt());
        System.out.println("");
        System.out.println("Ausgabe der berechneten Werte: ");
        System.out.println("~".repeat(50));
        System.out.println("Personalbestand nach Abgängen: " + callcenterVerwaltung.personalbestandNachAbgang());
        System.out.println("Personalbestand nach Zugängen: " + callcenterVerwaltung.personalbestandNachZugang());
        System.out.print("Zu planende Personalfreisetzungen: ");
        callcenterVerwaltung.setPlanFreisetzung(input.nextInt());
        System.out.print("Zu planende Neueinstellungen: ");
        callcenterVerwaltung.setPlanNeueinstellung(input.nextInt());
        System.out.println("");
        System.out.println("~".repeat(50));
        System.out.println("Im Beschwerdemanagment benötigte Mitarbeiter: " + callcenterVerwaltung.benoetigteMitarbeiter(83));
        System.out.println("");
        System.out.println("~".repeat(50));
        System.out.println(callcenter.getPersonalListe());
    }
}
