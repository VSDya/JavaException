package Sem3.Task3;

public class DivisionByZeroException extends ArithmeticException{
    public DivisionByZeroException(String message){
        super(message);
    }
    public DivisionByZeroException(){
        super("Делить на 0 нельзя!");
    }
}
