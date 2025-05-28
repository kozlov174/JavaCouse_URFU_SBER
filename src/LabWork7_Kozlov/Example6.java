package LabWork7_Kozlov;

import java.io.*;

public class Example6 {
    public static void main(String[] args) {
        String inputFileName = "src/LabWork7_Kozlov/input.txt";
        String outputFileName = "src/LabWork7_Kozlov/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter = new PrintWriter(outputFileName)) {

            String line;
            while ((line = reader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);

        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
