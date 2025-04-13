package LabWork4_Kozlov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null;
        int size = 0;


        while (true) {
            try {
                System.out.print("Введите размер массива: ");
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("Размер массива должен быть положительным!");
                    continue;
                }
                array = new int[size];
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введена строка вместо числа!");
                scanner.next();
            }
        }

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Неверный тип данных!");
                    scanner.next();
                }
            }
        }

        try {
            double average = calculateAverageOfPositive(array);
            System.out.println("Среднее значение положительных элементов: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: В массиве нет положительных элементов!");
        }
    }

    public static double calculateAverageOfPositive(int[] array) {
        int sum = 0;
        int count = 0;

        for (int num : array) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count == 0) {
            throw new ArithmeticException("Нет положительных элементов");
        }

        return (double) sum / count;
    }
}
