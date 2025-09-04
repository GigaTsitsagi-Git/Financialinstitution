package services;

import models.Account;
import models.Customer;

public class ReportGenerator
{
    public void genererate_customer_report(Customer customer)
    {
        System.out.println("--- models.Customer Report for " + customer.get_name() + "---");
        for(Account acc : customer.get_accounts())
        {
            System.out.println("models.Account: " + acc.get_account_number() + " | Balance: " + acc.get_balance());
        }
    }

}
