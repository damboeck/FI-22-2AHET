package at.ac.htlstp.damb.felder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelderTests {

    double[] f1 = {4,7,12.5,-3,8,-9,6};
    double[] f2 = {3,6,4,1,9,0,5};

    @Test
    public void testMinArray() {
        assertEquals(-9,Feld2.minArray(f1));
        assertEquals(0,Feld2.minArray(f2));
    }

    @Test
    public void testCopyArray() {
        double[] c;
        c=Feld2.copyArray(f1);
        assertEquals(c.length,f1.length);
        for (int i=0;i<f1.length;i++)
            assertEquals(c[i],f1[i]);
        c[1]=333;
        assertEquals(7,f1[1]);
    }
}
