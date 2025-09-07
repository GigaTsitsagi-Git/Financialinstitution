package trading;

import model.Account;
import model.Customer;
import transaction.FinancialExchange;

public class Trader {

    private String traderId;
    private Customer customer;

    public Trader(String traderId, Customer customer, FinancialExchange financialExchange) {
        this.traderId = traderId;
        this.customer = customer;
        financialExchange.addTrader(this);
    }

    public void set_customer(Customer customer) {
        this.customer = customer;
    }

    public void set_trader_id(String traderId) {
        this.traderId = traderId;
    }

    public String get_trader_id() {
        return traderId;
    }

    public void show_customer_accounts() {
        if (customer != null && customer.getAccounts() != null) {
            System.out.println("Accounts for customer " + customer.getName() + ":");
            Account[] acc = customer.getAccounts();
            for (int i = 0; i < customer.getAccountCount(); i++) {
                System.out.println(" - " + acc[i].getAccountNumber() + " : " + acc[i].getBalance());
            }
        } else {
            System.out.println("No customer or accounts found for this trader.");
        }
    }

}
