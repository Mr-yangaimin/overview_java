package com.example.test.simple;


import com.example.test.simple.product.AirConditioning;
import com.example.test.simple.product.Refrigerator;
import com.example.test.simple.product.TV;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 16:18 2021/4/18
 * @ Description：简单工厂的默认实现
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public class DefaultSimpleFactory implements SimpleFactory{

    @Override
    public Refrigerator createRefiger() {
        return new Refrigerator();
    }

    @Override
    public AirConditioning createAirConditioning() {
        return new AirConditioning();
    }

    @Override
    public TV createTV() {
        return new TV();
    }
}
