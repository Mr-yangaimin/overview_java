package test.exception;

public class Test_TryCatch {
    public static void main(String[] args){
        try{
            int x = 22/0;
        }catch (Exception e){
            System.out.println("捕获一个异常，不能除以 0");
        }
    }
}
