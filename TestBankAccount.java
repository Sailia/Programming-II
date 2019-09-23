public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100923, 2000.00);
        System.out.println("Balance: " + ba1.getBalance());
        ba1.deposit(25.0);
        System.out.println("Balance: " + ba1.getBalance());
        ba1.withdraw(300.00);
        ba1.withdraw(50.00);
        System.out.println("Balance: " + ba1.getBalance());
        System.out.println();

        BankAccount ba2 = new BankAccount(100924, 50.00);
        ba2.deposit(253.00);
        ba2.withdraw(325.00);
        ba2.withdraw(25.00);
        System.out.println("Balance: " + ba2.getBalance());
    }
}