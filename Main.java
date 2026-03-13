public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alice", 500.0);
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(200.0);
        System.out.println("After deposit: " + acc.getBalance());    

        acc.withdraw(100.0);
        System.out.println("After withdrawal: " + acc.getBalance()); 

        
        try {
            acc.withdraw(9999.0);
        } catch (InvalidAmountException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}


