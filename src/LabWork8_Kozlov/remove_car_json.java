package LabWork8_Kozlov;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class remove_car_json{
    public static void main(String[] args) {
        String filePath = "src/LabWork8_Kozlov/cars.json";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год выпуска автомобиля для удаления: ");
        String yearToDelete = scanner.nextLine().trim();

        try {
            JSONParser parser = new JSONParser();
            JSONObject root = (JSONObject) parser.parse(new FileReader(filePath));

            JSONArray carsArray = (JSONArray) root.get("cars");

            Iterator<Object> iterator = carsArray.iterator();
            boolean found = false;

            while (iterator.hasNext()) {
                JSONObject car = (JSONObject) iterator.next();
                String year = (String) car.get("year");
                if (year.equals(yearToDelete)) {
                    iterator.remove();
                    found = true;
                }
            }

            if (found) {
                // Записываем обновленный JSON обратно в файл
                try (FileWriter file = new FileWriter(filePath)) {
                    file.write(root.toJSONString());
                    System.out.println("Автомобили за " + yearToDelete + " год успешно удалены из файла.");
                }
            } else {
                System.out.println("Автомобили за " + yearToDelete + " год не найдены.");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка разбора JSON: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
