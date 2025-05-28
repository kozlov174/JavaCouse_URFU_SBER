package LabWork7_Kozlov;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example7 {
    public static void main(String[] args) {
        Person person = new Person("Ivan Ivanov", 49);

        String serializeFile = "src/LabWork7_Kozlov/person.ser";
        String deserializeFile = "src/LabWork7_Kozlov/person_copy.ser";

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(serializeFile))) {

            out.writeObject(person);
            System.out.println("Объект сериализован в файл: " + serializeFile);

        } catch (IOException e) {
            System.err.println("Ошибка при сериализации: " + e.getMessage());
        }

        try {
            Files.copy(Paths.get(serializeFile), Paths.get(deserializeFile));

            try (ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(deserializeFile))) {

                Person deserializedPerson = (Person) in.readObject();
                System.out.println("\nОбъект десериализован из файла:");
                System.out.println("Имя: " + deserializedPerson.getName());
                System.out.println("Возраст: " + deserializedPerson.getAge());

            } catch (ClassNotFoundException e) {
                System.err.println("Класс Person не найден: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}