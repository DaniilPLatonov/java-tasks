package Udemy_tasks.multiTHreading;

import java.util.Random;

public class Potocs {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 100_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread eas interrupted");
                        break;
                    }
                    ;
                    Math.sin(random.nextDouble());
                }
            }
        });
        System.out.println("Starting thread");
        thread.start();
        thread.interrupt();
        thread.join();
        Thread.sleep(1000);


        System.out.println("Thread has finished");

    }
}
