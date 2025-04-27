package LabWork5_Kozlov;

import java.util.List;
import java.util.stream.Collectors;

public class Example10 {

    public static List<Integer> filterNumbersLessThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n < threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(15, 8, 23, 6, 12, 19, 3);
        int threshold = 15;

        List<Integer> result = filterNumbersLessThan(numbers, threshold);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа меньше " + threshold + ": " + result);
    }
}
