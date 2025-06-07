package LabWork8_Kozlov;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class remove_car_xml {
    public static void main(String[] args) {
        String filePath = "src/LabWork8_Kozlov/cars.xml";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год выпуска автомобиля для удаления: ");
        String yearToDelete = scanner.nextLine().trim();

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

            NodeList carList = doc.getElementsByTagName("car");
            boolean found = false;

            for (int i = carList.getLength() - 1; i >= 0; i--) {
                Element car = (Element) carList.item(i);
                String year = car.getElementsByTagName("year").item(0).getTextContent();

                if (year.equals(yearToDelete)) {
                    car.getParentNode().removeChild(car);
                    found = true;
                }
            }

            if (found) {
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");

                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(xmlFile);
                transformer.transform(source, result);

                System.out.println("Автомобили за " + yearToDelete + " год успешно удалены из файла.");
            } else {
                System.out.println("Автомобили за " + yearToDelete + " год не найдены.");
            }

        } catch (Exception e) {
            System.out.println("Ошибка при работе с XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

