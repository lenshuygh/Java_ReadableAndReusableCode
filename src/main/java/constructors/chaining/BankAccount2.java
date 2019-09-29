package constructors.chaining;

public class BankAccount2 {
    private double balance;
    private double interest;

    BankAccount2(){
        this(0);
    }

    BankAccount2(double balance){
        this(balance,0.01);
    }

    public BankAccount2(double balance, double interest) {
        if(balance < 0){
            throw new IllegalArgumentException("Starting balance cannot be less than 0");
        }
        if(interest < 0){
            throw new IllegalArgumentException("Interest rate cannot be less than 0");
        }
        this.balance = balance;
        this.interest = interest;
    }
}
