package HW1;

// метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в этой же ячейке.

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        // Массивы для примера
        int[] arr1 = {12, 8, 16};
        int[] arr2 = {4, 2, 4};

        int[] result = new int[arr1.length];
        // Проверка на равенство массивов
        if (arr1.length != arr2.length)
            result = new int[1];
        else         // Находим частное по индексам
            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i] / arr2[i];
            }
        System.out.println("Частное массивов: " + Arrays.toString(arr1) + " и " + Arrays.toString(arr2));
        System.out.println("Результат: " + Arrays.toString(result));
    }
}
