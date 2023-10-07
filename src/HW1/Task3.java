package HW1;

import java.text.NumberFormat;
import java.util.Locale;

// Метод вызывающий исключение при преобразовании строки в число
public class Task3 {
    public static void main(String[] args) {
        String input = "a";

        NumberFormat format = NumberFormat.getIntegerInstance(Locale.ENGLISH);

        try
        {
            Integer.parseInt(input);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number format exception: " + e.getMessage());
            System.out.println("The input cannot be converted to a number.");
        }
    }
}
