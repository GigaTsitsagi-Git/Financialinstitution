package models;

public class FinancialInstitution {

    private int bankCount = 0;
    private String name;
    private String address;

    private Bank[] banks = new Bank[10];
    static private int institution_count = 0;

    public FinancialInstitution(String name, String address) {
        this.name = name;
        this.address = address;
        institution_count++;
    }

    public void addBank(Bank bank)
    {
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
