package Lesson4_part1;

import java.util.Scanner;

public class threeNumbers {

    public static void res () {
        int a;
        int b;
        int c;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        a = in.nextInt();

        System.out.print("Введите второе число: ");
        b = in.nextInt();

        System.out.print("Введите третье число: ");
        c = in.nextInt();

        boolean r = a+b == c;
        System.out.println("Результат: " + r);
    }

    public static void main(String[] args) {
        res();
    }
}
