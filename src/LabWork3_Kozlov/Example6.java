package LabWork3_Kozlov;

import java.util.Scanner;

public class Example6 {
    public static void toBinary(int n) {
        if (n > 1) {
            toBinary(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        System.out.print("Двоичное представление: ");
        toBinary(number);

        scanner.close();
    }
}
