package Lesson5;

public class Task2 {
    public static void main(String[] args) {
        String text = "Лёша на полке клопа нашёл";
        System.out.println(isPalindrome(text));
    }
   static boolean isPalindrome(String text) {
        text = text.replaceAll("\\s","");
        StringBuilder rev = new StringBuilder(text).reverse();
        String strRev = rev.toString();
        if (text.equalsIgnoreCase(strRev)) {
            return true;
        } else {
            return false;
        }
    }
}
