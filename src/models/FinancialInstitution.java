package models;

public class FinancialInstitution
{
    private String _name;
    private String _address;

    static private int institution_count = 0;

    public FinancialInstitution(String name, String address)
    {
        _name = name;
        _address = address;
        institution_count++;
    }

    public void set_name(String name)
    {
        _name = name;
    }
    public String get_name()
    {
        return  _name;
    }

    public void set_address(String address)
    {
        _address = address;
    }
    public String get_address()
    {
        return  _address;
    }
}
