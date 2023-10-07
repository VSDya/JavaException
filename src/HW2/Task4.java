package HW2;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите текст: ");

        String text;
        while (true) {
            try {
                text = scan.nextLine();
                if (!text.isEmpty()) break;

                System.err.printf("Ошибка: пустую строку вводить нельзя.%n");
            } catch (IllegalArgumentException ex) {
                System.err.printf("%s%n", ex.getMessage());
            }
        }

        System.out.printf("Вы ввели: " + text);
    }
}
