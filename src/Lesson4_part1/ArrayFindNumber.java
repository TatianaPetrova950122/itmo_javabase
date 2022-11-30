package Lesson4_part1;

import java.util.Arrays;

public class ArrayFindNumber {

    public static void find (int [] a) {
        System.out.println(Arrays.toString(a));
        boolean b = a[0] == 3 || a[a.length-1] == 3;
        System.out.println(b);
        }

    public static void main(String[] args) {
        int[] a = {3, -3, 7, 4, 5, 4, 3};
        find (a);
         }
    }