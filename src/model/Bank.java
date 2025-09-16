package model;

import Exception.CurrencyNotSupportedException;
import Exception.UnderageCustomerException;
import employee.Employee;
import transaction.Transaction;

import java.util.Arrays;

public class Bank {

    private String name;

    private int customerCount = 0;
    private int currencyCount = 0;
    private int transactionCount = 0;
    private int employeeCount = 0;

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

    public void addCustomer(Customer customer) {
        if (customer.getAge() < 18) {
            throw new UnderageCustomerException("Customer must be at least 18 years old: " + customer.getAge());
        }
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

    public void addTransaction(Transaction transaction) {
        if (transactionCount == transactions.length) {
            transactions = Arrays.copyOf(transactions, transactions.length * 2);
        }
        transactions[transactionCount] = transaction;
        transactionCount++;
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee == null) continue;
            System.out.println(employee);
        }
    }

    public final void showCurrencies() {
        for (Currency currency : currencies) {
            System.out.println(currency);
        }
    }

    public void printCustomers() {
        for (Customer customer : customers) {
            if (customer == null) continue;
            System.out.println(customer);
        }
    }

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            if (transaction == null) continue;
            System.out.println(transaction);
        }
    }

    public void exchangeMoney(String currencyCode) {
        boolean found = false;
        for (Currency c : currencies) {
            if (c != null && c.getCODE().equals(currencyCode)) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new CurrencyNotSupportedException("Currency not supported " + currencyCode);
        }

        System.out.println("Exchanged into " + currencyCode);
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getCurrencyCount() {
        return currencyCount;
    }

    public String getName() {
        return name;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

}
