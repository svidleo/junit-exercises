package com.swedbank.itacademy.exercise;

import com.swedbank.itacademy.exception.NoSuchItemException;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FoodTesting {

    @Test
    public void testFridge() {
        Fridge fridge = new Fridge();

        fridge.put("cheese");
        assertEquals(true, fridge.contains("cheese"));
        assertEquals(false, fridge.put("cheese"));
        assertEquals(true, fridge.contains("cheese"));

        assertEquals(false, fridge.contains("ham"));

        fridge.put("ham");
        assertEquals(true, fridge.contains("cheese"));
        assertEquals(true, fridge.contains("ham"));

    }

    @Test(expected = NoSuchItemException.class)
    public void testNotExistProduct() throws NoSuchItemException {
        Fridge fridge = new Fridge();

        fridge.take("sausage");
    }

    @Test
    public void testPut() throws NoSuchItemException {
        Fridge fridge = new Fridge();
        List<String> food = new ArrayList<String>();
        food.add("yogurt");
        food.add("milk");
        food.add("eggs");
        for (String item : food) {
            fridge.put(item);
            assertEquals(true, fridge.contains(item));
            fridge.take(item);
            assertEquals(false, fridge.contains(item));
        }
    }
}
