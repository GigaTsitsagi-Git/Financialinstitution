package model;

import employee.Employee;
import transaction.Transaction;

public interface IBank {

    public void addEmployee(Employee employee);
    public Employee[] getEmployees();
    public void printEmployees();
    public void addCustomer(Customer customer);
    public Customer[] getCustomers();
    public void printCustomers();
}
