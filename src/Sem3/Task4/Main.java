package Sem3.Task4;

// Напишите метод, на вход которого подается двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException. Далее метод должен
// пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива
// преобразование не удалось (например в ячейке лежит символ или текст вместо числа), должно быть брошено
// исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
// В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
// MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали корректный массив).
public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        String[][] array1 = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        String[][] array2 = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "hihi", "4"}};

//        System.out.println(arrSum(array));
//        System.out.println(arrSum(array1));
//        System.out.println(arrSum(array2));

        // Обработчик исключений
        try {
            System.out.println(arrSum(array)); // 40
            System.out.println(arrSum(array1)); // Массив размера не 4х4
            System.out.println(arrSum(array2)); // В ячейке [3][2] лежит символ или текст вместо числа.
        } catch (MyArrayDataException | MyArraySizeException e){
            System.out.println(e.getMessage());
        }
    }

    private static int arrSum(String[][] arr){
        if (arr.length != 4 || arr[0].length != 4)
            throw new MyArraySizeException();
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                try {
                    int num = Integer.parseInt(arr[i][j]);
                    result += num;
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return result;
    }
}
