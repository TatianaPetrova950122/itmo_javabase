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

    public static void method() {
        NewThread newThread1 = new NewThread();
        newThread1.start();
        NewThread newThread2 = new NewThread();
        newThread2.start();
        NewThread newThread3 = new NewThread();
        newThread3.start();
        NewThread newThread4 = new NewThread();
        newThread4.start();
        NewThread newThread5 = new NewThread();
        newThread5.start();
        NewThread newThread6 = new NewThread();
        newThread6.start();
        NewThread newThread7 = new NewThread();
        newThread7.start();
        NewThread newThread8 = new NewThread();
        newThread8.start();
        NewThread newThread9 = new NewThread();
        newThread9.start();
        NewThread newThread10 = new NewThread();
        newThread10.start();
    }
}
