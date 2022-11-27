package b_12FOIT.vererbung;

public class Hund extends Tier {
    private boolean hatSchlappohren;

    public Hund(int alter, String geschlecht, boolean hatSchlappohren) {
        super(alter, geschlecht);
        this.hatSchlappohren = hatSchlappohren;
    }

    public boolean hatSchlappohren() {
        return hatSchlappohren;
    }

    public void setSchlappohren(boolean hatSchlappohren) {
        this.hatSchlappohren = hatSchlappohren;
    }

    public String geraeucheMachen() {
        return super.geraeucheMachen() + "Wuff, Wuff";
    }

    @Override
    public String toString() {
        return super.toString() + ", Hat Schlappohren? = " + hatSchlappohren;
    }
}
