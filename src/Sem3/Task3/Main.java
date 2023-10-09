package Sem3.Task3;

// Создайте класс исключения, который будет выбрасываться при делении на 0. Исключение должно отображать
// понятное для пользователя сообщение об ошибке.
// Создайте класс исключения, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
// Исключение должно отображать понятное для пользователя сообщение об ошибке.
// Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. Исключение должно
// отображать понятное для пользователя сообщение об ошибке.

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws MyFileNotFoundException {
//        String[] arr = new String[1];
//        arr[0] = null;
//        try {
//            System.out.println(arr[0].length());
//        } catch (NullPointerException e){
//            throw new ArrNullPointerException(); // Нулевое значение в массиве
//        }

//        try {
//            FileReader reader = new FileReader("asd.txt");
////            System.out.println(reader.read());
//        } catch (FileNotFoundException e) {
//            throw new MyFileNotFoundException(); // Файл не существует
//        }
//
        try {
            int a = 10/0;
        } catch (ArithmeticException e){
            throw new DivisionByZeroException(); // Делить на 0 нельзя!
        }
    }
}
