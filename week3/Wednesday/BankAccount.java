package week3.Wednesday;

class BankAccount {
    int accNo;
    String accHolderName;
    double accBalance;

    public BankAccount(int accNo, String accHolderName) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accBalance = 0;
    }

    public BankAccount(int accNo, String accHolderName, double accBalance) {
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

    BankAccount getStatements() {
        System.out.println("The account Holder Name: " + this.accHolderName + "\nThe account type is "
                + this.getClass().getName());
        return new BankAccount(this.accNo, this.accHolderName);
    }

    BankAccount copy() {
        return new BankAccount(this.accNo, this.accHolderName, this.accBalance);
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
    SavingsAccount getStatements() {
        System.out.println("The account Holder Name: " + this.accHolderName + "\nThe account type is "
                + this.getClass().getName());
        return new SavingsAccount(this.accNo, this.accHolderName);
    }

    @Override
    SavingsAccount copy() {
        return new SavingsAccount(this.accNo, this.accHolderName, this.accBalance);
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
    CurrentAccount getStatements() {
        System.out.println("The account Holder is: " + this.accHolderName + "\nThe account type : "
                + this.getClass().getName());
        return new CurrentAccount(this.accNo, this.accHolderName);
    }

    @Override
    CurrentAccount copy() {
        return new CurrentAccount(this.accNo, this.accHolderName, this.accBalance);
    }
}

class Main {
    static BankAccount salaryAccount(int accNo, String accHolderName) {
        return new BankAccount(accNo, accHolderName) {
            int salary = 15000;
            int pfDeduction = 3000;
            static double incomeTaxRate = 15;

            public double getYearlyTax() {
                return salary * incomeTaxRate * 12 / 100;
            }

            public double getInHandSalary() {
                return (salary * 12) - getYearlyTax() - (pfDeduction * 12);
            }

            @Override
            public String toString() {
                System.out.println("Anonymous Salary Account : ");
                System.out.println("In hand salary : " + getInHandSalary());
                return super.toString() + "\nSalary : " + salary + "\nPF : " + pfDeduction;
            }
        };
    }

    public static void main(String[] args) {

        BankAccount bank = new BankAccount(78213, "Kaneko", 1500);
        SavingsAccount savings = new SavingsAccount(78214, "Nazuko", 2000);
        CurrentAccount current = new CurrentAccount(78215, "Orihime", 1000);

        System.out.println(bank.getStatements());
        System.out.println(savings.getStatements());
        System.out.println(current.getStatements());

    }
}