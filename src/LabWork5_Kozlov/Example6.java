package LabWork5_Kozlov;

import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static List<Integer> filterDivisibleNumbers(List<Integer> numbers, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return numbers.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35);
        int divisor = 10;

        List<Integer> result = filterDivisibleNumbers(numbers, divisor);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа, делящиеся на " + divisor + ": " + result);
    }
}