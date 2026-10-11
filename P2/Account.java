class Account {
    private final String accountNumber;
    private String accountHolder;
    private long accountBalance;
    private boolean accountStatus;
    private static int accountCount = 1;
    static String generateAccountNumber() {
        return "AC" + String.format("%04d", accountCount++);
    }
    Account(String accountHolder) {
        this(accountHolder, 0);
    }
    Account(String accountHolder, long accountBalance) {
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        accountStatus = true;
        accountNumber = generateAccountNumber();
    }
    void deposit(long amount) {
        accountBalance += amount;
    }
    boolean withdraw(long amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }
    long getBalance() {
        return accountBalance;
    }
    String getAccountNumber() {
        return accountNumber;
    }
    String getOwnerName() {
        return accountHolder;
    }
    public static void main(String args[]) {
        Account account[] = new Account[3];
        account[0] = new Account("Rahul", 6000);
        account[1] = new Account("Priya", 3500);
        account[2] = new Account("Neha");
        account[0].deposit(1000);
        account[0].withdraw(2000);
        account[0].withdraw(9000);
        for (int index = 0; index < 3; index++) {
            System.out.println("Name : " + account[index].getOwnerName());
            System.out.println("Account No : " + account[index].getAccountNumber());
            System.out.println("Balance : " + account[index].getBalance());
            System.out.println();
        }
    }
}