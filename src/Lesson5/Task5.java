package Lesson5;

public class Task5 {
    public static void main(String[] args) {
        String text = "sihT si a tset gnirts";
        rev(text);
    }
    public static void rev(String text) {
        System.out.println("Текст для разворота: " + text);
        String[] splittext = text.split(" ");
        for (int i = 0; i < splittext.length; i++) {
            splittext[i] = new StringBuilder(splittext[i]).reverse().toString();
        }
        System.out.print("Результат:");
        for (int i = 0; i < splittext.length; i++) {
            System.out.print(" " + splittext[i]);
        }
    }
}