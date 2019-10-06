package classes.strongencapsulation;

public class KeepThingsAsPrivateAsPossible_Better {
    private String a;
    private String b;

    public void doSomething(){
        doAnotherThing();
    }

    //public void doAnotherThing() {
    private void doAnotherThing() {
        // ...
    }
/*
    This doesn't needs to be exposed

    public String getA(){
        return a;
    }*/
}
