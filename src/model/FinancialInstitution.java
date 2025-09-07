package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class FinancialInstitution {

    private int bankCount = 0;
    private String name;
    private String address;
    private LocalDate registrationDate;
    private LocalDateTime lastUpdated;

    private Bank[] banks = new Bank[10];
    private static int institution_count = 0;

    public FinancialInstitution(String name, String address) {
        this.name = name;
        this.address = address;
        this.registrationDate = LocalDate.now();
        this.lastUpdated = LocalDateTime.now();
        institution_count++;
    }

    public void updateInstitution(String newAddress) {
        this.address = newAddress;
        this.lastUpdated = LocalDateTime.now();    // refresh timestamp
    }

    public void addBank(Bank bank) {
        if (bankCount == banks.length) {
            banks = Arrays.copyOf(banks, banks.length * 2);
        }
        banks[bankCount] = bank;
        bankCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }
}
