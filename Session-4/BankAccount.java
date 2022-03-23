class Accounts {
    int balance;
    String accountHolder;

    Accounts(int balance, String accountHolder) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public void debit(int withdraw_amount) {
        if (withdraw_amount > balance) {
            System.out.println("Debit amount exceeded account balance");
        } else {
            balance -= withdraw_amount;
            System.out.println("Balance Amount: " + balance);
        }
    }

    public void credit(int withdraw_amount) {
        balance += withdraw_amount;
        System.out.println("After credit balance Amount: " + balance);
    }
}

class BankAccount {
    public static void main(String args[]) {
        Accounts o1 = new Accounts(100000, "Sruthi");
        Accounts o2 = new Accounts(200000, "Vishal");
        o1.debit(1000000);
        o2.debit(50000);
        o1.credit(30000);
        o2.credit(1000000);

    }
}