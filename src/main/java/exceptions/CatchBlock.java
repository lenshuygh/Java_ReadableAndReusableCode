package exceptions;

public class CatchBlock {
    public static void main(String[] args) {
        try{
            //isAdult(-1);
            isAdult2(-1);
        }catch (IllegalArgumentException ex){
            ex.printStackTrace();
            // idealy this should be a message to a logger
        }
    }

    private static void isAdult(int age) {
        if(age < 0){
            throw new IllegalArgumentException("Invalid Age");
        }
    }

    // better
    private static void isAdult2(int age){
        if(age < 0){
            throw new IllegalArgumentException("The age should be at least 0, age passed was: " + age);
        }
    }
}
