public class BankAccount {
    private int accountNumber, overDraftAttempts;
    private double balance;

    public BankAccount(int a, double b) {
        System.out.println("Creating an account...");
        this.accountNumber = a;
        this.balance = b;
        this.overDraftAttempts = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double b) {
        this.balance = b;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Balance updated");
    }

    public void withdraw(double amount) {
        System.out.print("Processing.");
        System.out.println("..");
        if(amount > this.balance) {
            if(overDraftAttempts == 0) {
                System.out.println("No funds available");
                System.out.print("You're only getting: $");
                System.out.println(this.balance);
                this.setBalance(0.0);
                this.overDraftAttempts++;
            }
            else {
                System.out.println("I can't lent you money");
                this.overDraftAttempts++;
            }
        } else {
            System.out.println("One moment");
            this.setBalance(this.balance - amount - 1);
        }
    }
}