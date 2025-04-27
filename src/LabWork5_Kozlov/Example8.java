package LabWork5_Kozlov;

import java.util.List;
import java.util.stream.Collectors;

public class Example8 {

    public static List<Integer> filterNumbersGreaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 3, 8, 15, 7, 20);
        int threshold = 10;

        List<Integer> result = filterNumbersGreaterThan(numbers, threshold);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа больше " + threshold + ": " + result);
    }
}