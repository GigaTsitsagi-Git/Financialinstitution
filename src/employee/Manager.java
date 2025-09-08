package employee;

import model.Bank;

import java.math.BigDecimal;

public class Manager extends BankEmployee {

    public Manager(String firstName, String lastName, int age, String employeeId, BigDecimal salary, Bank bank) {
        super(firstName, lastName, age, employeeId, salary, bank);
    }

    @Override
    public void work() {
        System.out.println("Manager " + firstName + " is holding a team meeting");
    }
}
