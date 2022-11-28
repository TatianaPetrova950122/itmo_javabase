package Lesson4_part2;

import java.util.Arrays;

public class SortNoSort {

    public static void main(String[] args) {
        int[] a = {3, 4, 7, 6, 8, 7, 10};

        for (int n = 0; n < a.length; n++) {
            if (n +1 == a.length) {
                System.out.println("OK");

            } else if (a[n] > a[n + 1]) {
                System.out.println("Please, try again");
                break;
            }
        }
    }
}
