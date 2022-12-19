package Lesson10;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Lesson10/file.txt");
        File file2 = new File("src/Lesson10/file2.txt");


        try (FileWriter writer = new FileWriter("src/Lesson10/file3.txt", true)) {
            BufferedReader reader = new BufferedReader((new FileReader(file)));
            BufferedReader reader2 = new BufferedReader((new FileReader(file2)));
            String input;
            String input2;

            while ((input = reader.readLine()) != null) {
                writer.write(input);
                writer.append('\n');
            }

            while ((input2 = reader2.readLine()) != null) {
                writer.write(input2);
                writer.append('\n');
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
