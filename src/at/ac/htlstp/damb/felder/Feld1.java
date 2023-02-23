package at.ac.htlstp.damb.felder;

public class Feld1 {

    public static void main(String[] args) {
        double[] R = new double[6];
        for (int i=0;i<R.length;i++) {
            System.out.printf("Feld[%d] = %5.2f\n",i,R[i]);
        }
        R[0] = 330;
        R[1] = 200;
        R[2] = 220;
        R[3] = 470;
        System.out.println("Nach der Berechnung:");
        for (int i=0;i<R.length;i++) {
            System.out.printf("Feld[%d] = %5.2f\n",i,R[i]);
        }
    }
}
