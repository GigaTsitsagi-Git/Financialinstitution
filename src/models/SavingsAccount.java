package models;

public class SavingsAccount {

    private Account base_account;
    private double intereset_rate = 0.1;

    public SavingsAccount(Customer customer, Account _base_account, double _intereset_rate) {
        this.intereset_rate = _intereset_rate;
        this.base_account = _base_account;
        customer.addAccount(_base_account);
    }

    public void setInteresetRate(double _intereset_rate) {
        this.intereset_rate = _intereset_rate;
    }

    public double getInteresetRate() {
        return intereset_rate;
    }

    public double get_savings_account_balance_after_year() {
        double sum = base_account.getBalance() + (base_account.getBalance() * intereset_rate);
        base_account.setBalance(sum);
        return sum;
    }
}
