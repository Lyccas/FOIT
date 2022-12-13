package b_12FOIT.x_vererbung;

public class MainTierwelt {
    public static void main(String[] args) {
        Tier tier = new Tier(5, "weiblich");

        System.out.println(tier.toString());
        System.out.println(tier.geraeucheMachen());

        System.out.println("-".repeat(30));

        Hund hund = new Hund(8, "männlich", true);

        System.out.println(hund.toString());
        System.out.println(hund.geraeucheMachen());

        System.out.println("-".repeat(30));

        Katze katze = new Katze(4, "weiblich", 10);

        System.out.println(katze.toString());
        System.out.println(katze.geraeucheMachen());
        System.out.println(katze.warnungsmeldung());
    }
}
