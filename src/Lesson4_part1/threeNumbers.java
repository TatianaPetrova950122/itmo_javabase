package Lesson4_part1;

import java.util.Scanner;

public class threeNumbers {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        a = in.nextInt();

        System.out.print("Введите второе число: ");
        b = in.nextInt();

        System.out.print("Введите третье число: ");
        c = in.nextInt();

        int realSum = a + b;

        System.out.print("Результат: "+result(c, realSum, true));
    }

    public static boolean result(int c, int realSum, boolean result)
    {
        if(result)
            return (c == realSum);
        return (true);
    }
}
