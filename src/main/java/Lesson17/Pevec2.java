package Lesson17;

public class Pevec2 extends Thread{
    @Override
    public void run() {
        synchronized (Monitor.MIKROFON){
            try {
                Monitor.MIKROFON.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (true) {//бесконечный цикл
            for (int i = 0; i < 3; i++) {
                System.out.println("----------FA");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //создаем критич.зону
            synchronized (Monitor.MIKROFON){
                Monitor.MIKROFON.notify();//вызываем метод и говорим проснуться тому кто спит
            }

        }
    }
}

