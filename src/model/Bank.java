package model;

import transaction.Transaction;

public class Bank {

    private int customerCount = 0;
    private int transactionCount = 0;
    private String name;
    private FinancialInstitution institution;
    private Customer[] customers = new Customer[10];
    private Transaction[] transactions = new Transaction[10];

    public Bank(String name) {
        this.name = name;
    }

    public void setInstitution(FinancialInstitution institution) {
        this.institution = institution;
    }

    public void addCustomer(Customer customer) {
        customers[customerCount] = customer;
        customerCount++;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void addTransaction(Transaction transaction) {
        transactions[transactionCount] = transaction;
        transactionCount++;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }
}
