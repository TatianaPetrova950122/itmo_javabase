package Lesson10;

import java.io.*;

public class Task4 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Lesson10/file.txt");

        try (FileWriter writer = new FileWriter("src/Lesson10/file4.txt", true)) {
            BufferedReader reader = new BufferedReader((new FileReader(file)));
            String input;

            while ((input = reader.readLine()) != null) {
                writer.write(input.replaceAll("\\W", "\\$"));
                writer.append('\n');
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
