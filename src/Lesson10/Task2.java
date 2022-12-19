package Lesson10;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("src/Lesson10/file2.txt", true)) {
            String text = "Мама мыла раму";
            writer.write(text);
            writer.append('\n');

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}