package Lesson4_part1;

import java.util.Scanner;

public class СompetingNumbers {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        a = in.nextInt();

        System.out.print("Введите второе число: ");
        b = in.nextInt();

        System.out.print("Введите третье число: ");
        c = in.nextInt();

        System.out.print("Результат: "+result(c, b, c,true));
    }

    public static boolean result(int a, int b, int c, boolean abc)
    {
        if(abc)
            return (b > a && c > b);
        return (true);
    }
}
