package at.ac.htlstp.damb.oop;

public class ComplexMain {

    public static void main(String[] args) {
        Complex c,d,e;
        c = new Complex(1,2);
        d = new Complex(3);
        e = new Complex(1,45, true);
        System.out.println("c = "+c+"\nd = "+d+"\ne = "+e);
        System.out.println("Re(c) = "+c.getRe());
        e = Complex.add(c,d);
        System.out.println(c+" + "+d+ " = "+e);
        e = c.add(d);
        System.out.println(c+" + "+d+ " = "+e);
    }

}
