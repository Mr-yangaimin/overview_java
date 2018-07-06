package Main;

public class Student extends Father implements Person{
    public void study(){
        System.out.println("i can study.....");
    }

    @Override
    public void speak() {
        System.out.println("i am a student,i can speak...");
    }

    @Override
    public void run() {
        System.out.println("i am a student,i can run.....");
    }
}
