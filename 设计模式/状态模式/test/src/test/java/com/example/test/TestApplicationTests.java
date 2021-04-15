package com.example.test;

import com.example.test.constant.OrderState;
import com.example.test.model.Order;
import com.example.test.service.OrderService;
import com.example.test.state.abst.AbstOrderState;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    public void test(){
        //初始化一个订单，默认未支付状态
        Order order = new Order();
        order.setOrderState(OrderState.NOTPAY.getCode());

        //我想退款
        AbstOrderState state = OrderState.getStateByCode(order.getOrderState());
        if (state.refund(order)){
            log.info("ok");
        }else {
            log.info("failed");
        }
    }
}
