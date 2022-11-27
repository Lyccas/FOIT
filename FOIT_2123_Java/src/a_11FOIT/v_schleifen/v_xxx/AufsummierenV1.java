package a_11FOIT.v_schleifen.v_xxx;

import java.util.Scanner;

public class AufsummierenV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String eingabe;
        int summe = 0;

        System.out.println("Möchten Sie das Programm beenden?");
        eingabe = input.next();

        if (eingabe.equals("Ja")) {
            System.out.println(summe);
        }
        else {
            for (int durchlauf = 1; !eingabe.equals("Ja"); durchlauf++){
                System.out.println("Möchten Sie das Programm beenden?");
                eingabe = input.next();
                summe = summe + durchlauf;
            }
            System.out.println(summe);
        }
    }
}
