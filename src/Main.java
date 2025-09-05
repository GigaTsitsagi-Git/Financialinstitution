import models.*;
import services.ReportGenerator;
import trading.Stock;
import trading.Trader;
import transaction.FinancialExchange;
import transaction.Transaction;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        FinancialInstitution financialInstitution = new FinancialInstitution("Institution Name", "Tbilisi");

        //Creating banks
        Bank bank = new Bank("Bank of Georgia");
        bank.setInstitution(financialInstitution);
        //Creating FinancialExchange
        FinancialExchange financialExchange = new FinancialExchange(financialInstitution,"Exchange name");
        // Create customers
        Customer customer_alice = new Customer("Alice", bank);

        Customer customer_bob = new Customer("Bob", bank);

        // Create accounts
        Account account_alice = new Account();
        account_alice.setAccountNumber("ACC001");
        account_alice.setBalance(1000.0);


        Account account_bob = new Account();
        account_bob.setAccountNumber("ACC002");
        account_bob.setBalance(500.0);

        Account checking_acc = new Account();
        checking_acc.setAccountNumber("ACC003");
        checking_acc.setBalance(750.0);

        Account savings_acc = new Account();
        savings_acc.setAccountNumber("ACC004");
        savings_acc.setBalance(2000.0);

        // Creating models.CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount(customer_alice, checking_acc, 250.0);

        //Creating models.SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(customer_bob, savings_acc, 12.5);

        // Link accounts to customers
        customer_alice.addAccount(account_alice);
        customer_bob.addAccount(account_bob);

        // Add customers to bank
        bank.add_customer(customer_alice);
        bank.add_customer(customer_bob);

        //Creating trading.Trader
        Trader trader = new Trader("0", customer_bob, financialExchange);
        trader.show_customer_accounts();

        //Creating trading.Stock
        Stock stock_bog = new Stock("BOG", 100000, 1200, financialExchange);
        BigDecimal net_worth_bog = stock_bog.get_net_worth();
        System.out.println("Net worth of bog is: " + net_worth_bog);

        //Creating reportGenerator
        ReportGenerator reportGenerator = new ReportGenerator();

        //before everything
        reportGenerator.genererateCustomerReport(customer_bob);

        // making transaction.Transaction
        Transaction transaction = new Transaction(account_alice, account_bob, 100.0, "test");


        //CheckingAcc limit amount = 750, overdraftlimit = 250. expected 1000.
        double total_amount = checkingAccount.getTotalAmount();
        System.out.println("Total amount is: " + total_amount);

        //SavingsAcc amount after year
        double amount_after_year = savingsAccount.get_savings_account_balance_after_year();
        System.out.println("Total amount after year of saving is: " + amount_after_year);

        //after everything
        reportGenerator.genererateCustomerReport(customer_bob);
    }
}