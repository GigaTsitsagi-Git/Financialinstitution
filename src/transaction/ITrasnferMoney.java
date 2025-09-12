package transaction;

import java.math.BigDecimal;

public interface ITrasnferMoney {
    BigDecimal getAmount();
    void setAmount(BigDecimal amount);
    void printMoneyTransfered();
}
