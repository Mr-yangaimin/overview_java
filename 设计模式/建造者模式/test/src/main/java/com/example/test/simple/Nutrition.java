package com.example.test.simple;

import lombok.Data;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 21:29 2021/4/19
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
@Data
public class Nutrition {
    private int servingSize;// required
    private int servings;// required
    private int calories;// optional
    private int fat;// optional
    private int sodium;// optional
    private int carbohydrate;// optional

    public Nutrition(final int servingSize, final int servings) {
        this(servingSize, servings, 0, 0, 0, 0);
    }

    public Nutrition(final int servingSize, final int servings, final int calories) {
        this(servingSize, servings, calories, 0, 0, 0);
    }

    public Nutrition(final int servingSize, final int servings, final int calories, final int fat) {
        this(servingSize, servings, calories, fat, 0, 0);
    }

    public Nutrition(final int servingSize, final int servings, final int calories, final int fat, final int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public Nutrition(final int servingSize, final int servings, final int calories, final int fat, final int sodium, final int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
