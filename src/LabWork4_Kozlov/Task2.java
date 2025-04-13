package LabWork4_Kozlov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            System.out.println("Исходная матрица:");
            printMatrix(matrix);

            int columnIndex = -1;
            while (true) {
                try {
                    System.out.print("Введите номер столбца (начиная с 0): ");
                    columnIndex = scanner.nextInt();

                    if (columnIndex < 0) {
                        System.out.println("Ошибка: Номер столбца не может быть отрицательным!");
                        continue;
                    }

                    // Попытка вывести столбец
                    System.out.println("Столбец " + columnIndex + ":");
                    printColumn(matrix, columnIndex);
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Введена строка вместо числа!");
                    scanner.next();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Ошибка: Столбца с номером " + columnIndex + " не существует!");
                }
            }
        }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

        public static void printColumn(int[][] matrix, int columnIndex) {
            for (int[] row : matrix) {
                System.out.println(row[columnIndex]);
            }
        }
}
