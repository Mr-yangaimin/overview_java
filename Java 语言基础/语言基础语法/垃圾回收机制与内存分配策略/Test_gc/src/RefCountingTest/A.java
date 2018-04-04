package RefCountingTest;

public class A {
    private B bRef;

    public B getbRef() {
        return bRef;
    }

    public void setbRef(B bRef) {
        this.bRef = bRef;
    }
}
