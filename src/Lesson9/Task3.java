package Lesson9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        compare2Lists();
    }

    public static void compare2Lists() {
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();
        final int A = 1000000;
        final int B = 1000;
        for (int i = 0; i < A; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < B; i++) {
            arrayList.get((int) (Math.random() * (A - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < B; i++) {
            linkedList.get((int) (Math.random() * (A - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
