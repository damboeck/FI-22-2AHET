package at.ac.htlstp.damb.felder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sortieren {

    public static void sortArray(int[] f) {
        for (int left=0;left<f.length-1;left++)
            for (int right=left+1;right<f.length;right++) {
                if (f[left] > f[right]) {
                    // tauschen
                    int h = f[left];
                    f[left] = f[right];
                    f[right]= h;
                }
            }
    }

    public static void main(String[] args) {
        int[] feld = {10,3,5,8,4};
        System.out.println("origin:"+ Arrays.toString(feld));
        sortArray(feld);
        System.out.println("sorted:"+ Arrays.toString(feld));
    }

    public static void assertEqualsArray(int[] f, int[] g) {
        assertEquals(Arrays.toString(f), Arrays.toString(g));
    }

    @Test
    public void testSortArray() {
        int[] feld   = {10,3,5,8,4};
        int[] result = {3,4,5,8,10};
        int[] feld2  = {-3,6,-5,12,0};
        int[] result2= {-5,-3,0,6,12};
        sortArray(feld);
        assertEqualsArray(result,feld);
        sortArray(feld2);
        assertEqualsArray(result2,feld2);
    }
}
