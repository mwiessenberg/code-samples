package nl.rabobank.crescendo;

public class EvilStaticBankProgram {
    public static void main(String[] args) {
        Account account1 = new Account("1", 100);
        Account account2 = new Account("2", 100);

        // withdraw 25 from account 1
        account1.withDraw(25);

        printAccount(account1);
        printAccount(account2);
    }

    private static void printAccount(Account account1) {
        System.out.println(account1);
    }
}
