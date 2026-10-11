public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;
    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String toString() {
        return accountNumber + " | " + ownerName + " | " + balance;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Account))
            return false;
        Account a = (Account) obj;
        return accountNumber.equals(a.accountNumber);
    }
    public int hashCode() {
        return accountNumber.hashCode();
    }
}