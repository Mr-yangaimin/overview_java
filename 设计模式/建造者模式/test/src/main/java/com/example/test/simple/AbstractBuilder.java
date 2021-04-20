package com.example.test.simple;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 21:10 2021/4/19
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public abstract class AbstractBuilder {

    protected Nutrition nutrition;

    public AbstractBuilder setServingSizeServings(int size,int servings){
        nutrition.setServingSize(size);
        nutrition.setServings(servings);
        return this;
    }
    public AbstractBuilder setCalories(int calories){
        nutrition.setCalories(calories);
        return this;
    }
    public AbstractBuilder setFat(int fat){
        nutrition.setFat(fat);
        return this;
    }
    public AbstractBuilder setSodium(int sodium){
        nutrition.setSodium(sodium);
        return this;
    }
    public AbstractBuilder setCarbohydrate(int carbohydrate){
        nutrition.setCarbohydrate(carbohydrate);
        return this;
    }

    public Nutrition build(){
        return nutrition;
    }
}
