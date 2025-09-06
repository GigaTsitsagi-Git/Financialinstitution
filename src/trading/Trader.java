package trading;

import model.Account;
import model.Customer;
import transaction.FinancialExchange;

public class Trader {
    private String trader_id;
    private Customer customer;
    private FinancialExchange financialExchange;

    public Trader(String trader_id, Customer customer, FinancialExchange financialExchange) {
        this.financialExchange = financialExchange;
        this.trader_id = trader_id;
        this.customer = customer;
        financialExchange.addTrader(this);
    }

    public void set_customer(Customer customer) {
        this.customer = customer;
    }

    public void set_trader_id(String trader_id) {
        this.trader_id = trader_id;
    }

    public String get_trader_id() {
        return trader_id;
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
