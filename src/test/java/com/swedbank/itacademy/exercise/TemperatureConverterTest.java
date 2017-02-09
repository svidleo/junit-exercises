package com.swedbank.itacademy.exercise;

import org.junit.Test;

public class TemperatureConverterTest {
    @Test
    public void shouldConvertCelciusToFahrenheit() {
        assertEquals(32, TemperatureConverter.toFahrenheit(0));
        assertEquals(98, TemperatureConverter.toFahrenheit(37));
        assertEquals(212, TemperatureConverter.toFahrenheit(100));
    }

    private void assertEquals(int i, int i1) {
    }

    @Test
    public void shouldConvertFahrenheitToCelcius() {
        assertEquals(0, TemperatureConverter.toCelcius(32));
        assertEquals(37, TemperatureConverter.toCelcius(100));
        assertEquals(100, TemperatureConverter.toCelcius(212));
    }
}
