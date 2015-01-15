package com.cf.study.effective.java.builder.pattern;

// Builder Pattern
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    private NutritionFacts(final Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static class Builder {
        private final int servingSize;
        private final int servings;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(final int servingSize, final int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(final int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(final int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(final int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(final int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            if (sodium == 0) {
                throw new IllegalStateException("Sodium must not be 0");
            }
            return new NutritionFacts(this);
        }

    }

    @Override
    public String toString() {
        return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories + ", fat=" + fat + ", sodium="
                + sodium + ", carbohydrate=" + carbohydrate + "]";
    }

}
