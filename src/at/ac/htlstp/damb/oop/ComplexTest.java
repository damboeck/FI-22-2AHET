package at.ac.htlstp.damb.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {

    @Test
    public void test1() {
        assertEquals(45.0,(new Complex(1,1)).getArgDegree());
    }

}
