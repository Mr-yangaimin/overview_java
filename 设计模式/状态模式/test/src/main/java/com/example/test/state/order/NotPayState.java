package com.example.test.state.order;

import com.example.test.constant.OrderState;
import com.example.test.model.Order;
import com.example.test.state.abst.AbstOrderState;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 16:59 2021/4/14
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public class NotPayState extends AbstOrderState {

    @Override
    public boolean refund(Order order){
        //当前状态是未付款，目标状态是退款，直接成功
        return true;
    }

    @Override
    public boolean cancle(Order order){
        //当前状态是未付款，目标状态是取消订单，直接成功
        return true;
    }

    @Override
    public String getState() {
        return OrderState.NOTPAY.getDesc();
    }
}
