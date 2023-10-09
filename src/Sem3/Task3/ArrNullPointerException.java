package Sem3.Task3;

public class ArrNullPointerException extends NullPointerException{

    public ArrNullPointerException() {
        super("Обращение к пустому экземпляру");
    }

    public ArrNullPointerException(String message) {
        super(message);
    }
}
