package Exceptions;

public class UnderageCustomerException extends RuntimeException {
    public UnderageCustomerException(String message) {
        super(message);
    }
}
