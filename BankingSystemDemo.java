import java.util.*;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate = 0.05;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Savings Account.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient funds in Savings Account!");
        }
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    public void viewBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }
}

class CurrentAccount implements Account {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current Account.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account.");
        } else {
            System.out.println("Insufficient funds in Current Account!");
        }
    }

    public void calculateInterest() {
        System.out.println("Current Account has no interest.");
    }

    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added to bank.");
    }

    public void showAllAccounts() {
        for (Account acc : accounts) {
            acc.viewBalance();
        }
    }
}

public class BankingSystemDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();

        bank.addAccount(savings);
        bank.addAccount(current);

        savings.deposit(1000);
        savings.calculateInterest();
        savings.viewBalance();

        current.deposit(2000);
        current.withdraw(500);
        current.viewBalance();

        bank.showAllAccounts();
    }
}