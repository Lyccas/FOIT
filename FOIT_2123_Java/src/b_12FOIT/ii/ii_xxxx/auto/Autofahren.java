package b_12FOIT.ii.ii_xxxx.auto;

import java.util.Scanner;

public class Autofahren {

    public static void main(String[] args) {
        Auto auto1 = new Auto(12000, 50.5, 5.2);
        Auto auto2 = new Auto(12000, 60.2, 30.5, 7.2);
        Scanner sc = new Scanner(System.in);

        auto1.setTankinhalt(45.0);

        System.out.println(auto1.toString());

        System.out.println();

        System.out.println("Kilometerstand:" + auto1.getKmStand());
        System.out.println("Tankinhalt: " +  auto1.getTankinhalt());
        auto1.fahren(50);
        System.out.println("Neuer Kilometerstand: " + auto1.getKmStand());
        System.out.println("Neuer Tankinhalt: " +  auto1.getTankinhalt());

        System.out.println("Wie viel Liter moechten sie tanken: ");
        auto1.tanken(sc.nextDouble());

        System.out.println("Fahrzeugdaten:");
        System.out.println(auto1.fahrzeugdaten());

        System.out.println("Kilometerstand:" + auto2.getKmStand());
        System.out.println("Tankinhalt: " +  auto2.getTankinhalt());
        System.out.print("Wie weit fahren Sie (in km): " );
        auto2.fahren(sc.nextDouble());
        System.out.println("Neuer Kilometerstand: " + auto2.getKmStand());
        System.out.println("Neuer Tankinhalt: " +  auto2.getTankinhalt());


    }
}
