package constructors.chaining;

public class BankAccount {
    private double balance;
    private double interest;

    BankAccount(){

    }

    BankAccount(double balance){
        if(balance < 0){
            throw new IllegalArgumentException("Starting balance cannot be less than 0");
        }
        this.balance = balance;
    }

    public BankAccount(double balance, double interest) {
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
