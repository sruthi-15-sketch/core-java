class BankAccount {
    int accNo;
    String accHolderName;
    double accBalance;

    BankAccount() {
        accNo = 0;
        accHolderName = "";
        accBalance = 0.0;
    }

    BankAccount(int accNo, String accHolderName, double accBalance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
    }

    public BankAccount(int accNo, String accHolderName) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
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

    public void setAccHolderName(String accountHolder) {
        accHolderName = accountHolder;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String toString() {
        return "accNo is: " + accNo + "\nacc holder name is: " + accHolderName + " \naccount balance is: " + accBalance;
    }
}

class SavingsAccount extends BankAccount {
    static double rateOfInterest = 10;

    SavingsAccount(int accNo, String accHolderName) {
        super(accNo, accHolderName);
    }

    public double getRateOfInterest() {
        return rateOfInterest;

    }

    public double getYearlyInterest() {
        return ((getAccBalance() * getRateOfInterest()) / 100);

    }

    public double getComputedInterest(int years) {
        double res = getYearlyInterest();
        return res * years;
    }
}

class CurrentAccount extends BankAccount {
    double avgDailyTransaction;

    CurrentAccount() {
        super();
        this.avgDailyTransaction = 0.0;
    }

    CurrentAccount(int accNo, String accHolderName) {
        super(accNo, accHolderName);
    }

    public void setAvgDailyTransaction(double t) {
        avgDailyTransaction = t;
    }

    public double getAvgDailyTransaction() {
        return avgDailyTransaction;

    }

    public double getTotalTransactionAmount(int days) {
        return avgDailyTransaction * days;
    }

    public double getYearlyTransaction() {
        return getTotalTransactionAmount(365);
    }

    @Override
    public String toString() {

        return super.toString() + "\naverage daily transaction is: " + avgDailyTransaction;

    }
}

class AnonymousInnerClass {
    public static void main(String[] args) {
        BankAccount generalacc = new BankAccount(12567, "Sruthi", 2500000);
        CurrentAccount currentAcc = new CurrentAccount(173490, "Sruthi");
        SavingsAccount savingsAcc = new SavingsAccount(12567, "Sruthi");
        generalacc.setAccBalance(1000);
        System.out.println(generalacc);

        savingsAcc.setAccBalance(2000);
        System.out.println(savingsAcc);
        System.out.println("Yearly interest credited = " + savingsAcc.getYearlyInterest());
        System.out.println("Interest calculated = " + savingsAcc.getComputedInterest(2));

        currentAcc.setAvgDailyTransaction(1000);
        System.out.println(currentAcc);
        System.out.println("Yearly Transaction :" + currentAcc.getYearlyTransaction());
        System.out.println("Total Transaction :" + currentAcc.getTotalTransactionAmount(2));

    }
}