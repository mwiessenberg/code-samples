package nl.rabobank.crescendo;

public class Account {
    private final String accountNumber;
    private static int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withDraw(int amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                "balance='" + balance + '\'' +
                '}';
    }
}
