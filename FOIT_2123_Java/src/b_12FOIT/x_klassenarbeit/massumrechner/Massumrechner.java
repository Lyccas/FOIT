package b_12FOIT.x_klassenarbeit.massumrechner;

public class Massumrechner {
    public static double literInMilliliter() {
        return 1000;
    }

    public static double literInMilliliter(double liter) {
        return liter * 1000;
    }

    public static String grammInKilligram(int gramm) {
        return Math.round((gramm / 1000.0) * 100.0) / 100.0 + "kg";
    }

    public static double benoetigtesPapierProGeschenk(double a, double b, double c) {
        return ((a * b * 2) + (a * c * 2) + (b * c * 2)) * 1.15;
    }
}
