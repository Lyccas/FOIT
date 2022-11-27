package a_11FOIT.iv_api.iv_x;

import java.util.Scanner;

public class MathAnwenden {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;

        System.out.println("Bitte geben Sie eine Zahl ein: ");
        number = input.nextDouble();

        System.out.println(Math.abs(number));
        System.out.println(Math.pow(number, 2));
        System.out.println(Math.round(number));
        System.out.println(Math.floor(number));
        System.out.println(Math.sqrt(number));
        System.out.println(Math.tan(number));
        System.out.println(Math.cos(number));
        System.out.println(Math.sin(number));
    }
}
