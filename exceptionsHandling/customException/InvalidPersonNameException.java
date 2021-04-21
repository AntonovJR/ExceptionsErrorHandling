package exceptionsHandling.customException;

public class InvalidPersonNameException extends RuntimeException{

    public InvalidPersonNameException(String message){
        super(message);
    }
    public InvalidPersonNameException(String message, Exception cause){
        super(message,cause);
    }
}
