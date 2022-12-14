package Lesson7;

import java.util.Scanner;

public class Airplane {
    public static void main(String[] args) {
        Wing wing = new Wing();
        Wing wing2 = new Wing();
        wing.scan();
        wing2.scan();
        wing.infoWing();
        wing2.infoWing();
    }
}

class Wing {
    int weight;

    public int scan() {
        Scanner scan = new Scanner(System.in);
        weight = scan.nextInt();
        return weight;
    }

    public void infoWing() {
        System.out.println(weight);
    }
}