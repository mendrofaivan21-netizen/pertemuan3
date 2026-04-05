public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0; // saldo awal
    }

    // Getter (HANYA ownerName dan balance)
    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    // Method deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Jumlah deposit harus lebih dari 0!");
        } else {
            balance += amount;
            System.out.println("Deposit berhasil!");
        }
    }

    // Method withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Jumlah harus lebih dari 0!");
        } else if (amount > balance) {
            System.out.println("Error: Saldo tidak cukup!");
        } else {
            balance -= amount;
            System.out.println("Penarikan berhasil!");
        }
    }
} 
