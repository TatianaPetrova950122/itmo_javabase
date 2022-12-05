package Lesson6;

public class Name extends Age{

    private String name;

    public void Skan(){
        System.out.println("Введите имя пользователя: ");
        name = scanner.nextLine();
        System.out.println("Имя пользователя: " + name);
    }
}
