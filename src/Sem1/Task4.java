package Sem1;//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//        Метод должен пройтись по каждому элементу и проверить что он не равен null.
//        А теперь реализуйте следующую логику:
//        Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

public class Task4 {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] array2 = {1, null, 3, null, null, 6, null, 8, null};

        checkArray(array1);
        checkArray(array2);
//        try {
//            checkArray(array2);
//        }catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println(123);
    }

    public static void checkArray(Integer[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                sb.append(i).append(' ');
        }
        if (sb.length() != 0)
            throw new RuntimeException("В массиве есть значения равные null, индексы которых: " + sb.toString());
    }
}
