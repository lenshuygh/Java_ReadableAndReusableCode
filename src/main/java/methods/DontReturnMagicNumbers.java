package methods;

public class DontReturnMagicNumbers {
    static  int balance;

    private static int withdraw(int amount){
        if (amount < balance){
            return -1;
        }else{
            balance -= amount;
            return 0;
        }
    }

    private static void betterWithdraw(int amount)throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }

    public static void main(String[] args) throws InsufficientFundsException {
        //with magic number
        if(withdraw(100) == -1){
            //what does the -1 mean here?
        }
        //without magic number
        betterWithdraw(100);
    }

    private static class InsufficientFundsException extends Exception {
    }
}
