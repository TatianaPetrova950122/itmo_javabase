package Lesson4_part2;

public class Unicue {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4};
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(array[i] + " ");
                break;
            }
        }
    }
}