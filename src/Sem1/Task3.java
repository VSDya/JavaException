package Sem1;//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//Необходимо посчитать и вернуть сумму элементов этого массива.
//При этом накладываем на метод 2 ограничения:
//  метод может работать только с квадратными массивами (кол-во строк и кол-во столбцов),
//  и в каждой ячейке может лежать только значение 0 или 1.
//Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

public class Task3 {
    public static void main(String[] args) {
        int[][] array = {{1,0,1,0,1},{1,0,1,0,1},{1,0,1,0,1},{1,0,1,0,1},{1,0,1,0,1}};
        int[][] array1 = {{1,0,1,0,1},{1,0,1,0,1},{1,0,1,0,1},{1,0,1,0,1}};
        int[][] array2 = {{1,0,1,0,1},{1,0,8,0,1},{1,0,1,0,1},{1,0,1,0,1},{1,0,1,0,1}};
        System.out.println(sumBinaryValue(array));
//        System.out.println(sumBinaryValue(array1));
        System.out.println(sumBinaryValue(array2));
    }

    public static int sumBinaryValue(int[][] array){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) throw new RuntimeException("Массив не квадратный (" + array.length +
                    "x" + array[i].length + ")");
            for (int j = 0; j < array.length; j++) {
               if (array[i][j] != 0 & array[i][j] != 1) throw new RuntimeException("Элемент с индексом - " + i + " "
                    + j + " имеет значение " + array[i][j]);
               sum += array[i][j];
            }
        }
        return sum;
    }
}
