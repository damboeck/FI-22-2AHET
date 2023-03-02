package at.ac.htlstp.damb.felder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Feld3 {

    /**
     * Löscht ein Feldelement an der Position pos aus dem Feld
     * heraus und gibt das neue Feld als Ergebnis zurück
     * @param feld Original-Feld
     * @param pos  Position welche gelöscht werden soll
     * @return     neues Feld
     */
    public static int[] removeArray(int[] feld, int pos) {
        int[] ergebnis = new int[feld.length-1];
        for (int i=0;i<ergebnis.length;i++) {
            ergebnis[i] = feld[i<pos?i:i+1];
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        int[] f={3,5,7,2,9,10};
        int[] g=removeArray(f,3);
        System.out.println(Arrays.toString(f)+" - "+Arrays.toString(g));
    }

    @Test
    public void testRemoveArray(){
        int[] f ={3,5,7,2,9,10};
        int[] fr={3,5,7,9,10};
        int[] g =removeArray(f,3);
        assertEquals(Arrays.toString(fr),Arrays.toString(g));
    }
}
