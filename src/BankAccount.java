public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(){
        balance = 0.0;
    }
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void deposit(double amount) throws InvalidAmountException{
        if(amount<=0){
            throw new InvalidAmountException("Invalid Amount");
        }
        balance = balance + amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException{
        if(amount >= balance){
            throw new InsufficientFundsException("Insufficient Fund");
        }
        if(amount <= 0){
            throw new InvalidAmountException("Invalid Amount");
        }
        balance = balance - amount;
    }
    public double getBalance() {
        return balance;
    }
}