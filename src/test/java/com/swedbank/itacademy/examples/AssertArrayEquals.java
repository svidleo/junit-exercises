package com.swedbank.itacademy.examples;


import com.swedbank.itacademy.MyFirstUnit;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AssertArrayEquals {
    @Test
    public void testGetTheStringArray() {
        MyFirstUnit myUnit = new MyFirstUnit();

        String[] expectedArray = {"one", "two", "three"};

        String[] resultArray =  myUnit.getTheStringArray();

        assertArrayEquals(expectedArray, resultArray);
    }
}
