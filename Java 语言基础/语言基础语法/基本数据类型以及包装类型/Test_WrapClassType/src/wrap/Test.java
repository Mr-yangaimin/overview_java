package wrap;

public class Test {
    public static void main(String[] args){
        int age = 21;
//        Integer integer = new Integer(age);    //装箱
//        int num = integer.intValue();          //拆箱
        Integer integer = age;                  //自动装箱
        int num = integer;                      //自动拆箱
    }
}
