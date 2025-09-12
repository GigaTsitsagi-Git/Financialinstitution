package trading;

import model.Customer;

public interface ITrader {

    void setCustomer(Customer customer);
    void setTraderId(String traderId);
    String getTraderId();
    void showCustomerAccounts();
}
