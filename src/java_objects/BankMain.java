package java_objects;

public class BankMain {

    public static void main(String[] args) {

        
        BankAccount account1 =
                new BankAccount("001", "Deborah", 20000);

        BankAccount account2 =
                new BankAccount("002", "Alice", 5000);

        BankAccount account3 =
                new BankAccount("003", "John", 70000);

        
        System.out.println("ACCOUNT 1");
        account1.displayAccountDetails();

        System.out.println("ACCOUNT 2");
        account2.displayAccountDetails();

        System.out.println("ACCOUNT 3");
        account3.displayAccountDetails();

        
        System.out.println("\n--- Deposit ---");
        account1.deposit(5000);
        account1.displayAccountDetails();

        
        System.out.println("\n--- Withdrawal ---");
        account2.withdraw(1000);
        account2.displayAccountDetails();

        
        System.out.println("\n--- Change Name ---");
        account3.setAccountHolderName("John Smith");
        account3.displayAccountDetails();

        
        System.out.println("\n--- Invalid Withdrawal ---");
        account2.withdraw(10000);

        
        System.out.println("\n--- Getters ---");
        System.out.println("Account Number: "
                + account1.getAccountNumber());

        System.out.println("Account Holder: "
                + account1.getAccountHolderName());

        System.out.println("Balance: "
                + account1.getBalance());
    }
}
    

