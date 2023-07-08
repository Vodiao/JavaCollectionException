package exceptions;

public class InvalidBrandCarException extends RuntimeException{

    public InvalidBrandCarException(String message){
        super(message);
    }
}
