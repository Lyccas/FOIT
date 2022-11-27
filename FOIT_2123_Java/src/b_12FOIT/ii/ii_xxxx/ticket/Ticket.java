package b_12FOIT.ii.ii_xxxx.ticket;

public class Ticket {
    private String startpoint;
    private String endpoint;
    private double standartprice;
    static final String DESIGNATION = "Taunusstein EXPRESS";

    public Ticket() {

    }

    public Ticket(String startpoint, String endpoint, double standartprice) {
        this.startpoint = startpoint;
        this.endpoint = endpoint;
        this.standartprice = standartprice;
    }

    public Ticket(String startpoint, String endpoint) {
        this.startpoint = startpoint;
        this.endpoint = endpoint;
        this.standartprice = 10;
    }

    public String getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(String startpoint) {
        this.startpoint = startpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public double getStandartprice() {
        return standartprice;
    }

    public void setStandartprice(double standartprice) {
        this.standartprice = standartprice;
    }

    public String getDesignation() {
        return DESIGNATION;
    }

    public void endprice(boolean isUnder6, boolean isDisabled, boolean isStudentOrPensonier) {
        if (isUnder6) {
            System.out.println(0);
        } else if (isDisabled) {
            System.out.println(getStandartprice() * 0.2);
        } else if (isStudentOrPensonier) {
            System.out.println(getStandartprice() * 0.7);
        } else {
            System.out.println(getStandartprice());
        }
    }
}
