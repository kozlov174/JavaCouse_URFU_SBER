package LabWork7_Kozlov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new FileReader("src/LabWork7_Kozlov/input.txt"));

        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }

        reader.close();
        System.out.println("Количество строк в файле: " + lineCount);
    }
}
