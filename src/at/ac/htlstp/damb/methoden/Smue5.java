package at.ac.htlstp.damb.methoden;

public class Smue5 {

    /**
     * Bestimmt ob der angegebene Wert positiv ist
     * @param wert  Wert
     * @return      true wenn wert positiv ist
     */
    public static boolean isPos(double wert) {
        return wert>0;
    }

    /**
     * Bestimmt ob der angegebene Wert negativ ist
     * @param wert  Wert
     * @return      true wenn wert negativ ist
     */
    public static boolean isNeg(double wert) {
        return wert<0;
    }

    /**
     * Bestimmt ob der angegebene Wert Null ist
     * @param wert  Wert
     * @return      true wenn wert positiv
     */
    public static boolean isNull(double wert) {
        return wert == 0.;
    }

    public static boolean isNull(int wert) {
        return wert==0;
    }

    public static boolean isNull(double wert, double toleranz) {
        // TODO
        return false;
    }

}
