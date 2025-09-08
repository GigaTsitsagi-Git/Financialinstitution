package document;

import java.time.LocalDate;
import java.util.Date;

public class Contract extends Documt {

    private String partyA;
    private String partyB;

    public Contract(String id, LocalDate date, String partyA, String partyB) {
        super(id, date);
        this.partyA = partyA;
        this.partyB = partyB;
    }

    @Override
    public void printDetails() {
        System.out.println("Contract ID: " + id + ", Date: " + date);
        System.out.println("PartyA:" + partyA + ", PartyB: " + partyB);
    }
}
