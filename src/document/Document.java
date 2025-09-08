package document;

import java.time.LocalDate;

public abstract class Document {

    protected String id;
    protected LocalDate date;

    public Document(String id, LocalDate date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public abstract void printDetails();

    @Override
    public String toString() {
        return "Document id :" + id + "date=" + date;
    }
}
