package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.ExternalApi;

public class MyServiceTest {
    @Test
    public void Testing(){
        ExternalApi mock=Mockito.mock(ExternalApi.class);
        when(mock.GetData()).thenReturn("Mock Data");
        MyService ser=new MyService(mock);
        String result=ser.FetchData();
        verify(mock).GetData();
        assertEquals("Mock Data",result);
    }
}
