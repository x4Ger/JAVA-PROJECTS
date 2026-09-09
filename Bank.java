public class Bank {

    public static void main(String[] args) {

        Account account1 = new savingsAccount("Seth", 10000);
        Account account2 = new checkingAccount("Russel", 20000);
        Account account3 = new premiumSavingsAccount("Vince", 5000);

        System.out.println(account1.user + " Interest: " + account1.calculateInterest());
        System.out.println(account2.user + " Interest: " + account2.calculateInterest());
        System.out.println(account3.user + " Interest: " + account3.calculateInterest());
        
    }
}

class Account {
    String user;
    int balance;
    Account(String user, int balance) {
        this.user = user;
        this.balance = balance;
    }

    double calculateInterest() {
        return 0;
    }

}

class savingsAccount extends Account {
    savingsAccount(String user, int balance) {
        super(user, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.02;
    }
}

class checkingAccount extends Account {
    checkingAccount(String user, int balance) {
        super(user, balance);
        }

    @Override
    double calculateInterest() {
        return balance * 0.02;
    }

    double overdraftFee() {
        return balance < 0 ? 35.0 : 0.0;
    }
}

class premiumSavingsAccount extends savingsAccount {
    premiumSavingsAccount(String user, int balance) {
        super(user, balance);
    }

    @Override
    double calculateInterest() {
        return super.calculateInterest() * 2;
     }
}