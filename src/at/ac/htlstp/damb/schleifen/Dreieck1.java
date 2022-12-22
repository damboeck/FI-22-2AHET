package at.ac.htlstp.damb.schleifen;

public class Dreieck1 {

    public static void dreieck(int size) {
        for (int i=0;i<(size+2);i++){
            System.out.print("*");
        }
        System.out.println();
        for (int z=4;z>0;z--) {
            for (int s=0;s<z;s++) {
                if (s==z-1)
                    System.out.print("/");
                else if (s==0)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        dreieck(3);
    }
}
