package HW2;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");

        float number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Float.parseFloat(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введенный текст не является числом. Повторите попытку.");
            }
        }

        System.out.println("Ваше дробное число: " + number);
    }
}
