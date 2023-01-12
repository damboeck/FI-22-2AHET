package at.ac.htlstp.damb.schleifen;

public class Dreieck2 {

    public static void paintDreieck(int size) {
        // Bereich B1
        for (int i=0;i<size+1;i++) {
            System.out.print(" ");
        }
        System.out.println("^");
        // Bereich B2
        for (int z=0;z<size;z++) {
            for (int i=0;i<size-z;i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i=0;i<2*z+1;i++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }

        // Bereich B3
        System.out.print("<");
        for (int i=0;i<2*size+1;i++) {
            System.out.print("-");
        }
        System.out.println(">");
    }

    public static void main(String[] args) {
        for (int x=1;x<10;x++)
            paintDreieck(x);
    }
}
