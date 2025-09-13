package model;

import employee.Employee;
import transaction.Transaction;

import java.util.Arrays;

public class Bank {

    private int customerCount = 0;
    private int currencyCount = 0;
    private int transactionCount = 0;
    private int employeeCount = 0;
    private String name;
    private Customer[] customers = new Customer[10];
    private Currency[] currencies = new Currency[10];
    private Transaction[] transactions = new Transaction[10];
    private Employee[] employees = new Employee[10];

    public Bank(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        if (employeeCount == employees.length) {
            employees = Arrays.copyOf(employees, customers.length * 2);
        }
        employees[customerCount] = employee;
        employeeCount++;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee == null) continue;
            System.out.println(employee);
        }
    }

    public void addCustomer(Customer customer) {
        if (customerCount == customers.length) {
            customers = Arrays.copyOf(customers, customers.length * 2);
        }
        customers[customerCount] = customer;
        customerCount++;
    }

    public void addCurrency(Currency currency) {
        if (customerCount == currencies.length) {
            currencies = Arrays.copyOf(currencies, currencies.length * 2);
        }
        currencies[customerCount] = currency;
        currencyCount++;
    }

    public final void showCurrencies() {
        for (Currency currency : currencies) {
            System.out.println(currency);
        }
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void printCustomers() {
        for (Customer customer : customers) {
            if (customer == null) continue;
            System.out.println(customer);
        }
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

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            if (transaction == null) continue;
            System.out.println(transaction);
        }
    }

}
