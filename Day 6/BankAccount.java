class BankAccount {
    int accNo;
    String accHolderName;
    int accBalance;

    public BankAccount(int accNo, String accHolderName, int accBalance) {
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

    public int getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return String.format("%n%nThe account number: %d%nThe account holder name: %s%nThe balance: %d", this.accNo,
                this.accHolderName, this.accBalance);
    }

}

class SavingsAccount extends BankAccount {
    static double rateOfInterest = 10;

    public static double getrateOfInterest() {
        return rateOfInterest;
    }

    public static void setrateOfInterest(double rAteOfInterest) {
        rateOfInterest = rAteOfInterest;
    }

    SavingsAccount(int accNo, String accHolderName, int accBalance) {
        super(accNo, accHolderName, accBalance);
    }

    double getYearlyInterest() {
        return (accBalance * rateOfInterest) / 100;
    }

    double getComputedInterest(int years) {
        return (accBalance * rateOfInterest * years) / 100;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

class CurrentAccount extends BankAccount {
    int avgDailyTransaction;

    CurrentAccount(int avgDailyTransaction, int accNo, String accHolderName, int accBalance) {
        super(accNo, accHolderName, accBalance);
        this.avgDailyTransaction = avgDailyTransaction;
    }

    int getYearlyTransaction() {
        return avgDailyTransaction * 365;
    }

    int getTotalTransactionAmount(int days) {
        return days * avgDailyTransaction;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

class Main {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount(7192020, "Kaneko", 137800);
        SavingsAccount obj2 = new SavingsAccount(7192021, "Nezuko", 234132);
        CurrentAccount obj3 = new CurrentAccount(2500, 7192022, "Mistuaa", 213321);

        System.out.println(obj1);

        System.out.println(obj2);
        System.out.println("The interest accumulation of Nezuko is : " + obj2.getYearlyInterest());
        System.out.println("The interest accumulation of Nezuko over 5 years is : " + obj2.getComputedInterest(5));

        System.out.println(obj3);
        System.out.println("The yearly transaction of Mistuaa : " + obj3.getYearlyTransaction());
        System.out.println("The transaction amount of Mitsuaa for 90 days is : " + obj3.getTotalTransactionAmount(90));
    }
}