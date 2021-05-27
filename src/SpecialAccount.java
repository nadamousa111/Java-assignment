public class SpecialAccount extends Account {
    public SpecialAccount(double money,String accountNumber){
        this.setBalance(money);
        this.setAccountNumber(accountNumber);
    }
    @Override
    public double withdraw(double money) {
        if (getBalance()==0 && money<=1000 || getBalance()>0){
             setBalance(money);
             return getBalance();
        }
        return getBalance();
    }
}
