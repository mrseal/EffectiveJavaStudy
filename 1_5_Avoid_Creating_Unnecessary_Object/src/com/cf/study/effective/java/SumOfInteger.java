package com.cf.study.effective.java;

public class SumOfInteger {

    public static void main(final String[] args) {
        System.out.printf("Primitive Type: %.3fs%n", sumWithPrimitiveType());
        System.out.printf("Boxed Primitive Type: %.3fs%n", sumWithBoxedPrimitiveType());
        System.out.printf("Mixed Type: %.3fs%n", sumWithMixedType());
    }

    private static double sumWithPrimitiveType() {
        final double startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        final double endTime = System.currentTimeMillis();
        return (endTime - startTime) / 1000;
    }

    private static double sumWithBoxedPrimitiveType() {
        final double startTime = System.currentTimeMillis();
        Long sum = 0L;
        for (Long i = 0L; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        final double endTime = System.currentTimeMillis();
        return (endTime - startTime) / 1000;
    }

    private static double sumWithMixedType() {
        final double startTime = System.currentTimeMillis();
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        final double endTime = System.currentTimeMillis();
        return (endTime - startTime) / 1000;
    }

}
