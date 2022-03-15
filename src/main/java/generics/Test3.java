package generics;
//НЕФИГА НЕПОНЯТНО
public class Test3 {
    private Integer a = 10;
    public static void main(String[] args) {
        Test3 test3=new Test3();

        A b = new A();
        Thread thread = new Thread(new Runnable() {
            String string = "klkk";
            @Override
            public void run() {
                System.out.println(test3.a);
            }
        });
        //thread.start(); //запускаем ПОТОК
        // Если нужно просто запустить поток(без имени) анонимный класс
    }
}

class A implements Runnable {

    @Override
    public void run() {
        System.out.println("iouoiu");
    }
}