package employee;

import model.Bank;

import java.math.BigDecimal;

public class BankEmployee extends Employee {

    public BankEmployee(String firstName, String lastName, int age, String employeeId, BigDecimal salary, Bank bank) {
        super(firstName, lastName, age, employeeId, salary, bank);
    }

    @Override
    public void work() {
        System.out.println("Bank employee " + firstName + " is serving customers at the bank counter");
    }
}
