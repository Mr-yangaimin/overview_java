package com.example.test.state.order;

import com.example.test.constant.OrderState;
import com.example.test.model.Order;
import com.example.test.state.abst.AbstOrderState;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 16:59 2021/4/14
 * @ Description：已付款状态，只需要实现根自己相关的状态流转方法即可
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public class PayEdState extends AbstOrderState {

    @Override
    public boolean refund(Order order){
        //当前状态是已付款，目标状态是退款
        order.setOrderState(OrderState.REFUND.getCode());
        return true;
    }

    //当前状态是已付款，目标状态是取消订单状态，无法流转，异常的状态
    //无需重写，使用抽象基类默认实现，返回失败即可
//    @Override
//    public boolean cancle(Order order){
//        return false;
//    }

    @Override
    public String getState(){
        return OrderState.PAYED.getDesc();
    }
}
