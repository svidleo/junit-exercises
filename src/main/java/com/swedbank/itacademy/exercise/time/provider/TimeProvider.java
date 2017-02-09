package com.swedbank.itacademy.exercise.time.provider;

import java.util.Calendar;

public interface TimeProvider {
    Calendar getTime();

    boolean isMorning();
}
