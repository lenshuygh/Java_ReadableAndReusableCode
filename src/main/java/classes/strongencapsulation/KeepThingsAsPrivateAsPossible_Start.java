package classes.strongencapsulation;

public class KeepThingsAsPrivateAsPossible_Start {
    private String a;
    private String b;
    public void doSomething(){
        doAnotherThing();
    }

    public void doAnotherThing() {
        // ...
    }

    public String getA(){
        return a;
    }
}
