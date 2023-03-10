package Udemy_tasks.multiTHreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// для отсчета потоков
public class CountDownlatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 3; i++){
             executorService.submit(new Processor(countDownLatch));
        }

        executorService.shutdown();

countDownLatch.await();
        System.out.println("Latch has been opened, main thread is proceed");

    }
}

class Processor implements  Runnable{
    private  CountDownLatch countDownlatch;

    public Processor(CountDownLatch countDownlatch) {
        this.countDownlatch = countDownlatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        countDownlatch.countDown();
    }
}
