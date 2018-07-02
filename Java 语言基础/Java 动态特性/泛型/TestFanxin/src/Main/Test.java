package Main;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        Integer[] integerArr = new Integer[2];
        Number[] numberArr = new Number[2];
        numberArr = integerArr;

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        numbers = integers;
    }

    //假设泛型允许 协变 操作
    public void test1(){
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        numbers = integers;//假设的前提下，编译器是能通过的
        //将一个浮点小数放入整型容器中是违反泛型的设计理念的
        numbers.add(23.5);
    }

    //测试通配符的使用
    public void test2(ArrayList<? extends Number> list){

    }

    //通配符的只读性
    public void test3(){
        ArrayList<Number> list = new ArrayList<>();
        ArrayList<?> arrayList = list;
        arrayList.add(32);
    }
}
