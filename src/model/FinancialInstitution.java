package model;

import transaction.FinancialExchange;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class FinancialInstitution {

    private static int institutionCount = 0;

    private int bankCount = 0;
    private int financialExchangeCount = 0;
    private String name;
    private String address;
    private LocalDate registrationDate;
    private LocalDateTime lastUpdated;

    private Bank[] banks = new Bank[10];
    private FinancialExchange[] financialExchanges = new FinancialExchange[10];

    public FinancialInstitution(String name, String address) {
        this.name = name;
        this.address = address;
        this.registrationDate = LocalDate.now();
        this.lastUpdated = LocalDateTime.now();
        institutionCount++;
    }

    public void updateInstitution(String newAddress) {
        this.address = newAddress;
        this.lastUpdated = LocalDateTime.now();    // refresh timestamp
    }

    public void addFinancialExchange(FinancialExchange financialExchange) {
        if (financialExchangeCount == financialExchanges.length) {
            financialExchanges = Arrays.copyOf(financialExchanges, financialExchanges.length * 2);
        }
        financialExchanges[financialExchangeCount] = financialExchange;
        financialExchangeCount++;
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
        lastUpdated = LocalDateTime.now();
    }

    public String getName() {
        return this.name;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setAddress(String address) {
        this.address = address;
        lastUpdated = LocalDateTime.now();
    }

    public String getAddress() {
        return this.address;
    }
}
