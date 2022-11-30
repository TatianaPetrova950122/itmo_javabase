package Lesson4_part2;

import java.util.Arrays;
import java.util.Scanner;

public class ScanArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Numbers of array: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Result: " + Arrays.toString(array));
    }
}
