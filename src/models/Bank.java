package models;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private int customerCount = 0;
    private String name;
    private FinancialInstitution institution;
    private Customer[] customers = new Customer[10];

    public Bank(String name) {
        this.name = name;
    }

    public void setInstitution(FinancialInstitution institution) {
        this.institution = institution;
    }

    public void add_customer(Customer customer) {
        customers[customerCount] = customer;
        customerCount++;
    }

}
