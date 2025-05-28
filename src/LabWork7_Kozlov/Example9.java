package LabWork7_Kozlov;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example9 {
    public static void main(String[] args) {
        String inputFile = "src/LabWork7_Kozlov/input.txt";
        String outputFile = "src/LabWork7_Kozlov/output.txt";

        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) {

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

            System.out.println("Файл скопирован успешно!");

        } catch (IOException e) {
            System.err.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}
