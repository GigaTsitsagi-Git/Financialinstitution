public class ReportGenerator
{
    public void genererate_customer_report(Customer customer)
    {
        System.out.println("--- Customer Report for " + customer.get_name() + "---");
        for(Account acc : customer.get_accounts())
        {
            System.out.println("Account: " + acc.get_account_number() + " | Balance: " + acc.get_balance());
        }
    }
    
}
