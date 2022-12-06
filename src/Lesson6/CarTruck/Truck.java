package Lesson6.CarTruck;

import java.util.Scanner;

public class Truck extends Car {
    private int rollsNum;
    private int wight;

    public void newWheels() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите новое число колес:");
        rollsNum = scan.nextInt();
    }

    public void outPut() {
        super.outPut();
        System.out.println("Количество колес: " + rollsNum);
        System.out.println("Вес грузовика: " + wight);
    }

    public Truck(int w, String m, char c, float s, int rollsNum, int wight) {
        super(w, m, c, s);
        this.rollsNum = rollsNum;
        this.wight = wight;
    }
}