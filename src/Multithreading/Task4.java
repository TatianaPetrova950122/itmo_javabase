package Multithreading;

public class Task4 {
    public static void main(String[] strings) throws Exception {
        Object lock = new Object();
        new StepThread(lock).start();
        new StepThread(lock).start();
    }

    static class StepThread extends Thread {

        private final Object lock;

        public StepThread(Object object) {
            this.lock = object;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    try {
                        System.out.println(getName());
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
