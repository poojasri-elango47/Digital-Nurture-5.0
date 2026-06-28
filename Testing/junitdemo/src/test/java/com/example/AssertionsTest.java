package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void Tester(){
        assertEquals(6,3+3);
        assertTrue(6>3);
        assertFalse(7>10);
        String val=null;
        assertNull(val);
        Object o=new Object();
        assertNotNull(o);

    }
    
}
