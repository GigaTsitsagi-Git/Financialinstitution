package service;

import interfaces.IPrint;
import model.Account;
import model.Customer;

public class ReportGenerator {

    public void genererateCustomerReport(Customer customer) {
        System.out.println("--- Customer Report for " + customer.getName() + " ---");
        Account[] acc = customer.getAccounts();
        for (int i = 0; i < customer.getAccountCount(); i++) {
            System.out.println("Account: " + acc[i].getAccountNumber() + " | Balance: " + acc[i].getBalance());
        }
    }

    public void printDetails(IPrint print) {
        System.out.println("=== Printing Document ===");
        print.printDetails();  // Polymorphic call
        System.out.println("=========================");
    }

}
