package Lesson3;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Home {
    private int floors;
    private int year;
    private String name;

    public Home() {

    }

    public void setInfo (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите наименование");
        name = scanner.nextLine();
        System.out.println("Введите количество этажей");
        floors = scanner.nextInt();
        System.out.println("Введите год постройки");
        year = scanner.nextInt();

    }

    public void info (){
        System.out.println("Количество этажей - " + floors);
        System.out.println("Год постройки - " + year);
        System.out.println("Наименование - " + name);
    }

    public void calculateAge (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий год");
        int date = scanner.nextInt();
        System.out.println("Возраст здания - " + (date - year));
    }
    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
