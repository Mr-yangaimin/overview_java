package test.exception;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        //分析完整的异常信息
        try {
            say();
        }catch (MyException e){
            e.printStackTrace();
        }

    }
    public static void say() throws MyException{
        throw new MyException("hello wrold failed",new RuntimeException());
    }
}
