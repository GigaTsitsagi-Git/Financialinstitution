package models;

public class CheckingAccount {

    private Account base_account;
    private double overdraft_limit;

    public CheckingAccount(Customer customer, Account base_account, double overdraft_limit) {
        this.overdraft_limit = overdraft_limit;
        this.base_account = base_account;
        customer.addAccount(base_account);
    }

    public double getOverdraftLimit() {
        return overdraft_limit;
    }

    public void setOverdraftLimit(double overdraft_limit) {
        this.overdraft_limit = overdraft_limit;
    }

    public double getTotalAmount() {
        return (base_account.getBalance() + overdraft_limit);
    }
}
