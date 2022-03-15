package Lesson17;
//МНОГОПОТОЧНОСТЬ
public class Main {
    public static void main(String[] args) {
        //2 способ
//        MyThread myThread = new MyThread();
//        myThread.start();//запускаем два потока одновременно

        Thread myTread = new Thread(new MyThread());
        myTread.start();
        //1 поток
        for (int i = 0; i<10; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
