package Sem3.Task4;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(){
        super("В ячейке лежит символ или текст вместо числа: ");
    }
    public MyArrayDataException(int i, int j){
        super(String.format("В ячейке [%d][%d] лежит символ или текст вместо числа.", i, j));
    }
}
