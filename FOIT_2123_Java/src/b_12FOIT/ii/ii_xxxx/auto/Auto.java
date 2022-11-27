package b_12FOIT.ii.ii_xxxx.auto;

public class Auto {
    private double kmStand;
    private double maxTankinhalt;
    private double tankinhalt;
    private double avgVerbrauch;

    public Auto() {
    }

    public Auto(int kmStand, double maxTankinhalt) {
        this.kmStand = kmStand;
        this.maxTankinhalt = maxTankinhalt;
    }

    public Auto(int kmStand, double maxTankinhalt, double avgVerbrauch) {
        this.kmStand = kmStand;
        this.maxTankinhalt = maxTankinhalt;
        this.avgVerbrauch = avgVerbrauch;
    }

    public Auto(int kmStand, double maxTankinhalt, double tankinhalt, double avgVerbrauch) {
        this.kmStand = kmStand;
        this.maxTankinhalt = maxTankinhalt;
        this.tankinhalt = tankinhalt;
        this.avgVerbrauch = avgVerbrauch;
    }

    public double getKmStand() {
        return kmStand;
    }

    public void setKmStand(int kmStand) {
        this.kmStand = kmStand;
    }

    public double getMaxTankinhalt() {
        return maxTankinhalt;
    }

    public void setMaxTankinhalt(double maxTankinhalt) {
        this.maxTankinhalt = maxTankinhalt;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }

    public void setTankinhalt(double tankinhalt) {
        this.tankinhalt = tankinhalt;
    }

    public double getAvgVerbrauch() {
        return avgVerbrauch;
    }

    public void setAvgVerbrauch(double avgVerbrauch) {
        this.avgVerbrauch = avgVerbrauch;
    }

    public void fahren(double kilometer){
        if(tankinhalt<avgVerbrauch*(kilometer/100.0)){
            System.err.println("Ihr Tank hat nicht gereicht/ist leer, sie sind liegen geblieben!");
            kmStand = kmStand+(tankinhalt/avgVerbrauch)*100.0;
            System.exit(0);
        }else {
            tankinhalt = tankinhalt-avgVerbrauch*(kilometer/100.0);
            kmStand = kmStand+kilometer;
        }
    }

    public double ermittleGesamtverbrauch(){
        return maxTankinhalt-tankinhalt;
    }

    public void tanken(double liter){
        if(maxTankinhalt == tankinhalt){
            System.err.println("Ihr Tank ist bereits voll");
        } else if(maxTankinhalt <= tankinhalt+liter){
            System.err.println("Ihr tank ist voll, Sie haben " + Math.round(tankinhalt+liter-maxTankinhalt*100.0)/100.0 + "L zu viel getankt");
        }else {
            tankinhalt = tankinhalt+liter;
        }
    }

    public boolean isTankFastLeer(){
        if(tankinhalt<=5.0){
            return true;
        }
        return false;
    }

    public String fahrzeugdaten(){
        return "Kilometerstand: " + kmStand + "\nTankgroesse: " + maxTankinhalt + "\nTankinhalt: " + tankinhalt + "\nVerbrauch pro 100km: " + avgVerbrauch;
    }

    public String toString(){
        return "Kilometerstand: " + kmStand + "\nTankgroesse: " + maxTankinhalt + "\nTankinhalt: " + tankinhalt + "\nVerbrauch pro 100km: " + avgVerbrauch;
    }

}
