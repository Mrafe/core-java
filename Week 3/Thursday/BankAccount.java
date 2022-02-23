
abstract class BankAccount {
    int accNo;
    String accHolderName;
    double accBalance;

    BankAccount(int accNo, String accHolderName) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accBalance = 0;
    }

    BankAccount(int accNo, String accHolderName, double accBalance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return String.format("The account number: %d%nThe account holder name: %s%nThe balance: %f%n%n", this.accNo,
                this.accHolderName, this.accBalance);
    }

}

class SavingsAccount extends BankAccount {
    static double rateOfInterest = 10;

    public static void setrateOfInterest(double rAteOfInterest) {
        rateOfInterest = rAteOfInterest;
    }

    SavingsAccount(int accNo, String accHolderName) {
        super(accNo, accHolderName);
    }

    SavingsAccount(int accNo, String accHolderName, double accBalance) {
        super(accNo, accHolderName, accBalance);
    }

    double getComputedInterest(int years) {
        return (accBalance * rateOfInterest * years) / 100;
    }

    double getYearlyInterest() {
        return this.getComputedInterest(1);
    }

    @Override
    public String toString() {
        return "Savings Account" + super.toString();
    }
}

class CurrentAccount extends BankAccount {
    int avgDailyTransaction;

    CurrentAccount(int avgDailyTransaction, int accNo, String accHolderName) {
        super(accNo, accHolderName);
        this.avgDailyTransaction = avgDailyTransaction;
    }

    CurrentAccount(int accNo, String accHolderName) {
        super(accNo, accHolderName);
    }

    CurrentAccount(int avgDailyTransaction, int accNo, String accHolderName, double accBalance) {
        super(accNo, accHolderName, accBalance);
        this.avgDailyTransaction = avgDailyTransaction;
    }

    CurrentAccount(int accNo, String accHolderName, double accBalance) {
        super(accNo, accHolderName, accBalance);
    }

    int getTotalTransactionAmount(int days) {
        return days * avgDailyTransaction;
    }

    int getYearlyTransaction() {
        return this.getTotalTransactionAmount(365);
    }

    @Override
    public String toString() {
        return "Current Account" + super.toString();
    }
}

class Main {

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(78214, "Nazuko", 2000);
        CurrentAccount current = new CurrentAccount(78215, "Orihime", 1000);

        System.out.println(savings);
        System.out.println(current);

    }
}