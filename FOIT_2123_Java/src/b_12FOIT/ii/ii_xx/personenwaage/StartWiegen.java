package b_12FOIT.ii.ii_xx.personenwaage;

public class StartWiegen {
    public static void main(String[] args) {
        Person testperson = new Person();
        testperson.setGroesse(195);
        testperson.setGewicht(90);

        System.out.println("Idealgewicht: " + testperson.getIdealgewicht());
        System.out.println("Gewichtsmeldung: " + testperson.getGewichtsmeldung());
    }
}
