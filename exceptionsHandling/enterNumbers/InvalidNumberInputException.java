package exceptionsHandling.enterNumbers;

public class InvalidNumberInputException extends RuntimeException {
    public InvalidNumberInputException(String message) {
        super(message);
    }
}
