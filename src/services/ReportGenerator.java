package services;

import models.Account;
import models.Customer;

public class ReportGenerator
{
    public void genererateCustomerReport(Customer customer)
    {
        System.out.println("--- models.Customer Report for " + customer.getName() + "---");
        Account[] acc = customer.getAccounts();
        for(int i = 0; i < customer.getAccountCount(); i++)
        {
            System.out.println("models.Account: " + acc[i].getAccountNumber() + " | Balance: " + acc[i].getBalance());
        }
    }

}
