package Lesson5;

public class Task3 {
    public static void main(String[] args) {
        String text = "Если бяка подобрана с земли, то бяка не должна потом оказаться во рту";
        cenz(text);
    }
    public static void cenz (String text){
        text = text.replace("бяка","[вырезано цензурой]");
        System.out.println(text);
    }
}