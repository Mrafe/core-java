public class Account {
    String accountHolder;
    int balance;

    Account(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    protected void debit(int a) {
        if (a > balance) {
            System.out.println("Debit amount exceeded account balance");
        } else {
            balance -= a;
            System.out.println("The updated account balance is : " + balance);
        }
    }

    protected void credit(int a) {
        balance += a;
        System.out.println("Credited amount" + a);
        System.out.println("Updated account balance is : " + balance);
    }
}

class BankAccounts {
    public static void main(String[] args) {
        Account account1 = new Account("Nezuko Kamado", 50000);
        Account account2 = new Account("Rias Gremory", 85000);
        account1.debit(60000);
        account2.debit(65000);
        account1.credit(30000);
        account2.credit(50000);
    }
}