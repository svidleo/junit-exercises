package com.swedbank.itacademy.examples;


import com.swedbank.itacademy.MyFirstUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AssertEquals {
    @Test
    public void testConcatenate() {
        MyFirstUnit myUnit = new MyFirstUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);
    }
}
