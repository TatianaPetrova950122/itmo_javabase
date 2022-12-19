package Multithreading;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Counter.method();
        System.out.println(counter.getCount());
    }

    public static class Counter {
        static int count = 0;


        public static void increment() {
            count = count + 1;
        }


        public int getCount() {
            return count;
        }


        static class NewThread extends Thread {
            @Override
            public void run() {
                int i;
                for (i = 0; i < 1000; i++) {
                    increment();
                }
            }
        }

        public synchronized static void method() throws InterruptedException {
            int a;
            for (a = 0; a < 100; a++) {
                NewThread newThread = new NewThread();
                newThread.start();
                newThread.join();
            }
        }
    }
}