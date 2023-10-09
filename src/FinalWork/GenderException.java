package FinalWork;

public class GenderException extends Exception {
    public GenderException() {
        super("Введены некорректные данные для значения 'пол'");
    }
}
