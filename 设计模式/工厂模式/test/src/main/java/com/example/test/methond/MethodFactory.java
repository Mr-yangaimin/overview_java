package com.example.test.methond;

import com.example.test.methond.product.AirConditioning;
import com.example.test.methond.product.Refrigerator;
import com.example.test.methond.product.TV;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 16:12 2021/4/18
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public interface MethodFactory {

    //生产一个冰箱
    Refrigerator createRefiger();

    //生产一个空调
    AirConditioning createAirConditioning();

    //生产一个 TV
    TV createTV();
}
