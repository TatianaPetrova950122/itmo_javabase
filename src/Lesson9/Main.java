package Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> player = new HashMap<>();
        player.put(gamer(), points());
        System.out.println(player);
    }

    public static String gamer() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя игрока: ");
        String name = reader.readLine();
        return name;
    }

    public static int points() {
        int point = (int) (Math.random() * 100);
        System.out.println(point);
        return point;
    }
}

