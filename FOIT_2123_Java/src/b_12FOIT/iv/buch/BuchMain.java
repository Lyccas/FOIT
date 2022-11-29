package b_12FOIT.iv.buch;

public class BuchMain {
    public static void main(String[] args) {
        Buch buch = new Buch("12FOIT", new Seite(1, "Test1"), new Seite(2, "Test2"), new Seite(3, "Test3"), new Seite(4, "Seite4"), new Seite(5, "Seite5"));

        System.out.println(buch);
    }
}
