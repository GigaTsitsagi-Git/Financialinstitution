package employee;

import java.math.BigDecimal;

public class BankEmployee extends Employee {

    public BankEmployee(String firstName, String lastName, int age, String employeeId, BigDecimal salary) {
        super(firstName, lastName, age, employeeId, salary);
    }

    @Override
    public void work() {
        System.out.println("Bank employee " + getFirstName() + " is serving customers at the bank counter");
    }
}
