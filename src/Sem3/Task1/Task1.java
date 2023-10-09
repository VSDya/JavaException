package Sem3.Task1;

// Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
// (тело самого метода прописывать необязательно). Вызовите этот метод из main и обработайте в нём
// исключение, которое вызвал метод doSomething().

public class Task1 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            // ignore
        }
    }
    static void doSomething() throws Exception{

    }
}
