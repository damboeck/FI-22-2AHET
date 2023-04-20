package at.ac.htlstp.damb.oop;

/**
 * Klasse für eine komplexe Zahl. Die Klasse wird als immutable Objekt realisiert.
 */
public class Complex {

    /** Der Realteil der komplexen Zahl */
    private double re;

    /** Imaginärteil der komplexen Zahl */
    private double im;

    /**
     * Erzeugt aus Real und Imaginärteil eine komplexe Zahl
     * @param re der Realteil
     * @param im der Imaginärteil
     */
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(double re) {
        this.re = re;
        this.im = 0;
    }

    public Complex(double abs, double arg, boolean degree) {
        double a = degree ? arg*Math.PI/180d : arg;
        re = abs*Math.cos(a);
        im = abs*Math.sin(a);
    }

    @Override
    public String toString() {
        String ret = re+"+"+im+"j";
        if (isImag()) ret = im+"j";
        if (isReal()) ret = re+"";
        if (isNull()) ret = "0";
        return ret;
    }

    /** @return prüft ob die Zahl rein Imaginär ist*/
    public boolean isImag() {
        // TODO realisiere als relative Prüfung
        return re==0 && im!=0;
    }

    /** @return prüft ob die Zahl rein Reell ist */
    public boolean isReal() {
        return re!=0 && im==0;
    }

    /** @return prüft ob die Zahl Null ist */
    public boolean isNull() {
        return re==0 && im==0;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return this.im;
    }

    public double getAbs() {
        return Math.sqrt(Math.pow(re,2)+Math.pow(im,2));
    }

    public double getArg() {
        return Math.atan2(im,re);
    }

    public double getArgDegree() {
        return getArg()*180d/Math.PI;
    }

    public static Complex add(Complex x, Complex y) {
        return new Complex(x.re+y.re, x.im+y.im);
    }

    public Complex add(Complex c) {
        return new Complex(this.re+c.re, this.im+c.im);
    }

    public Complex neg() {
        return new Complex(-re,-im);
    }

    public Complex sub(Complex c) {
        return this.add(c.neg());
    }

}
