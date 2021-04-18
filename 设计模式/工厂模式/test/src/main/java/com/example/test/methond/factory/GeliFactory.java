package com.example.test.methond.factory;

import com.example.test.methond.MethodFactory;
import com.example.test.methond.product.*;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 16:48 2021/4/18
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public class GeliFactory implements MethodFactory {

    @Override
    public Refrigerator createRefiger() {
        return new GeliRefrigerator();
    }

    @Override
    public AirConditioning createAirConditioning() {
        return new GeliAirConditioning();
    }

    @Override
    public TV createTV() {
        return new GeliTV();
    }
}
