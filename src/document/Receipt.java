package document;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Receipt extends Document {

    private String transactionMessage;
    private BigDecimal amount;

    public Receipt(String id, LocalDate date, String transactionMessage, BigDecimal amount) {
        super(id, date);
        this.transactionMessage = transactionMessage;
        this.amount = amount;
    }

    @Override
    public void printDetails() {
        System.out.println("Receipt ID: " + id + ", Date: " + date);
        System.out.println("Transaction: " + transactionMessage + ", Amount: " + amount);
    }
}
