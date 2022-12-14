package Lesson9;

import java.util.*;

public class Task2 {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
