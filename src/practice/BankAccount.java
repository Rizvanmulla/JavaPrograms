package practice;
class BankAccount {
    // Private data members to protect access
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter and Setter methods for encapsulation
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }


// Main class to test BankAccount
 public static void main(String[] args) {
        // Creating an account instance
        BankAccount account = new BankAccount("John Doe", "123456789", 5000.0);
        
        // Display initial balance
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit and Withdraw
        account.deposit(120);
        account.withdraw(1500);

        // Display updated balance
        System.out.println("Updated Balance: " + account.getBalance());
    }
 }
 
