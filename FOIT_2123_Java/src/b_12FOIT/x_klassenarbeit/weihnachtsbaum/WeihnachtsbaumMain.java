package b_12FOIT.x_klassenarbeit.weihnachtsbaum;

public class WeihnachtsbaumMain {
    public static void main(String[] args) {
        Weihnachtsbaum weihnachtsbaum = new Weihnachtsbaum("In der großen Halle", 40, 180);

        System.out.println(Weihnachtsbaum.TITEL);
        System.out.println(weihnachtsbaum.getStandort());
        System.out.println(weihnachtsbaum.berechneLampen());
    }
}
