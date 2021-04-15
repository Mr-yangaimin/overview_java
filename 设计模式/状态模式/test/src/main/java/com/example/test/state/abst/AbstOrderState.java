package com.example.test.state.abst;

import com.example.test.model.Order;
import lombok.extern.slf4j.Slf4j;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 17:05 2021/4/14
 * @ Description：抽象的订单状态基类
 * @ Modified By：yangaimin
 * @Version: $version$
 */
@Slf4j
public abstract class AbstOrderState {

    /**
     * 用户发起退款，流转当前订单到退款状态
     * @param order
     * @return
     */
    public boolean refund(Order order){
        log.info("无法从状态：{} 流转到退款状态",getState());
        return false;
    }

    /**
     * 用户取消订单
     * @param order
     * @return
     */
    public boolean cancle(Order order){
        log.info("无法从状态：{} 流转到取消订单状态",getState());
        return false;
    }

    /**
     * 模板方法，获取当前状态
     * @return
     */
    public abstract String getState();
}
