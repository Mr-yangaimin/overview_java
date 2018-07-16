package TestSerializable;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream
                (new FileOutputStream("C:\\Users\\yanga\\Desktop\\obj.txt"));

        People people = new People();
        people.setName("single");
        people.setAge(23);
        //序列化 People 对象
        out.writeObject(people);

        ObjectInputStream in = new ObjectInputStream
                (new FileInputStream("C:\\Users\\yanga\\Desktop\\obj.txt"));
        //反序列化 People 对象
        People p = (People) in.readObject();

        in.close();
        out.close();
        System.out.println(p.getName());
        System.out.println(p.getAge());


    }
}
