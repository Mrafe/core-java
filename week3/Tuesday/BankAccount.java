package week3.Tuesday;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Object");
        int n = scanner.nextInt();
        BankAccount[] bankArr = new BankAccount[n];
        SavingsAccount[] savingsArr = new SavingsAccount[n];
        CurrentAccount[] currentArr = new CurrentAccount[n];
        BankAccount[] salaryArr = new BankAccount[n];

        for (int i = 0; i < n; i++) {
            bankArr[i] = new BankAccount(2342 + i, "User" + i);
            savingsArr[i] = new SavingsAccount(2342 + i, "User" + i);
            currentArr[i] = new CurrentAccount(2342 + i, "User" + i);
            salaryArr[i] = salaryAccount(2342 + i, "User" + i);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(bankArr[i]);
            System.out.println(savingsArr[i]);
            System.out.println(currentArr[i]);
            System.out.println(salaryArr[i]);
        }

        SavingsAccount obj1 = new SavingsAccount(7192020, "Kaneko");
        SavingsAccount obj2 = obj1.copy();
        System.out.println(obj2);
        scanner.close();

        // BankAccount generalAcc = new BankAccount(7192020, "Kaneko");
        // SavingsAccount savingsAcc = new SavingsAccount(7192021, "Nezuko", 4000);
        // CurrentAccount currentAcc = new CurrentAccount(40, 7192022, "Mistuaa", 6000);

        // generalAcc.setAccBalance(2000);

        // System.out.println(generalAcc);

        // System.out.println(savingsAcc);
        // System.out.println("The interest accumulation of Nezuko is : " +
        // savingsAcc.getYearlyInterest());
        // System.out
        // .println("The interest accumulation of Nezuko over 5 years is : " +
        // savingsAcc.getComputedInterest(5));

        // System.out.println(currentAcc);
        // System.out.println("The yearly transaction of Mistuaa : " +
        // currentAcc.getYearlyTransaction());
        // System.out.println(
        // "The transaction amount of Mitsuaa for 90 days is : " +
        // currentAcc.getTotalTransactionAmount(90));

    }
}