package Udemy_tasks.multiTHreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Semaphore2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Connection connection = Connection.getConnection();
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.doWorkWitnSemaphore();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
/*     Semaphore semaphore = new Semaphore(3);// разрешение на 3 ресурса

        try {

            semaphore.acquire();// когда в пот
            // оке начинаем
            // взаимодействовать с ресурсом
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release();// отдаем разрешения когда в потоке заканчиваем использовать ресурс
        System.out.println(semaphore.availablePermits());// количество разрешений,
        // которые у нас свободны*/
    }
}

//Singleton
class Connection {
    private static Connection connection = new Connection();
    private int connectionCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() {

    }

    public static Connection getConnection() {
        return connection;
    }

    public void doWorkWitnSemaphore() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionCount++;
            System.out.println(connectionCount);
        }
        Thread.sleep(5000);

        synchronized (this) {
            connectionCount--;
        }
    }

}
