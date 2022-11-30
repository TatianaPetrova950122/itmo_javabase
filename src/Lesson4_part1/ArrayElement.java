package Lesson4_part1;

import java.util.Arrays;

public class ArrayElement {
    public static void match (int[] a){
        String aString = Arrays.toString(a);
        System.out.println(aString);
        boolean firstLast = a[0] == 3 || a[a.length - 1] == 3;
        System.out.println(firstLast);
    }
    public static void main(String[] args) {
        int[] a = {3, -3, 7, 4, 5, 4, 3};
        match(a);
    }
}