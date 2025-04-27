package LabWork5_Kozlov;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("Java", "Python", "C++", "JavaScript", "Go", "Rust");
        int minLength = 3;

        List<String> result = filterStringsByLength(words, minLength);

        System.out.println("Исходный список: " + words);
        System.out.println("Строки длиннее " + minLength + " символов: " + result);
    }
}
