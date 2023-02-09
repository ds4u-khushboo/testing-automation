package org.example.testcases;

import org.testng.annotations.Test;

import static org.junit.Assert.*;


public class TestCase {
    @Test
    public void assertion() {
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fine", str);

        //check for false condition
        assertFalse(num > 9);

        assertNotNull(num);

    }
}
