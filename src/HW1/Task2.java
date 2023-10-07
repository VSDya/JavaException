package HW1;

// Метод вызывающий исключение при делении на 0
public class Task2 {
    public static void main(String[] args) {
        testDivideByZero();
    }

    public static void testDivideByZero() {
        int numerator = 5;
        int denominator = 0;

        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        } else {
            double result = numerator / denominator;
            System.out.println(result);
        }
    }
}
