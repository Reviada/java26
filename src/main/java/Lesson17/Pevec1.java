package Lesson17;

public class Pevec1 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int round = 0;
        while (!needStop) {
            round++;
            if (round>3){
                needStop = true;
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("LA ----------");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //создаем критич.зону
            synchronized (Monitor.MIKROFON){
                Monitor.MIKROFON.notify();//вызываем метод и говорим проснуться тому кто спит

            }
            synchronized (Monitor.MIKROFON){
                try {
                    Monitor.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
