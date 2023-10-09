package Sem3.Task3;

import java.io.FileNotFoundException;

public class MyFileNotFoundException extends FileNotFoundException {

    public MyFileNotFoundException() {
        super("Файл не существует");
    }

    public MyFileNotFoundException(String message) {
        super(message);
    }
}
