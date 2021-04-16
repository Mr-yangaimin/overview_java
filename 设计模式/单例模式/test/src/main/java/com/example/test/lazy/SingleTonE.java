package com.example.test.lazy;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 20:26 2021/4/16
 * @ Description：${description}
 * @ Modified By：yangaimin
 * @Version: $version$
 */
public class SingleTonE {

    public static SingleTonE getInstance(){
        return SingleTonEnum.SINGLETON.getInstance();
    }

    private enum SingleTonEnum{
        SINGLETON;

        private SingleTonE instance;

        SingleTonEnum(){
            instance = new SingleTonE();
        }

        public SingleTonE getInstance(){
            return this.instance;
        }
    }
}
