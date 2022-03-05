package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecimalToRomanoTest {
    
    @Test
    public void testDecToRomano(){
        assertEquals("I", NumeroRomano.decToRomano(1));
        assertEquals("II", NumeroRomano.decToRomano(2));

        assertEquals("X", NumeroRomano.decToRomano(10));
        assertEquals("XV", NumeroRomano.decToRomano(15));

        assertEquals("C", NumeroRomano.decToRomano(100));
        assertEquals("CL", NumeroRomano.decToRomano(150));

        assertEquals("M", NumeroRomano.decToRomano(1000));
    }
}
