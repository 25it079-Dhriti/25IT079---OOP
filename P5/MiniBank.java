abstract class Account {
    long accountNumber;
    String holderName;
    long balance;
    Account(long accountNumber, String holderName, long balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    abstract double interestRate();
    abstract boolean canWithdraw(long amount);
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Account {
    long minBalance;
    SavingsAccount(long accountNumber, String holderName, long balance, long minBalance) {
        super(accountNumber, holderName, balance);
        this.minBalance = minBalance;
    }
    @Override double interestRate() {
        return 4.0;
    }
    @Override boolean canWithdraw(long amount) {
        return balance - amount >= minBalance;
    }
}
class CurrentAccount extends Account {
    long overdraftLimit;
    CurrentAccount(long accountNumber, String holderName, long balance, long overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override double interestRate() {
        return 0.0;
    }
    @Override boolean canWithdraw(long amount) {
        return balance - amount >= -overdraftLimit;
    }
}
class FixedDepositAccount extends Account {
    FixedDepositAccount(long accountNumber, String holderName, long balance) {
        super(accountNumber, holderName, balance);
    }
    @Override double interestRate() {
        return 7.0;
    }
    @Override boolean canWithdraw(long amount) {
        return false;
    }
}
public class MiniBank {
    public static void main(String[] args) {
        Account[] accounts = {
                new SavingsAccount(101, "Krisha", 50000, 10000),
                new CurrentAccount(102, "Rahul", 20000, 15000),
                new FixedDepositAccount(103, "Priya", 100000)
        };
        for (Account account : accounts) {
            account.display();
            System.out.println("Interest Rate: " + account.interestRate() + "%");
            if (account instanceof FixedDepositAccount fd) {
                System.out.println("Special: Fixed Deposit is locked.");
                System.out.println("Withdrawal allowed: " + fd.canWithdraw(1000));
            }
            System.out.println("----------------------------");
        }
        long amount = 45000;
        for (Account account : accounts) {
            System.out
                    .println(account.holderName + " withdrawing Rs. " + amount + " -> " + account.canWithdraw(amount));
        }
    }
}