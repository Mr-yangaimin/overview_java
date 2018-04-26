package test.exception;

public class Test_throw {
    public static void main(String[] args){
//        try{
//            calculate(22,0);
//        }catch (MyException e){
//            System.out.println("捕获一个异常");
//            e.printStackTrace();
//        }

    }

    public static void calculate(int x,int y){
        if (y == 0)
            throw new MyException("除数为 0");
        int z = x/y;
    }

    public static void calculate2(int x,int y) throws ArithmeticException{
        int z = x/y;
    }
}
