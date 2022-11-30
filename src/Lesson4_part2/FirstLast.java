package Lesson4_part2;

import java.util.Arrays;

public class FirstLast {
    public static void change(int[] list) {
        int a1 = list[0];
        int a2 = list[list.length - 1];
        list[0] = a2;
        list[list.length - 1] = a1;
    }

    public static void main(String[] args) {
        int[] list = {6, 8, 2, 5, 5};
        System.out.println("Array 1: " + Arrays.toString(list));
        change(list);
        System.out.println("Array 2: " + Arrays.toString(list));
    }
}
