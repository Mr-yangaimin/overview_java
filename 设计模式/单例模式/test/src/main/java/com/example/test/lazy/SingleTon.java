package com.example.test.lazy;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 19:50 2021/4/16
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public class SingleTon {

    private static SingleTon instance= null;

    private SingleTon(){}

    public static SingleTon getInstance(){
        if(null == instance){
            instance = new SingleTon();
        }
        return instance;
    }
}
