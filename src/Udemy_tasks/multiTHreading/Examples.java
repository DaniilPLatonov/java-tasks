package Udemy_tasks.multiTHreading;

import java.util.Arrays;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {

    }
}

//способ 1 создания потока
class HelloThread extends Thread {
    @Override
    public void run() {
        String helloMsg = String.format("Hello, i'm %s", getName());
        System.out.println(helloMsg);
    }
}
//способ 2 создания потока

class HelloRunnable implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String helloMsg = String.format("Hello, i'm %s", threadName);
        System.out.println(helloMsg);
    }
}

class NumbersThread extends Thread {

    int from, to;

    public NumbersThread(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }

    // you should override some method here
}


class MessageNotifier extends Thread {

    String msg;
    int repeats;

    public MessageNotifier(String msg, int repeats) {
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        for(int i = 1; i < repeats; i++){
            System.out.println(repeats);
        }
    }
}

class Starter {

    public static void startRunnables(Runnable[] runnables) {
        Arrays.stream(runnables).forEach(i -> new Thread(i).start());
    }
}


 class Main {

    private static long mainThreadId = Thread.currentThread().getId();

    // Fix this method
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Thread processor = new SlowStringProcessor(str);
        processor.start();
    }

    //Don't change the code below
    static class SlowStringProcessor extends Thread {

        private final String s;
        private volatile long numberOfUniqueCharacters = 0;

        public SlowStringProcessor(String s) {
            this.s = s;
        }

        @Override
        public void run() {

            final long currentId = Thread.currentThread().getId();

            if (currentId == mainThreadId) {
                throw new RuntimeException("You must start a new thread!");
            }

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException("Do not interrupt the processor", e);
            }

            this.numberOfUniqueCharacters = Arrays.stream(s.split("")).distinct().count();
            System.out.println(numberOfUniqueCharacters);
        }

        public long getNumberOfUniqueCharacters() {
            return numberOfUniqueCharacters;
        }
    }
}