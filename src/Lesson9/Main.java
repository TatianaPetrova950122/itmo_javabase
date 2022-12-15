package Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        player.put(gamer(), points());
        player.put(gamer(), points());
        System.out.println(player);
        key();
    }

    public static Map<String, Integer> player = new HashMap<>();

    public static String gamer() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя игрока: ");
        String name = reader.readLine();
        return name;
    }

    public static int points() {
        int point = (int) (Math.random() * 100);
        return point;
    }

    public static void key() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя игрока: ");
        String a = reader.readLine();
        System.out.println(player.get(a));
    }
}
