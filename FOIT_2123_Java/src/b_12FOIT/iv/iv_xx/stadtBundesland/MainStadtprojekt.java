package b_12FOIT.iv.iv_xx.stadtBundesland;

public class MainStadtprojekt {
    public static void main(String[] args) {
        Bundesland he = new Bundesland("Hessen", 6290000);
        Bundesland rp = new Bundesland("Rheinland-Pfalz", 4086000);
        Bundesland nrw = new Bundesland("Nordrhein-Westfalen", 17970000);

        Stadt wi = new Stadt("Wiesbaden", 278600, he);
        Stadt f = new Stadt("Frankfurt", 749421, he);
        Stadt ko = new Stadt("Koblenz", 113638, rp);
        Stadt k = new Stadt("Köln", 1100000, nrw);
        Stadt d = new Stadt("Düsseldorf", 619477, nrw);
        Stadt si = new Stadt("Siegen", 100000, nrw);
        Stadt mz = new Stadt("Mainz", 217556, rp);

        he.setHauptstadt(wi);
        rp.setHauptstadt(mz);
        nrw.setHauptstadt(d);

        System.out.println(wi.toString());
        System.out.println("*".repeat(50));
        System.out.println(f.toString());
        System.out.println("*".repeat(50));
        System.out.println(ko.toString());
        System.out.println("*".repeat(50));
        System.out.println(k.toString());
        System.out.println("*".repeat(50));
        System.out.println(d.toString());
        System.out.println("*".repeat(50));
        System.out.println(si.toString());
        System.out.println("*".repeat(50));
        System.out.println(mz.toString());
    }
}
