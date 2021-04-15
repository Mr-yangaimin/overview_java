package com.example.test.constant;

import com.example.test.state.abst.AbstOrderState;
import com.example.test.state.order.*;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 16:00 2021/4/14
 * @ Description：订单状态枚举类
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public enum OrderState {

    NOTPAY(1,"未付款",new NotPayState()),PAYED(2,"已付款",new PayEdState()),
    WAITSHIP(3,"待发货",new WaitShipState()),ALREADYSHIP(4,"已发货",new AlreadyShipState()),
    REFUNDING(5,"退款中",new RefundingState()),REFUND(6,"退款成功",new RefundState()),
    REFUSEREFUND(7,"商家拒绝退款",new RefundRefusedState()), FIGHTING(8,"拼团购买中",new FightingState()),
    FIGHTFAILD(9,"拼团失败，人未齐",new FightingFailedState()),
    CANCELED(10,"用户取消订单",new CancledState()), ENDED(11,"交易完成",new EndedState());

    private int code;
    private String desc;
    private AbstOrderState state;

    OrderState(int code,String desc,AbstOrderState state){
        this.code = code;
        this.desc = desc;
        this.state = state;
    }

    public int getCode(){
        return this.code;
    }
    public String getDesc(){
        return this.desc;
    }
    public AbstOrderState getState(){return this.state;}

    public static AbstOrderState getStateByCode(int code) {
        OrderState[] imageFormatTypes = values();
        for (OrderState type : imageFormatTypes) {
            if (type.getCode() == code) {
                return type.getState();
            }
        }
        return null;
    }
}
