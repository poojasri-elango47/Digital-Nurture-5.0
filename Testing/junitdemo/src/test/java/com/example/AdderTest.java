package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdderTest {
    @Test
    public void test(){
        Adder a=new Adder();
        assertEquals(5,a.add(2,3));
    }
}
