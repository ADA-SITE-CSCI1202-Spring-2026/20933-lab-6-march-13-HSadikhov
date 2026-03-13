public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }

    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidAmountException(
                "Withdrawal amount $" + amount + " exceeds balance $" + balance
            );
        }
        balance -= amount;
    }
}