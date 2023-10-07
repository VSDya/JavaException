package HW1;

// метод разности значений по индексам из двух массивов

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // Массивы для примера
        int[] arr1 = {4, 5, 6};
        int[] arr2 = {1, 2, 3, 4};
        // Находим разницу по индексам
        int[] result = new int[arr1.length];
        // Проверка на равенство массивов
        if (arr1.length != arr2.length)
            result = new int[1];
        else
            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i] - arr2[i];
            }
        System.out.println("Разница массивов: " + Arrays.toString(arr1) + " и " + Arrays.toString(arr2));
        System.out.println("Результат: " + Arrays.toString(result));
    }
}
