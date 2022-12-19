package Multithreading;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Counter.method();
        Thread.sleep(1000);
        System.out.println(counter.getCount());
    }

    public static class Counter {
        static int count = 0;

        public synchronized static void increment() {
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

            NewThread(String name) {
                super(name);
            }
        }

        public static void method() {
            int a;
            for (a = 0; a < 100; a++) {
                new NewThread("newThread" + a).start();

            }
        }
    }
}