package com.example.test.lazy;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 20:02 2021/4/16
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public class SingleTonLock {

    private static volatile SingleTonLock instance= null;

    public SingleTonLock(){}

    public SingleTonLock getInstance(){
        if (instance == null){
            synchronized(this){
                //再次判断是为了防止有的线程醒来以后再次实例化
                //有可能其他线程已经实例化完成了
                if (instance == null){
                    instance = new SingleTonLock();
                }
            }
        }
        return instance;
    }
}
