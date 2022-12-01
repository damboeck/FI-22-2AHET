package at.ac.htlstp.damb.methoden;

public class MatheTools {

    /**
     * Vergleicht zwei Double Werte mit relativer Tolleranz
     * @param x          erster Wert
     * @param y          zweiter Wert
     * @param tolerance  relative Tolleranz in Prozent
     * @return           true wenn x ungefähr gleich y ist gemäß der Tolleranz
     */
    public static boolean equals(double x,double y,double tolerance){
        double e = Math.abs(x-y)/Math.max(Math.abs(x),Math.abs(y));
        return e<tolerance*0.01;
    }
}
