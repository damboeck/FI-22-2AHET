package at.ac.htlstp.damb.verzweigungen;

import java.util.Scanner;

public class Alter {

    public static void main(String[] args) {
        int alter; // Alter der Person
        Scanner sc = new Scanner(System.in);

        System.out.print("Wie alt sind sie?");
        alter = sc.nextInt();

        // elseif-Kette!
        if (alter<6) {
            System.out.println("Du bist ein Baby!");
        } else if (alter<13) {
            System.out.println("Du bist ein Kind!");
        } else if (alter<18) {
            System.out.println("Du bist ein Teeny!");
        } else if (alter<60) {
            System.out.println("Sie sind erwachsen!");
        } else {
            System.out.println("Sie sind ein Pensionist!");
        }

        sc.close();
    }
}
