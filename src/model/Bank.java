package model;

import transaction.Loan;
import transaction.Transaction;

import java.util.Arrays;

public class Bank {

    private int customerCount = 0;
    private int transactionCount = 0;
    private String name;
    private Customer[] customers = new Customer[10];
    private Transaction[] transactions = new Transaction[10];


    public Bank(String name, FinancialInstitution financialInstitution) {
        this.name = name;
        financialInstitution.addBank(this);
    }

    public void addCustomer(Customer customer) {
        if (customerCount == customers.length) {
            customers = Arrays.copyOf(customers, customers.length * 2);
        }
        customers[customerCount] = customer;
        customerCount++;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void addTransaction(Transaction transaction) {
        if (transactionCount == transactions.length) {
            transactions = Arrays.copyOf(transactions, transactions.length * 2);
        }
        transactions[transactionCount] = transaction;
        transactionCount++;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }



}
