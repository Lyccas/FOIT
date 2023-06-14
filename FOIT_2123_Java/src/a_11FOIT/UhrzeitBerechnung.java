package a_11FOIT;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UhrzeitBerechnung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die aktuelle Uhrzeit im Format 'hh:mm' ein: ");
        String uhrzeitStr = scanner.nextLine();

        System.out.print("Geben Sie die Anzahl der Stunden ein, um die die Uhrzeit erhöht werden soll: ");
        int stunden = scanner.nextInt();
        System.out.print("Geben Sie die Anzahl der Minuten ein, um die die Uhrzeit erhöht werden soll: ");
        int minuten = scanner.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime uhrzeit = LocalTime.parse(uhrzeitStr, formatter);

        LocalTime erhoehteUhrzeit = uhrzeit.plusHours(stunden).plusMinutes(minuten);

        String erhoehteUhrzeitStr = erhoehteUhrzeit.format(formatter);
        System.out.println("Die Uhrzeit nach der Erhöhung um " + stunden + " Stunden und " + minuten + " Minuten ist: " + erhoehteUhrzeitStr);
    }
}