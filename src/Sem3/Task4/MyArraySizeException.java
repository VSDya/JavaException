package Sem3.Task4;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException() {
        super("Массив размера не 4х4");
    }
}
