public class BankMain {
    public static void main(String[] args) {
        
        Bank checking = new Bank();
        System.out.println(checking.getBalance());

        checking.deposit(100);
        System.out.println(checking.getBalance());
        
        checking.withdraw(20);
        System.out.println(checking.getBalance());

        Bank savings = new Bank("Savings", 1000.0);
        savings.withdraw(1000000);
        System.out.println(savings.getBalance());



    }

    
}
