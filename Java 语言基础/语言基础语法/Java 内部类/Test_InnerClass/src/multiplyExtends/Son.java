package multiplyExtends;

public class Son {
    class Extends_Father extends Father{
    }

    class Extends_Mother extends Mother{
    }

    public void sayHello(){
        String father = new Extends_Father().powerFul;
        String mother = new Extends_Mother().wealthy;
        System.out.println("my father is:" + father + "my mother has:" + mother);
    }
}
