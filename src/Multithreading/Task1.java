package Multithreading;

public class Task1 {
    public static void main(String[] args) {
        method();
    }

    static class NewThread extends Thread {

        @Override
        public void run() {
            int i;
            for (i = 0; i <= 100; i++) {
                System.out.println(i);
            }
        }
    }

    public synchronized static void method() {
        int a;
        for (a = 0; a < 10; a++) {
            NewThread newThread = new NewThread();
            newThread.start();
        }
    }
}
