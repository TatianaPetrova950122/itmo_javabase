package Multithreading;

public class Task2 {
    public static void main(String[] args) {
        method();
    }

    static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println(getState());
        }
    }

    public static void method() {
        NewThread newThread = new NewThread();
        System.out.println(newThread.getState());
        newThread.start();
        try {
            newThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(newThread.getState());
    }
}
