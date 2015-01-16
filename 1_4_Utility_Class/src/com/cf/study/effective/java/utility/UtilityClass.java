package com.cf.study.effective.java.utility;

public class UtilityClass {

    // Only need to make the constructor private
    private UtilityClass() {
        // Throwing exception is not necessary, just in case somebody invoke the constructor inside this class by mistake
        throw new AssertionError();
    }

    public static int add(final int a, final int b) {
        return a + b;
    }

}
