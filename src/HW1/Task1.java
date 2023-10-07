package HW1;

// Метод вызывающий исключение при выходе за пределы массива.
public class Task1 {
    public static void main(String[] args) {
        try{
            testArray();
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }

    private static void testArray() {
        int[] arr = {0,1,2,3,4};
        System.arraycopy(arr, 5, arr, 0, 1);
    }
}
