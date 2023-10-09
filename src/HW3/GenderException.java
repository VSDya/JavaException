package HW3;

public class GenderException extends Exception {
    public GenderException() {
        super("Введены некорректные данные для значения 'пол'");
    }
}
