package TestSerializable.TestRepeatSerializalbe;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        People people = new People();
        people.setName("single");

        ClassA classA = new ClassA(people);
        ClassB classB = new ClassB(people);

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\yanga\\Desktop\\obj.txt"));
        out.writeObject(classA);
        out.writeObject(classB);

        out.close();
    }
}
