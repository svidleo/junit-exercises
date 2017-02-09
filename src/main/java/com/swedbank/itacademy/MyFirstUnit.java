package com.swedbank.itacademy;



public class MyFirstUnit {
    public String concatenate(String one, String two){
        return one + two;
    }

    public String[] getTheStringArray() {
        String[] stringArray = {"one", "two", "three"};
        return stringArray;
    }

    public Boolean getBoolean() {
        return false;
    }

    public Object getObject() {
        return new Object();
    }

    public void throwIllegalArgumentException() {
        throw new IllegalArgumentException();
    }
}
