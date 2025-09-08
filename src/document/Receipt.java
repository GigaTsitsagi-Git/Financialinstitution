package document;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Receipt extends Documt {

    private String transactionId;
    private BigDecimal amount;

    public Receipt(String id, LocalDate date, String transactionId, BigDecimal amount) {
        super(id, date);
        this.transactionId = transactionId;
        this.amount = amount;
    }

    @Override
    public void printDetails() {
        System.out.println("Receipt ID: " + id + ", Date: " + date);
        System.out.println("Transaction: " + transactionId + ", Amount: " + amount);
    }
}
