package TestSerializable.TestDefinedSerializable;

import java.io.Serializable;

public class People implements Serializable {

    private transient String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException{
        s.defaultWriteObject();
        s.writeUTF(name);
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException{
        s.defaultReadObject();
        this.name = s.readUTF();
    }
}
