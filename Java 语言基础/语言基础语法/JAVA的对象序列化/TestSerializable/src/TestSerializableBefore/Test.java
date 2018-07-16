package TestSerializableBefore;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(
                new FileOutputStream("C:\\Users\\yanga\\Desktop\\obj.txt"));
        People people = new People();
        people.setName("Yang");
        people.setAge(22);

        //写入 People 的 name 字段的值
        out.writeUTF(people.getName());
        //写入 People 的 age 字段的值
        out.writeInt(people.getAge());

        out.close();

        DataInputStream in = new DataInputStream(
                new FileInputStream("C:\\Users\\yanga\\Desktop\\obj.txt"));
        People peopleGet = new People();
        //读出 name 字段的值
        peopleGet.setName(in.readUTF());
        //读出 age 字段的值
        peopleGet.setAge(in.readInt());

        System.out.println(peopleGet.getName());
        System.out.println(peopleGet.getAge());
    }
}
