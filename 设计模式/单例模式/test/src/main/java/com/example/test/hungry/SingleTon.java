package com.example.test.hungry;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 19:41 2021/4/16
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public class SingleTon {

    private static final SingleTon instance = new SingleTon();

    public SingleTon(){}//置空构造器，不允许外部构造

    public SingleTon getInstance(){
        return this.instance;
    }
}
