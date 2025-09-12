package model;

import java.math.BigDecimal;

public interface IAccount {

    String getAccountNumber();
    void setAccountNumber(String accountNumber);
    BigDecimal getBalance();
    void setBalance(BigDecimal balance);
}
