package LabWork8_Kozlov;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class parser_xml {
    public static void main(String[] args) {
        String filePath = "src/LabWork8_Kozlov/cars.xml"; // Путь к XML-файлу
        File xmlFile = new File(filePath);

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите марку автомобиля: ");
            String brand = scanner.nextLine();

            System.out.print("Введите модель: ");
            String model = scanner.nextLine();

            System.out.print("Введите год выпуска: ");
            String year = scanner.nextLine();

            System.out.print("Введите цену: ");
            String price = scanner.nextLine();

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc;
            Element rootElement;

            if (xmlFile.exists()) {
                doc = docBuilder.parse(xmlFile);
                doc.getDocumentElement().normalize();
                rootElement = doc.getDocumentElement();
            } else {
                doc = docBuilder.newDocument();
                rootElement = doc.createElement("cars");
                doc.appendChild(rootElement);
            }

            Element car = doc.createElement("car");

            Element carBrand = doc.createElement("brand");
            carBrand.appendChild(doc.createTextNode(brand));
            car.appendChild(carBrand);

            Element carModel = doc.createElement("model");
            carModel.appendChild(doc.createTextNode(model));
            car.appendChild(carModel);

            Element carYear = doc.createElement("year");
            carYear.appendChild(doc.createTextNode(year));
            car.appendChild(carYear);

            Element carPrice = doc.createElement("price");
            carPrice.appendChild(doc.createTextNode(price));
            car.appendChild(carPrice);

            rootElement.appendChild(car);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(xmlFile);

            transformer.transform(source, result);

            System.out.println("Новый автомобиль успешно добавлен в файл!");

        } catch (Exception e) {
            System.out.println("Ошибка при работе с XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
