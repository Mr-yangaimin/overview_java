package com.example.test.methond.factory;

import com.example.test.methond.MethodFactory;
import com.example.test.methond.product.AirConditioning;
import com.example.test.methond.product.Refrigerator;
import com.example.test.methond.product.TV;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 16:48 2021/4/18
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public class HairFactory implements MethodFactory {

    @Override
    public Refrigerator createRefiger() {
        return null;
    }

    @Override
    public AirConditioning createAirConditioning() {
        return null;
    }

    @Override
    public TV createTV() {
        return null;
    }
}
