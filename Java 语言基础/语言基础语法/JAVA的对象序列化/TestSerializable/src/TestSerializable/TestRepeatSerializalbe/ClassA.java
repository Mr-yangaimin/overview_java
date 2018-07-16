package TestSerializable.TestRepeatSerializalbe;

import java.io.Serializable;

public class ClassA implements Serializable{
    private People people;

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public ClassA(People people){
        this.people = people;
    }
}
