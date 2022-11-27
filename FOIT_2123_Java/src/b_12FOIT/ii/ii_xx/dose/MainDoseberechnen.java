package b_12FOIT.ii.ii_xx.dose;

public class MainDoseberechnen {
    public static void main(String[] args) {
        Dose suppendose = new Dose();
        suppendose.setU(4.5);
        suppendose.setH(7.9);

        System.out.println("Der Durchmesser des Dosenbodens beträgt: " + Math.round(suppendose.getD_boden() * 100.0) / 100.0);
        System.out.println("Die Fläche des Dosenbodens beträgt: " + Math.round(suppendose.getF_boden() * 100.0) / 100.0);
        System.out.println("Die Mantelfläche der Dose beträgt: " + Math.round(suppendose.getF_mantel() * 100.0) / 100.0);
        System.out.println("Die Gesamtfläche der Dose beträht: " + Math.round(suppendose.getF_gesamt() * 100.0) / 100.0);
        System.out.println("Das Volumen der Dose beträgt: " + Math.round(suppendose.getV() * 100.0) / 100.0);
    }
}
