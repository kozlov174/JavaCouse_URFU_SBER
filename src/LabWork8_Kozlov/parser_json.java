package LabWork8_Kozlov;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class parser_json {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "src/LabWork8_Kozlov/cars.json";

        JSONObject garage = new JSONObject();
        JSONArray cars = new JSONArray();

        System.out.print("Введите марку автомобиля: ");
        String brand = scanner.nextLine();

        System.out.print("Введите модель: ");
        String model = scanner.nextLine();

        System.out.print("Введите год выпуска: ");
        String year = scanner.nextLine();

        System.out.print("Введите цену: ");
        String price = scanner.nextLine();

        JSONObject car = new JSONObject();
        car.put("brand", brand);
        car.put("model", model);
        car.put("year", year);
        car.put("price", price);

        cars.add(car);
        garage.put("cars", cars);

        try (FileWriter file = new FileWriter(filePath)) {
            file.write(garage.toJSONString());
            System.out.println("Автомобиль успешно записан в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}

