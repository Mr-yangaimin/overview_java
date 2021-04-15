package com.example.test.service;

import com.example.test.model.Order;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 16:13 2021/4/14
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public interface OrderService {

    /**
     * 用户发起退款，流转当前订单到退款状态
     * @param order
     * @return
     */
    boolean refund(Order order);

    /**
     * 用户取消订单
     * @param order
     * @return
     */
    boolean cancle(Order order);
}
