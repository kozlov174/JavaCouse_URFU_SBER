package LabWork5_Kozlov;

import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static List<String> filterLettersOnly(List<String> strings) {
        return strings.stream()
                .filter(s -> s != null && !s.isEmpty() && s.matches("^[a-zA-Zа-яА-Я]+$"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("Hello", "W0rld", "Привет", "123", "Java!", "Код", "");

        List<String> result = filterLettersOnly(words);

        System.out.println("Исходный список: " + words);
        System.out.println("Строки только с буквами: " + result);
    }
}
