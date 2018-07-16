package TestSerializable.TestRepeatSerializalbe;

import java.io.Serializable;

public class ClassB implements Serializable {
    private People people;

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public ClassB(People people){
        this.people = people;
    }
}
