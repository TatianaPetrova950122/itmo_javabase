package Lesson5;

public class Task4 {
    public static void main(String[] args) {
        String text = "И я без конца говорю: простите, извините, простите, извините";
        String text2 = "простите";
        count(text, text2);
    }
    public static void count(String text, String text2) {
        int i = (text.length() - text.replace(text2, "").length()) / text2.length();
        System.out.println(i);
    }
}