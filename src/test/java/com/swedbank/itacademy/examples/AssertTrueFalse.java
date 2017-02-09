package com.swedbank.itacademy.examples;

import com.swedbank.itacademy.MyFirstUnit;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class AssertTrueFalse {
    @Test
    public void testGetTheBoolean() {
        MyFirstUnit myUnit = new MyFirstUnit();

        assertTrue (myUnit.getBoolean());
        assertFalse(myUnit.getBoolean());
    }

}
