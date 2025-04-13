package LabWork4_Kozlov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] array = null;
        int size = 0;

        while (true) {
            try {
                System.out.print("Введите размер массива: ");
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("Размер массива должен быть положительным!");
                    continue;
                }
                array = new byte[size];
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введена строка вместо числа!");
                scanner.next();
            }
        }

        System.out.println("Введите элементы массива (числа от -128 до 127):");
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    int input = scanner.nextInt();
                    if (input < Byte.MIN_VALUE || input > Byte.MAX_VALUE) {
                        System.out.println("Ошибка: Число выходит за границы типа byte (-128..127)!");
                        continue;
                    }
                    array[i] = (byte) input;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Введена строка вместо числа!");
                    scanner.next();
                }
            }
        }

        try {
            byte sum = calculateByteSum(array);
            System.out.println("Сумма элементов: " + sum);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Переполнение типа byte при вычислении суммы!");
        }
    }

    public static byte calculateByteSum(byte[] array) {
        int sum = 0;

        for (byte num : array) {
            sum += num;
            if (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE) {
                throw new ArithmeticException("Переполнение byte");
            }
        }

        return (byte) sum;
    }
}
