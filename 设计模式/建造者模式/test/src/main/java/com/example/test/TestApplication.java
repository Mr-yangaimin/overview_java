package com.example.test;

import com.example.test.simple.AbstractBuilder;
import com.example.test.simple.DefaultBuilder;
import com.example.test.simple.Nutrition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);

        Nutrition nutrition = new DefaultBuilder().setServingSizeServings(10, 20).setCalories(100).build();
    }
}
