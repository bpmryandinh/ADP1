public class Bank {
    private String owner;
    private double balance;

    public Bank() {
        this.balance = 5.0;
        this.owner = "NO ACCOUNT NAME";
    }

    public Bank(String owner, double initialDeposit) {
        this.owner = owner;
        this.balance = initialDeposit;
    }

    public void dp(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        // this.balance = this.balance + amount;
    }

    @Deprecated
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        // this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount < this.balance) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }







    
}
