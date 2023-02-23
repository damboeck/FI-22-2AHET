package at.ac.htlstp.damb.felder;

import java.util.Arrays;

public class Feld2 {

    public static double minArray(double[] x) {
        double min=x[0];
        for (int i=1;i<x.length;i++) {
            double akt = x[i];
            if (akt < min) min = akt;
        }
        return min;
    }

    public static double maxArray(double[] x) {
        double max=x[0];
        for (double aktual:x)
            if (aktual > max) max = aktual;
        return max;
    }

    public static double[] copyArray(double[] x){
        double[] ergebnis = new double[x.length];
        for (int i=0;i<x.length;i++)
            ergebnis[i] = x[i];
        return ergebnis;
    }

    public static void main(String[] args) {
        double[] R = {330,200,220,470,560,100};
        double[] A;
        System.out.println(Arrays.toString(R));
        // R = {300,400,500};
        System.out.println("Min = "+minArray(R));
        System.out.println("Max = "+maxArray(R));
        A=R;
        A[1] = 44;
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(R));
        A=copyArray(R);
        A[3] = 55;
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(R));
    }

}
