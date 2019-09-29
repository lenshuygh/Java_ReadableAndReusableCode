package exceptions;

public class AvoidingExceptionsInTheFinallyBlock {
    public static void main(String[] args) {
        try{
            int result = 1/0;
        } finally {
            cleanup();
        }
    }

    private static void cleanup(){
        // this exception is displayed because its in the finally block, it hides the real ArithmeticException for division by 0
        throw new IllegalStateException();
    }

    /*

    use Java 7's try-with-resources to lose the finally block.... (needs to implement closeable??)


     */
}
