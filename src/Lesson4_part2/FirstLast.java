package Lesson4_part2;

import java.util.Arrays;
import java.util.List;

public class FirstLast {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 8, 2, 5, 5);
        System.out.println(list);
        listSwap(list);
        System.out.println(list);
    }

    public static <T> List<T> listSwap(List<T> list) {
        List<T> tempList = list;
        T firstElement = tempList.get(0);
        T lastElement = tempList.get(list.size() - 1);
        tempList.set(0, lastElement);
        tempList.set(tempList.size() - 1, firstElement);
        return tempList;
    }
}
