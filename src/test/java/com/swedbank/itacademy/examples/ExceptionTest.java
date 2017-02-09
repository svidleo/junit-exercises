package com.swedbank.itacademy.examples;


import com.swedbank.itacademy.MyFirstUnit;
import org.junit.Test;

public class ExceptionTest {

    @Test(expected = IllegalArgumentException.class)
    public void testForExceptions1() {
        MyFirstUnit myUnit = new MyFirstUnit();

        myUnit.throwIllegalArgumentException();
    }
}
