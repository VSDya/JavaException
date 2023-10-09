package Sem3.Task2;

public class Check {
    public static void main(String[] args) {
//        Main m = new Main();
//        System.out.println(m.getCount());
//        try {
//            m.close();
//        } catch (Exception e){
//            // TODO
//        }
//        System.out.println(m.getCount());
        try (Main l = new Main()){
            System.out.println(l.getCount());
        } catch (Exception e){
            // TODO
        }
    }
}
