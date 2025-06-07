package LabWork8_Kozlov;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.util.Scanner;

public class find_car_json {
    public static void main(String[] args) {
        String filePath = "src/LabWork8_Kozlov/cars.json"; // путь к JSON-файлу
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите марку автомобиля для поиска: ");
        String brandToSearch = scanner.nextLine().trim();

        try {
            JSONParser parser = new JSONParser();
            JSONObject root = (JSONObject) parser.parse(new FileReader(filePath));

            JSONArray carsArray = (JSONArray) root.get("cars");

            boolean found = false;
            for (Object obj : carsArray) {
                JSONObject car = (JSONObject) obj;
                String brand = (String) car.get("brand");

                if (brand.equalsIgnoreCase(brandToSearch)) {
                    found = true;
                    String model = (String) car.get("model");
                    String year = (String) car.get("year");
                    String price = (String) car.get("price");

                    System.out.println("\nНайден автомобиль:");
                    System.out.println("Марка: " + brand);
                    System.out.println("Модель: " + model);
                    System.out.println("Год: " + year);
                    System.out.println("Цена: " + price);
                }
            }

            if (!found) {
                System.out.println("Автомобили марки \"" + brandToSearch + "\" не найдены.");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка разбора JSON: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
