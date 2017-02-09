package com.swedbank.itacademy.examples;


import com.swedbank.itacademy.MyFirstUnit;
import org.junit.Test;

public class ExceptionTest {

    public void testForExceptions1() {
        MyFirstUnit myUnit = new MyFirstUnit();

        myUnit.throwIllegalArgumentException();
    }
}
