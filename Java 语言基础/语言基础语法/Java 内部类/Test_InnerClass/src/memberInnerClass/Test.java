package memberInnerClass;

public class Test {
    public static void main(String[] args){
        OuterClass outerClass = new OuterClass();
        OuterClass.MyInnerClass myInnerClass = outerClass.new MyInnerClass();
        myInnerClass.sayHello();
    }
}
