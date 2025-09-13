package model;

import interfaces.IMove;
import interfaces.IStorable;
import transaction.Loan;

import java.util.Arrays;

public class Customer implements IMove, IStorable {

    private String customerId;
    private int creditCardCount = 0;
    private int accountCount = 0;
    private int loanCount = 0;
    private String name;
    private Loan[] loans = new Loan[10];
    private Account[] accounts = new Account[10];
    private CreditCard[] creditCards = new CreditCard[10];

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountCount() {
        return accountCount;
    }

    public int getLoanCount() {
        return loanCount;
    }

    public Account getAccauntByAccountNumber(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public void addAccount(Account account) {
        if (accountCount == accounts.length) {
            accounts = Arrays.copyOf(accounts, accounts.length * 2);
        }
        accounts[accountCount] = account;
        accountCount++;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void printAccounts()
    {
        for(Account account : accounts)
        {
            if(account == null) continue;
            System.out.println(account);
        }
    }

    public void addCreditCard(CreditCard creditCard)
    {
        if(creditCardCount == creditCards.length)
        {
            creditCards = Arrays.copyOf(creditCards, creditCardCount * 2 );
        }
        creditCards[creditCardCount] = creditCard;
        creditCardCount++;
    }

    public CreditCard[] getCreditCards()
    {
        return creditCards;
    }

    public void addLoan(Loan loan) {
        if (loanCount == loans.length) {
            loans = Arrays.copyOf(loans, loans.length * 2);
        }
        loans[loanCount] = loan;
        loanCount++;
    }

    public Loan[] getLoans() {
        return loans;
    }

    public void printLoans()
    {
        for(Loan loan : loans)
        {
            System.out.println(loan);
        }
    }

    @Override
    public String toString() {
        return "Customer name: " + name + ", Accounts: " + accountCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer customer = (Customer) obj;
        return customerId != null && name.equals(customer.customerId);
    }

    @Override
    public int hashCode() {
        return customerId != null ? customerId.hashCode() : 0;
    }

    @Override
    public void move() {
        System.out.println("Customer Entered the Bank");
    }

    @Override
    public void save() {
        System.out.println("Saved the data into Bank DataBase");
    }
}
