package b_12FOIT.x_klassenarbeit.weihnachtsbaecker;

public class MainWeihnachtsbäcker {
    public static void main(String[] args) {
        Weihnachtsbäcker objekt1 = new Weihnachtsbäcker("Willi", 2000, 485);
        Weihnachtsbäcker objekt2 = new Weihnachtsbäcker("Gerdel", 1850.50, 899);

        System.out.println(objekt1.toString());
        System.out.println(objekt2.toString());
    }
}
