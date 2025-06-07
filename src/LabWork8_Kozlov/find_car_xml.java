package LabWork8_Kozlov;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class find_car_xml {
    public static void main(String[] args) {
        String filePath = "src/LabWork8_Kozlov/cars.xml"; // путь к XML-файлу
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите марку автомобиля для поиска: ");
        String brandToSearch = scanner.nextLine().trim();

        try {
            File xmlFile = new File(filePath);
            if (!xmlFile.exists()) {
                System.out.println("Файл не найден: " + filePath);
                return;
            }

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("car");
            boolean found = false;

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element car = (Element) node;
                    String brand = car.getElementsByTagName("brand").item(0).getTextContent();

                    if (brand.equalsIgnoreCase(brandToSearch)) {
                        found = true;
                        String model = car.getElementsByTagName("model").item(0).getTextContent();
                        String year = car.getElementsByTagName("year").item(0).getTextContent();
                        String price = car.getElementsByTagName("price").item(0).getTextContent();

                        System.out.println("\nНайден автомобиль:");
                        System.out.println("Марка: " + brand);
                        System.out.println("Модель: " + model);
                        System.out.println("Год: " + year);
                        System.out.println("Цена: " + price);
                    }
                }
            }

            if (!found) {
                System.out.println("Автомобили марки \"" + brandToSearch + "\" не найдены.");
            }

        } catch (Exception e) {
            System.out.println("Ошибка при чтении XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
