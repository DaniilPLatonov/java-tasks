package Udemy_tasks.multiTHreading;

import java.util.LinkedList;
import java.util.Queue;

public class WaitNotify {


    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;

        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }

/*        synchronized (this) {
            System.out.println("Producer thread started...");
            wait();// 1 - выходит из синхронизованого блока, и отдает этот обьект
            //другим потокам, 2- ждем, пока будет вызван notify именно наэтом обьекте
            System.out.println("Producer thread resumed...");
        }*/

    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while(queue.size() == 0){
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                lock.notify();
            }

            Thread.sleep(1000);
        }


/*         Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this){
            System.out.println("Waiting for return pressed");
            scanner.nextLine();
            notify();
        }*/
    }
}