package at.ac.htlstp.damb.felder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Primfaktoren {

    public static Vector<Integer> primfakt(int x) {
        Vector<Integer> prims = new Vector<>();
        if (x<0)  x = -x;
        if (x==0) return prims;
        if (x==1) {
            prims.add(1);
            return prims;
        }
        // jetzt gehts los
        int d=2;
        while (x>1) {
            if (x%d==0) {
                prims.add(d);
                x/=d;
            } else {
                d++;
            }
        }
        return prims;
    }

    public static int produkt(int[] f) {
        int erg = 1;
        for (int x:f) erg *= x;
        return erg;
    }

    public static void assertEqualsAVoR(int[] f, Vector<Integer> g) {
        assertEquals(f.length, g.size());
        int[] fs = Arrays.copyOf(f,f.length);
        Arrays.sort(fs);
        int[] gs = new int[g.size()];
        for (int i=0;i<g.size();i++)
            gs[i] = g.get(i);
        Arrays.sort(gs);
        assertArrayEquals(fs,gs);
    }

    @Test
    public void testPrimfakt() {
        int[] f1 = {2,2,3,3,5,7};
        int[] f2 = {7,5,3,3,2,2};
        assertEquals(2*2*3*3*5*7,produkt(f1));
        assertEqualsAVoR(f1,primfakt(produkt(f1)));
        assertEqualsAVoR(f2,primfakt(produkt(f2)));
    }
}
