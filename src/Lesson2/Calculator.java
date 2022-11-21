package Lesson2;

public class Calculator {

    static int sum(int x, int y) {
        return x + y;
    }

    static double sum(double x, double y) {
        return x + y;
    }

    static long sum(long x, long y) {
        return x + y;
    }


    static int sub(int x, int y) {
        return x - y;
    }

    static double sub(double x, double y) {
        return x - y;
    }

    static long sub(long x, long y) {
        return x - y;
    }


    static int mult(int x, int y) {
        return x * y;
    }

    static double mult(double x, double y) {
        return x * y;
    }

    static long mult(long x, long y) {
        return x * y;
    }


    static int div(int x, int y) {
        return x / y;
    }

    static double div(double x, double y) {
        return x / y;
    }

    static long div(long x, long y) {
        return x / y;
    }

    public static void main(String[] args) {

        System.out.println(sum(4, 5));
        System.out.println(sum(4.8, 2.2));
        System.out.println(sum(3, 9));
        System.out.println(sub(4, 5));
        System.out.println(sub(4.8, 2.2));
        System.out.println(sub(3, 9));
        System.out.println(mult(4, 5));
        System.out.println(mult(4.8, 2.2));
        System.out.println(mult(3, 9));
        System.out.println(div(4, 5d));
        System.out.println(div(4.8, 2.2));
        System.out.println(div(3L, 9));
    }
}