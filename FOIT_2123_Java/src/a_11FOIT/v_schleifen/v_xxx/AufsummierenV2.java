package a_11FOIT.v_schleifen.v_xxx;

import java.util.Scanner;

public class AufsummierenV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean eingabe;
        int summe = 0;

        System.out.println("Möchten Sie das Programm beenden?");
        eingabe = input.nextBoolean();

        if (eingabe) {
            System.out.println(summe);
        }
        else {
            for (int durchlauf = 1; !eingabe; durchlauf++){
                System.out.println("Möchten Sie das Programm beenden?");
                eingabe = input.nextBoolean();
                summe = summe + durchlauf;
            }
            System.out.println(summe);
        }
    }
}
