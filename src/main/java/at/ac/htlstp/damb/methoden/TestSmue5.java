package at.ac.htlstp.damb.methoden;

import org.junit.jupiter.api.Test;

import static at.ac.htlstp.damb.methoden.Smue5.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSmue5 {

    @Test
    public void test1() {
        assertTrue(isPos(5));
        assertFalse(isPos(0));
        assertFalse(isPos(-3));
    }

    @Test
    public void test2() {
        assertTrue(isNeg(-3));
        assertFalse(isNeg(0));
        assertFalse(isNeg(5));
    }

    @Test
    public void testNull() {
        assertTrue(isNull(0));
        assertTrue(isNull(0.));
        assertTrue(isNull(0.000000001,0.01));
        // TODO
        assertFalse(isNull(-4));
        assertFalse(isNull(6));
    }
}
