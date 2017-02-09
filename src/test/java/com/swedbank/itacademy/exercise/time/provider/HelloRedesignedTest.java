package com.swedbank.itacademy.exercise.time.provider;

import org.junit.Before;
import org.junit.Test;
import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HelloRedesignedTest {
    private HelloRedesigned hello;
    private TimeProvider timeProvider;

    @Before
    public void setUp() {
        timeProvider = mock(TimeProvider.class);
        hello = new HelloRedesigned(timeProvider);
    }


    @Test
    public void shouldSayGoodMorningInTheMorning() {
        when(timeProvider.getTime()).thenReturn(getCalendar(10));
        assertEquals("Good Morning!", hello.sayHello());
    }


    @Test

    public void shouldSayGoodAfternoonInTheAfternoon() {
        when(timeProvider.getTime()).thenReturn(getCalendar(14));
        assertEquals("Good Afternoon!", hello.sayHello());
    }

    private Calendar getCalendar(int hour) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, hour);
        return cal;
    }
}
