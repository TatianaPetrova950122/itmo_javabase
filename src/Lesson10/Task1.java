package Lesson10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/Lesson10/file.txt");

        try (BufferedReader reader = new BufferedReader((new FileReader(file)))) {
            String input;

            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
