package TestSerializable.TestDefinedSerializable;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream
                (new FileOutputStream("C:\\Users\\yanga\\Desktop\\obj.txt"));
        People people = new People();
        people.setName("single");
        people.setAge(20);
        out.writeObject(people);

        ObjectInputStream in = new ObjectInputStream
                (new FileInputStream("C:\\Users\\yanga\\Desktop\\obj.txt"));

        People people1 = (People) in.readObject();
        System.out.println(people1.getName());
        System.out.println(people1.getAge());
        in.close();
        out.close();
    }
}
