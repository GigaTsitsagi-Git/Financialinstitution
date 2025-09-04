import models.*;
import services.ReportGenerator;
import trading.Stock;
import trading.Trader;
import transaction.Transaction;

import java.math.BigDecimal;

public class Main
{
    public static void main(String[] args)
    {
        FinancialInstitution fi = new FinancialInstitution("models.Bank of Georgia", "Tbilisi");

        Bank bank = new Bank();
        bank.set_institution(fi);

        // Create customers
        Customer customer_alice = new Customer();
        customer_alice.set_name("Alice");

        Customer customer_bob = new Customer();
        customer_bob.set_name("Bob");

        // Create accounts
        Account account_alice = new Account();
        account_alice.set_account_number("ACC001");
        account_alice.set_balance(1000.0);


        Account account_bob = new Account();
        account_bob.set_account_number("ACC002");
        account_bob.set_balance(500.0);

        Account checking_acc = new Account();
        checking_acc.set_account_number("ACC003");
        checking_acc.set_balance(750.0);

        Account savings_acc = new Account();
        savings_acc.set_account_number("ACC004");
        savings_acc.set_balance(2000.0);

        // Creating models.CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount(customer_alice,checking_acc,250.0);

        //Creating models.SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(customer_bob,savings_acc,12.5);

        // Link accounts to customers
        customer_alice.add_account(account_alice);
        customer_bob.add_account(account_bob);

        // Add customers to bank
        bank.add_customer(customer_alice);
        bank.add_customer(customer_bob);

        // Add accounts to bank
        bank.add_account(account_alice);
        bank.add_account(account_bob);

        //Creating trading.Trader
        Trader trader = new Trader("0", customer_bob);
        trader.show_customer_accounts();

        //Creating trading.Stock
        Stock stock_bog = new Stock("BOG", 100000, 1200);
        BigDecimal net_worth_bog = stock_bog.get_net_worth();
        System.out.println("Net worth of bog is: " + net_worth_bog);

        //Creating reportGenerator
        ReportGenerator reportGenerator = new ReportGenerator();

        //before everything
        reportGenerator.genererate_customer_report(customer_bob);

        // making transaction.Transaction
        Transaction transaction = new Transaction(account_alice,account_bob,100.0,"test");



        //CheckingAcc limit amount = 750, overdraftlimit = 250. expected 1000.
        double total_amount = checkingAccount.get_total_amount();
        System.out.println("Total amount is: " + total_amount);

        //SavingsAcc amount after year
        double amount_after_year = savingsAccount.get_savings_account_balance_after_year();
        System.out.println("Total amount after year of saving is: " + amount_after_year);

        //after everything
        reportGenerator.genererate_customer_report(customer_bob);
    }
}