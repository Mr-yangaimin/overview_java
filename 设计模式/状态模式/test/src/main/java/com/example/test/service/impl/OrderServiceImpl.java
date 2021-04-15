package com.example.test.service.impl;

import com.example.test.constant.OrderState;
import com.example.test.model.Order;
import com.example.test.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 16:14 2021/4/14
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public boolean refund(Order order) {
        boolean flag = true;
        //判断当前订单状态
        if (order.getOrderState() == OrderState.WAITSHIP.getCode() ||
                order.getOrderState() == OrderState.PAYED.getCode()){
            //如果是已付款、待发货，直接退款成功
            order.setOrderState(OrderState.REFUND.getCode());
        }else if (order.getOrderState() == OrderState.ALREADYSHIP.getCode() ||
                    order.getOrderState() == OrderState.ENDED.getCode()){
            //如果是已发货了或交易完成了，流转到退款中，等待商家审核
            order.setOrderState(OrderState.REFUNDING.getCode());
        }else {
            //其他状态都是异常状态，拒绝流转
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean cancle(Order order) {
        boolean flag = true;
        //判断当前状态
        if (order.getOrderState() == OrderState.NOTPAY.getCode()){
            //只有未付款状态可以取消订单
            order.setOrderState(OrderState.CANCELED.getCode());
        }else {
            flag = false;
        }
        return flag;
    }
}
