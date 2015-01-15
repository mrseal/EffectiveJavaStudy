package com.cf.study.effective.java.builder.pattern;

public class Main {

    public static void main(final String[] args) {
        final NutritionFacts instance = new NutritionFacts.Builder(260, 8).calories(29).fat(90).sodium(93).carbohydrate(12).build();
        System.out.println(instance);
    }

}
