package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;



public class AAATest {
    Adder a;

    @Before
    public void setup(){
        a=new Adder();
        System.out.println("Object Created");
    }

    @After
    public void Complete(){
        System.out.println("Object work Completed");

    }

    @Test
    public void AAAtester1(){
        assertEquals(7,a.add(5,2));
    }

    @Test
    public void AAAtester2(){
        assertEquals(8,a.add(4,4));
    }
    
}
