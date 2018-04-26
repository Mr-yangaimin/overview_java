package test.exception;

public class MyException extends RuntimeException{
    public MyException(){}

    public MyException(String mess){
        super(mess);
    }

    public MyException(String mess,Throwable throwable){
        super(mess,throwable);
    }
}
