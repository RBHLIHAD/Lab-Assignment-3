abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Savings Account. New balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current Account. New balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Current Account!");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        savings.deposit(500);
        savings.withdraw(300);

        BankAccount current = new CurrentAccount(2000);
        current.deposit(1000);
        current.withdraw(2500);
    }
}