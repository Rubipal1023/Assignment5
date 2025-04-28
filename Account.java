class Account {
    double balance;

    void set(double b) {
        balance = b;
    }

    void show() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    void addInterest() {
        balance = balance + balance * 0.05;
    }
}

class CurrentAccount extends Account {
    void withdraw(double amt) {
        if (amt <= 10000 && amt <= balance) {
            balance = balance - amt;
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.set(1000);
        s.addInterest();
        s.show();

        CurrentAccount c = new CurrentAccount();
        c.set(5000);
        c.withdraw(2000);
        c.show();
    }
}
