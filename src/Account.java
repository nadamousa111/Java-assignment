public class Account extends Object {
    private double balance;
    private String AccountNumber;

    public Account() {
        this.balance = 0;
        this.AccountNumber = "";
    }

    public Account(double balance, String AccountNumber) {
        this.balance = balance;
        this.AccountNumber = AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    @Override
    public String toString() {

        return "Account{" + "balance=" + balance + ", AccountNumber=" + AccountNumber + '}';
    }

    public double withdraw(double money) {
        if (balance - money >= 0)
            return balance -= money;
        else {
            System.out.println("you do not have enough money in your account");
            return 0.0;
        }

    }

    public double deposit(double money) {
        return balance += money;
    }

}
