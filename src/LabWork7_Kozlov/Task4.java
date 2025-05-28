package LabWork7_Kozlov;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/LabWork7_Kozlov/input.txt");
        FileWriter writer = new FileWriter("src/LabWork7_Kozlov/output.txt");

        int c;
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }

        reader.close();
        writer.close();
        System.out.println("Файл скопирован успешно!");
    }
}
