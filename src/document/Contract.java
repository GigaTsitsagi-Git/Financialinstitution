package document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Contract extends Document {

    private String partyA;
    private String partyB;

    public Contract(String id, LocalDate date, String partyA, String partyB) {
        super(id, date);
        this.partyA = partyA;
        this.partyB = partyB;
    }

    @Override
    public void printDetails() {
        System.out.println("Contract ID: " + getId() + ", Date: " + getDate());
        System.out.println("PartyA:" + partyA + ", PartyB: " + partyB);
    }

    @Override
    public LocalTime getCreatedTime() {
        return LocalTime.now();
    }
}
