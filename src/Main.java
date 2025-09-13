import document.Contract;
import document.Document;
import document.Receipt;
import employee.BankEmployee;
import employee.Employee;
import employee.Manager;
import employee.Person;
import interfaces.IPrint;
import model.*;
import service.ReportGenerator;
import trading.Stock;
import trading.Trader;
import transaction.FinancialExchange;
import transaction.Loan;
import transaction.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FinancialInstitution financialInstitution = new FinancialInstitution("Institution Name", "Tbilisi");

        //Creating banks
        Bank bank = new Bank("Bank of Georgia");
        financialInstitution.addBank(bank);
        //Creating FinancialExchange
        FinancialExchange financialExchange = new FinancialExchange("Exchange name");
        financialInstitution.addFinancialExchange(financialExchange);
        // Create customers
        Customer customerAlice = new Customer("Alice", "C001");
        bank.addCustomer(customerAlice);

        Customer customerBob = new Customer("Bob", "C002");
        bank.addCustomer(customerBob);

        // Create accounts
        Account accountAlice = new Account();
        accountAlice.setAccountNumber("ACC001");
        accountAlice.setBalance(new BigDecimal("1000.0"));


        Account accountBob = new Account();
        accountBob.setAccountNumber("ACC002");
        accountBob.setBalance(new BigDecimal("500.0"));

        // Creating Credit card
        CreditCard creditCard = new CreditCard("C000111222", LocalDate.now(), "123");
        customerBob.addCreditCard(creditCard);

        //Creating Loan
        Loan loan = new Loan(customerAlice,new BigDecimal("500"),new BigDecimal("12.5"));
        customerAlice.addLoan(loan);

        //Creating Currency
        Currency currency = new Currency("USD","$");
        bank.addCurency(currency);

        // Creating models.CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount("ACC003", new BigDecimal("2000"), new BigDecimal("250"));

        //Creating models.SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("ACC004", new BigDecimal("1000"), new BigDecimal("12.5"));

        // Link accounts to customers
        customerAlice.addAccount(accountAlice);
        customerBob.addAccount(accountBob);

        // Add customers to bank
        bank.addCustomer(customerAlice);
        bank.addCustomer(customerBob);

        //Creating trading.Trader
        Trader trader = new Trader("0", customerBob);
        financialExchange.addTrader(trader);
        trader.showCustomerAccounts();

        //Creating trading.Stock
        Stock stockBog = new Stock("BOG", 100000, new BigDecimal("1200"));
        financialExchange.addStock(stockBog);
        BigDecimal netWorthBog = stockBog.getNetWorth();
        System.out.println("Net worth of bog is: " + netWorthBog);

        //Creating reportGenerator
        ReportGenerator reportGenerator = new ReportGenerator();

        //before everything
        reportGenerator.genererateCustomerReport(customerBob);

        // making transaction.Transaction
        Transaction transaction = new Transaction(accountAlice, accountBob, new BigDecimal("100.0"), "test");
        bank.addTransaction(transaction);


        //CheckingAcc limit amount = 750, overdraftlimit = 250. expected 1000.
        boolean overdraftActive = checkingAccount.isOverdraftInUse();
        System.out.println("Is overdraft in use: " + overdraftActive);

        //SavingsAcc amount after year
        BigDecimal amountAfterYear = savingsAccount.calculateTotalValue();
        System.out.println("Total amount after year of saving will be: " + amountAfterYear);

        //after everything
        reportGenerator.genererateCustomerReport(customerBob);

        System.out.println("Alice Accounts");
        customerAlice.printAccounts();




        //Inheritance
        System.out.println("------- Inheritance output ----------");
        Employee emp1 = new BankEmployee("George", "Cooper", 28, "E001", new BigDecimal("2000"));
        Employee emp2 = new Manager("Nika", "smith", 40, "E002", new BigDecimal("5000"));

        bank.addEmployee(emp1);
        bank.addEmployee(emp2);

        emp1.work();
        emp2.work();

        customerBob.move();

        Document document1 = new Contract("001",LocalDate.now(),"Alpha","Beta");
        Document document2 = new Receipt("002",LocalDate.now(),"Groceries",new BigDecimal("100"));

        System.out.println();
        System.out.println();

        //Interface methods
        document1.printDetails();
        document2.printDetails();

        customerBob.move();
        customerAlice.save();

        accountBob.save();

        document1.getCreatedTime();
        document2.getCreatedTime();

        loan.printMoneyTransfered();
        transaction.printMoneyTransfered();


        IPrint person = new Person("Giga","Tsitsagi", 21);
        IPrint bankEmployee = new BankEmployee("salome","smthng", 21, "E003", new BigDecimal("3000"));
        IPrint manager = new Manager("rati","smthng1", 21,"E004",new BigDecimal("5000"));

        reportGenerator.printDetails(person);
        reportGenerator.printDetails(bankEmployee);
        reportGenerator.printDetails(manager);
    }
}