package b_12FOIT.x_klassenarbeit.tier;

public class MainTier {
    public static void main(String[] args) {
        Rentier rentier = new Rentier("Donner");
        Pinguin pinguin = new Pinguin("Paul", 4.20, false);

        System.out.println(rentier.errechneGehalt(2800));
        System.out.println(pinguin.errechneGehalt(3200));
    }
}
