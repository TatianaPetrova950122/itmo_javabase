package Lesson6;

import java.util.Scanner;

public class Age {

    public Scanner scanner = new Scanner(System.in);

    private String a;

    public void Skan(){
        System.out.println("Введите возраст пользователя: ");
        a = scanner.nextLine();
        System.out.println("Возраст пользователя: " + a);
    }
}
