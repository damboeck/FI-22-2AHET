package at.ac.htlstp.damb.methoden;

public class TestMatheTools {

    public static void TesteEquals(double x, double y, double tol, boolean ergebnis) {
        //System.out.printf("%f=%f mit tol.%f %b=%b\n",x,y,tol,MatheTools.equals(x,y,tol),ergebnis);
        boolean berechnet = MatheTools.equals(x,y,tol);
        if (berechnet!=ergebnis) {
            System.out.printf("Fehler bei Vergleich von %f=%f mit %f Tolleranz %b statt %b\n",x,y,tol,berechnet,ergebnis);
        }
    }

    public static void main(String[] args) {
        TesteEquals(5,6,1,false);
        TesteEquals(5,5.001,1,true);
        TesteEquals(0.00001,0.00001*1.009,1,true);
        TesteEquals(0.00001,0.00001*1.011,1,false);
        TesteEquals(5,7,1,true);
        //System.out.printf("%f=%f mit tol.%f %b=%b\n",5.,6.,1.,MatheTools.equals(5,6,1),false);
        //System.out.printf("%f=%f mit tol.%f %b=%b\n",5.,5.0001,1.,MatheTools.equals(5,5.0001,1),true);
        System.out.println("fertig");
    }

}
