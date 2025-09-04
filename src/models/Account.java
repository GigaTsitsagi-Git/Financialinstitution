package models;

public class Account
{
    private String _account_number;
    private double _balance;



    public String get_account_number()
    {
        return _account_number;
    }
    public void set_account_number(String accountNumber)
    {
        _account_number = accountNumber;
    }
    public double get_balance()
    {
        return _balance;
    }
    public void set_balance(double balance)
    {
        _balance = balance;
    }
}
