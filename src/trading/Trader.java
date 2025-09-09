package trading;

import model.Account;
import model.Customer;

public class Trader {

    private String traderId;
    private Customer customer;

    public Trader(String traderId, Customer customer) {
        this.traderId = traderId;
        this.customer = customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTraderId(String traderId) {
        this.traderId = traderId;
    }

    public String getTraderId() {
        return traderId;
    }

    public void showCustomerAccounts() {
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
