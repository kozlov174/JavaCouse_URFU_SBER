package timus;

import java.util.Scanner;

public class Task_1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        // Разделение строки на число и восклицательные знаки
        int n = Integer.parseInt(input.split(" ")[0]);
        int k = input.split(" ")[1].length();

        long result = computeMultiFactorial(n, k);
        System.out.println(result);
    }

    public static long computeMultiFactorial(int n, int k) {
        long product = 1;
        int current = n;

        while (current >= 1) {
            product *= current;
            current -= k;
            if (current <= 0) {
                break;
            }
        }

        return product;
    }
}