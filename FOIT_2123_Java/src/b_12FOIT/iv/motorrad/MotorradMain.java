package b_12FOIT.iv.motorrad;

public class MotorradMain {
    public static void main(String[] args) {
        Motorrad motorrad = new Motorrad(new Motor(62, 0.6), new Reifen(60, 2.5, "Sommer"), new Reifen(66, 2.5, "Sommer"));

        System.out.println(motorrad.getVorderreifen().getDurchmesser());

        System.out.println("*".repeat(225));

        System.out.println(motorrad);

        System.out.println("*".repeat(225));

        motorrad.gibInfo();
    }
}
