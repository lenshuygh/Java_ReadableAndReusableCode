package methods;

public class Conditionals {
    public static void main(String[] args) {
        boolean doorClosed = false;

        //before
        if(!doorClosed  == false){
            System.out.println("true");
        }

        //after
        boolean isDoorOpen = true;

        if(isDoorOpen){
            System.out.println("true");
        }
    }
}
