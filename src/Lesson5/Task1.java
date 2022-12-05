package Lesson5;

public class Task1 {
    public static void main(String[] args) {
        String text = "Девять из десяти стоматологов рекомендуют";

        findLongWord(text);
    }
    public static void findLongWord(String text) {

        String[] word = text.split(" ");
        int maxLong = word[0].length();
        int index = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > maxLong) {
                maxLong = word[i].length();
                index = i;
            }
        }
        System.out.println("Самое длинное слово: " + word[index]);
    }
}
