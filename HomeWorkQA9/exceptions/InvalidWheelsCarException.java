package exceptions;

public class InvalidWheelsCarException extends RuntimeException{
    public InvalidWheelsCarException (String massage){
        super(massage);
    }
}
