package test.exception;

public class Test_tryCatchFinally {
    public static void main(String[] args){
//        int result = test1();
//        int result = test2();
//        int result = test3();
        int result = test4();
        System.out.println(result);
    }

    public static int test1(){
        int i = 1;
        try{
            i++;
            System.out.println("try block, i = "+i);
        }catch(Exception e){
            i ++;
            System.out.println("catch block i = "+i);
        }finally{
            i = 10;
            System.out.println("finally block i = "+i);
        }
        return i;
    }

    public static int test2(){
        int i = 1;
        try{
            i++;
            throw new Exception();
        }catch(Exception e){
            i--;
            System.out.println("catch block i = "+i);
        }finally{
            i = 10;
            System.out.println("finally block i = "+i);
        }
        return i;
    }

    public static int test3(){
        //try 语句块中有 return 语句时的整体执行顺序
        int i = 1;
        try{
            i++;
            System.out.println("try block, i = "+i);
            return i;
        }catch(Exception e){
            i++;
            System.out.println("catch block i = "+i);
            return i;
        }finally{
            i++;
            System.out.println("finally block i = "+i);
        }
    }

    public static int test4(){
        //finally 语句块中有 return 语句
        int i = 1;
        try{
            i++;
            System.out.println("try block, i = "+i);
            return i;
        }catch(Exception e){
            i++;
            System.out.println("catch block i = "+i);
            return i;
        }finally{
            i++;
            System.out.println("finally block i = "+i);
            return i;
        }
    }
}
