package model;

import exception.CurrencyNotSupportedException;
import exception.UnderageCustomerException;
import employee.Employee;
import transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;

    private List<Customer> customers;
    private List<Currency> currencies;
    private List<Transaction> transactions;
    private List<Employee> employees;

    public Bank(String name) {
        customers = new ArrayList<>();
        currencies = new ArrayList<>();
        transactions = new ArrayList<>();
        employees = new ArrayList<>();
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addCustomer(Customer customer) {
        if (customer.getAge() < 18) {
            throw new UnderageCustomerException("Customer must be at least 18 years old: " + customer.getAge());
        }
        customers.add(customer);
    }

    public void addCurrency(Currency currency) {
        currencies.add(currency);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void printEmployees() {
        if (employees.isEmpty()) {
            System.out.println("The list is empty");
        }
        for (Employee employee : employees) {
            if (employee == null) continue;
            System.out.println(employee);
        }
    }

    public final void printCurrencies() {
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

    public Employee getFirstEmployee() {
        return employees.getFirst();
    }

    public void removeCurrencyByIndex(int index) {
        if (index > currencies.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds Exception");
        }
        currencies.remove(index);
    }

    public Customer getCustomerByIndex(int index) {
        if (index > customers.size()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return customers.get(index);
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

    public String getName() {
        return name;
    }
}
